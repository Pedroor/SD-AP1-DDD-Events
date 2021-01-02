package com.distance.route.repository

import com.distance.route.domain.Route
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface RouteRepository: JpaRepository<Route, Int>{
    fun getRouteByEquipment_Id(equipmentId:Int):Optional<Route>
    fun getRouteByMobileEquipment_Id(equipmentId:Int):Optional<Route>
}
