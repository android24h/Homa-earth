package com.ahf2025.myapplication.data.mapper

import com.ahf2025.myapplication.data.local.entity.DailyEntryEntity
import com.ahf2025.myapplication.domain.model.DailyEntry

fun DailyEntry.toDataModel(): DailyEntryEntity {
    return DailyEntryEntity(
        id = id,
        userId = userId,
        date = date,
        sleep = sleep,
        waterIntakeMl = waterIntakeMl,
        activityMinutes = activityMinutes,
        weight = weight,
        createdAt= createdAt

    )

}

fun DailyEntryEntity.toDomainModel(): DailyEntry{
    return DailyEntry(
        id = id,
        userId = userId,
        date = date,
        sleep = sleep,
        waterIntakeMl = waterIntakeMl,
        activityMinutes = activityMinutes,
        weight = weight,
        createdAt= createdAt
    )
}