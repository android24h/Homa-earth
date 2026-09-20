package com.ahf2025.myapplication.domain.model

import java.time.LocalDate

data class DailyEntry(

    val id: Int = 0,
    val userId: Int,
    val date: LocalDate,
    val sleep: Float,
    val waterIntakeMl: Int,
    val activityMinutes: Int,
    val weight: Float,
    val createdAt: Long= System.currentTimeMillis()

)
