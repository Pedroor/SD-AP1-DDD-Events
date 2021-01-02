package com.distance.route.stream

import com.distance.route.domain.Coordinate
import com.distance.route.domain.LastCoordinate

data class NotificationDto(
        val coordinate:Coordinate,
        val lastCoordinate: LastCoordinate
)