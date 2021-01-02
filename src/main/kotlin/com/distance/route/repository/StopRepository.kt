package com.distance.route.repository

import com.distance.route.domain.Stop
import org.springframework.data.jpa.repository.JpaRepository


interface StopRepository :JpaRepository<Stop,Int>{
}