package com.distance.route.domain

import java.util.*

data class Coordinate(
        val equipmentId: Int,
        val latitude:Double,
        val longitude:Double,
        val datePing:Date
)