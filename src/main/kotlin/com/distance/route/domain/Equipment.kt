package com.distance.route.domain

import com.distance.route.domain.enum.EquipmentType
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Equipment(
        @Id
        val id:Int,
        val type: EquipmentType?=null
)