package com.ahf2025.myapplication.data.api.data

import com.google.gson.annotations.SerializedName

data class TotalFoodList(
    val totalHits: Int,
    val foods: List<FoodListItem>
)

data class FoodListItem(
    @SerializedName("fdcId")
    val foodId: Int,
    val description: String,
    val dataType: String,
    val foodNutrients: List<FoodNutrientListItem>
)

data class FoodNutrientListItem(
    val nutrientName: String,
    val unitName: String,
    val value: Double
)