package com.example.navegapantallas.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navegapantallas.screens.FirstScreen
import com.example.navegapantallas.screens.SecondScreen

@Composable
fun AppNavigation() {
    
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route) {
        composable(route = AppScreens.FirstScreen.route) {
            FirstScreen(navController)
        }

        composable(route = AppScreens.SecondScreen.route) {
            SecondScreen(navController)
        }

    }

}