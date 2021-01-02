package com.distance.route.domain
import java.util.*
import javax.persistence.*

@Entity
data class LastCoordinate(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id:Int?=null,
        @OneToOne
        @JoinColumn(name = "equipment_id", referencedColumnName = "id")
        val equipment: Equipment,
        val latitude:Double,
        val longitude:Double,
        val `when`: Date = Date(),
        @OneToOne
        @JoinColumn(name = "route_id", referencedColumnName = "id")
        val route: Route


)