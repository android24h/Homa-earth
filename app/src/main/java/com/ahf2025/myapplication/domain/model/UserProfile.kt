package com.ahf2025.myapplication.domain.model

import com.ahf2025.myapplication.domain.enumClass.Gender
import com.ahf2025.myapplication.domain.enumClass.SmokingStatus
import java.time.LocalDate

data class UserProfile(
    val id: Int = 0,
    val firstName: String,
    val lastName: String,
    val birthDate: LocalDate,
    val gender: Gender,
    val smoking: SmokingStatus,
    val height: Int,
    val weight: Float,
    val createdAt: Long = System.currentTimeMillis()
)