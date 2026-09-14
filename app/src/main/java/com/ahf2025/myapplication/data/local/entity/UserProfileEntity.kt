package com.ahf2025.myapplication.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ahf2025.myapplication.data.enumsClass.Gender
import com.ahf2025.myapplication.data.enumsClass.SmokingStatus
import java.time.LocalDate

@Entity(tableName = "profileTable")
data class UserProfileEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo("firstName")
    val firstName: String,
    @ColumnInfo("lastName")
    val lastName: String,
    @ColumnInfo("birthDate")
    val birthDate: LocalDate,
    @ColumnInfo("gender")
    val gender: Gender,
    @ColumnInfo("smoking")
    val smoking: SmokingStatus,
    @ColumnInfo("height")
    val height: Int,
    @ColumnInfo("weight")
    val weight: Float,
    @ColumnInfo("created_at")
    val createdAt: Long = System.currentTimeMillis()
)
