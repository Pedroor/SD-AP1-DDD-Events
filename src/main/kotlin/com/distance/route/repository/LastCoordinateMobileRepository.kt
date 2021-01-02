package com.distance.route.repository

import com.distance.route.domain.LastCoordinateMobile
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface LastCoordinateMobileRepository:JpaRepository<LastCoordinateMobile, Int> {
    fun getLastCoordinateMobileByMobileEquipment_Id(id:Int):Optional<LastCoordinateMobile>
}