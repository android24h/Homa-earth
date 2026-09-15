package com.ahf2025.myapplication.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.ahf2025.myapplication.data.local.entity.DailyEntryEntity
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

@Dao
interface DailyEntryDao {
    @Upsert
    suspend fun upsertDaily(dailyData: DailyEntryEntity)

    @Delete
    suspend fun deleteDaily(dailyData: DailyEntryEntity)

    @Query("SELECT * FROM dailyTable WHERE user_id = :userId AND date=:date ")
    suspend fun getDailyEntry(userId:Int, date: LocalDate):DailyEntryEntity?

    @Query("SELECT * FROM dailyTable WHERE user_id =:userId AND date Between :startDate AND :endDate ORDER BY created_at DESC")
    fun getDailyEntries(userId: Int, startDate: LocalDate, endDate: LocalDate): Flow<List<DailyEntryEntity>>


}