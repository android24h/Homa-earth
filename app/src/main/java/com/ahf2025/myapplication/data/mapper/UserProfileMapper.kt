package com.ahf2025.myapplication.data.mapper

import com.ahf2025.myapplication.data.local.entity.UserProfileEntity
import com.ahf2025.myapplication.domain.model.UserProfile

fun UserProfile.toDataModel(): UserProfileEntity {
    return UserProfileEntity(
        id = id,
        firstName = firstName,
        lastName = lastName,
        birthDate = birthDate,
        gender = gender,
        smoking = smoking,
        height = height,
        weight = weight,
        createdAt = createdAt
    )

}

fun UserProfileEntity.toDomainModel(): UserProfile{
    return UserProfile(
        id = id,
        firstName = firstName,
        lastName = lastName,
        birthDate = birthDate,
        gender = gender,
        smoking = smoking,
        height = height,
        weight = weight,
        createdAt= createdAt
    )
}

