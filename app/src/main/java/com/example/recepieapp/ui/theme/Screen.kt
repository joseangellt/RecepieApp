package com.example.recepieapp.ui.theme

sealed class Screen(val route:String) {
    object RecipeScreen : Screen("recipescreen")
    object DetailScreen : Screen("detailscreen")
}