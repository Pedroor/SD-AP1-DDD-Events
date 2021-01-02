package com.distance.route.domain

import java.util.*
import javax.persistence.*

@Entity
class LastCoordinateMobile(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id:Int?=null,
        @OneToOne
        @JoinColumn(name = "mobile_equipment_id", referencedColumnName = "id")
        val mobileEquipment: Equipment,
        val latitude:Double,
        val longitude:Double,
        val `when`: Date = Date(),
        @OneToOne
        @JoinColumn(name = "route_id", referencedColumnName = "id")
        val route: Route
)