package com.example.navegapantallas.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navegapantallas.navigation.AppScreens

@Composable
fun FirstScreen(navController: NavController) {

    Scaffold (
        topBar = {
            TopAppBar() {
               Spacer(modifier = Modifier.width(8.dp))
                Text(text = "FirstScreen")
            }
        }
            ){
        BodyContent(navController)
    }

}

@Composable
fun BodyContent(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        
        Text(text = "Hola Navegación")
        Button(onClick = {
            navController.navigate(route = AppScreens.SecondScreen.route)
        }) {
            Text(text = "Navega")
        }
        
    }

}