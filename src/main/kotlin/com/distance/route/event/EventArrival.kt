package com.distance.route.event

import com.distance.route.domain.Event
import com.distance.route.domain.enum.EventType
import com.distance.route.repository.EventRepository
import com.distance.route.repository.RouteRepository
import com.distance.route.repository.StopRepository
import com.distance.route.stream.NotificationDto
import com.distance.route.util.haversineDistance
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.util.*

const val geoFence = 0.05

@Component
class EventArrival(
        private val routeRepository: RouteRepository,
        private val eventRepository: EventRepository,
        private val stopRepository: StopRepository
): Observer{
    private val log = LoggerFactory.getLogger(EventArrival::class.java)


    fun processCoordinate(notificationDto: NotificationDto){
        val coordinate = notificationDto.coordinate

            val route = routeRepository.getRouteByEquipment_Id(notificationDto.coordinate.equipmentId).get()
            route.stops.filter { stop ->
                val distance = haversineDistance(stop.latitude, stop.longitude, coordinate.latitude, coordinate.longitude)
                stop.arrivalAt == null && distance <= geoFence
            }.map {
                val updateStop = it.copy(arrivalAt = Date())
                stopRepository.save(updateStop)
                log.info("==========================================")
                log.info("Driver Arrival on Stop [{}]", it.address)
                log.info("========================================\n")
                val newEvent = Event(eventType = EventType.ARRIVE, `when` = Date(), stopId = it.id )
                eventRepository.save(newEvent)
            }

    }

    override fun update(o: Observable?, notificationDto: Any?) {
        if(notificationDto != null && notificationDto is NotificationDto){
            processCoordinate(notificationDto as NotificationDto)
        }
    }


}