package com.ahf2025.myapplication.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.ahf2025.myapplication.data.local.entity.UserProfileEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ProfileDao {

    @Upsert
    suspend fun upsertProfile(profile: UserProfileEntity)

    @Delete
    suspend fun deleteProfile(profile: UserProfileEntity)

    @Query("SELECT * FROM profileTable LIMIT 1")
    fun getProfile(): Flow<UserProfileEntity?>

    @Query("SELECT * FROM profileTable LIMIT 1")
    suspend fun getProfileOnce(): UserProfileEntity?


}