package com.ahf2025.myapplication.data.local.entity

import androidx.room.TypeConverter
import java.time.LocalDate

class Convertors {
    @TypeConverter
    fun localDateToLong(date: LocalDate?): Long?=date?.toEpochDay()

    @TypeConverter
    fun longToLocalDate(value: Long?): LocalDate?=value?.let { LocalDate.ofEpochDay(it) }


}