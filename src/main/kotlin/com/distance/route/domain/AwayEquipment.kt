package com.distance.route.domain

import java.util.*
import javax.persistence.*

@Entity
class AwayEquipment(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id:Int?=null,
        @OneToOne
        @JoinColumn(name="route_id", referencedColumnName = "id")
        val route: Route,
        val `when`: Date=Date()
)