package com.example.navegapantallas.navigation

sealed class AppScreens(
    val route: String
) {

    object FirstScreen: AppScreens("first_screen")
    object SecondScreen: AppScreens("second_screen")
    object ThirdScreen: AppScreens("third_screen")

}
