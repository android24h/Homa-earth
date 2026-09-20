package com.ahf2025.myapplication.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ahf2025.myapplication.data.local.dao.DailyEntryDao
import com.ahf2025.myapplication.data.local.dao.ProfileDao
import com.ahf2025.myapplication.data.local.entity.Convertors
import com.ahf2025.myapplication.data.local.entity.DailyEntryEntity
import com.ahf2025.myapplication.data.local.entity.UserProfileEntity

@Database(
    entities = [
        UserProfileEntity::class,
        DailyEntryEntity::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(Convertors::class)
abstract class HealthDatabase: RoomDatabase() {
    abstract fun profileDao(): ProfileDao
    abstract fun dailyEntryDao(): DailyEntryDao


}