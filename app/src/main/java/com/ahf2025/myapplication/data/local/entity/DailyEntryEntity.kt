package com.ahf2025.myapplication.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(
    tableName = "dailyTable",
    foreignKeys = [
        ForeignKey(
            entity = UserProfileEntity::class,
            parentColumns = ["id"],
            childColumns = ["user_id"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index("user_id"), Index("date")]

)
data class DailyEntryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo("user_id")
    val userId: Int,
    @ColumnInfo("date")
    val date: LocalDate,
    @ColumnInfo("sleep")
    val sleep: Float,
    @ColumnInfo("water")
    val waterIntakeMl: Int,
    @ColumnInfo("activity")
    val activityMinutes: Int,
    @ColumnInfo("weight")
    val weight: Float,
    @ColumnInfo("created_at")
    val createdAt: Long= System.currentTimeMillis()
)
