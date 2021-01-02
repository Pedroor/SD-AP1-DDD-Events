package com.distance.route.repository

import com.distance.route.domain.AwayEquipment
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface AwayEquipmentRepository:JpaRepository<AwayEquipment, Int> {

    fun getAwayEquipmentByRoute_Id(id:Int):Optional<AwayEquipment>
}