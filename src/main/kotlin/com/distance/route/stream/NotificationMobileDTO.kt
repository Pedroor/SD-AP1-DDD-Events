package com.distance.route.stream

import com.distance.route.domain.LastCoordinate
import com.distance.route.domain.LastCoordinateMobile

data class NotificationMobileDTO (
        val lastCoordinateMobile: LastCoordinateMobile,
        val lastCoordinate: LastCoordinate
)