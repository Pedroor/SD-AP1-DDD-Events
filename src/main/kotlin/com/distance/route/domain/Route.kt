package com.distance.route.domain

import java.util.*
import javax.persistence.*

@Entity
data class Route (
        @Id
        val id:Int,
        val name:String,
        @OneToOne(cascade = [CascadeType.ALL])
        @JoinColumn(name = "equipment_id", referencedColumnName = "id")
        val equipment: Equipment,
        @OneToOne(cascade = [CascadeType.ALL])
        @JoinColumn(name = "mobile_equipment_id", referencedColumnName = "id")
        val mobileEquipment: Equipment,
        @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true, fetch = FetchType.EAGER)
        @JoinColumn(name="stop_id", referencedColumnName = "id")
        val stops: List<Stop>,
        val datePlans:Date
)