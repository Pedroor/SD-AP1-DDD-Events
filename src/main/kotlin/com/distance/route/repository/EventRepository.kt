package com.distance.route.repository

import com.distance.route.domain.Event
import org.springframework.data.jpa.repository.JpaRepository

interface EventRepository:JpaRepository<Event,Int> {
}