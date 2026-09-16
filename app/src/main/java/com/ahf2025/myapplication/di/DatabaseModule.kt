package com.ahf2025.myapplication.di

import android.app.Application
import androidx.room.Room
import com.ahf2025.myapplication.data.local.database.HealthDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): HealthDatabase {
        return Room.databaseBuilder(
            app,
            HealthDatabase::class.java,
            "health_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideProfileDao(db: HealthDatabase) = db.profileDao()

    @Provides
    @Singleton
    fun provideDailyEntryDao(db: HealthDatabase) = db.dailyEntryDao()

}