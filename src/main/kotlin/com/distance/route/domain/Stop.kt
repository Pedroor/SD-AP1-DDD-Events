package com.distance.route.domain

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Stop(
        @Id
        val id:Int,
        val latitude: Double,
        val longitude:Double,
        val arrivalAt:Date?=null,
        val departureAt:Date?=null,
        val address: String
)