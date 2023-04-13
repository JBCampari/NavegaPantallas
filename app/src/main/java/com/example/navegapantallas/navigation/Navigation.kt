package com.example.navegapantallas.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navegapantallas.R
import com.example.navegapantallas.screens.FirstScreen
import com.example.navegapantallas.screens.SecondScreen
import com.example.navegapantallas.screens.ThirdScreen

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

        composable(route = AppScreens.ThirdScreen.route) {
            ThirdScreen(navController)
        }

    }

}