package com.example.navegapantallas.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun SecondScreen(navController: NavController) {

    Scaffold(
        topBar= {
            TopAppBar {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow back",
                    modifier = Modifier.clickable{
                        navController.popBackStack()
                    }
                )

                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "SecondScreen")
            }
        }
    ) {
        SecondBodyContent(navController)
    }

}

@Composable
fun SecondBodyContent(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "He Navegado")
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Volver Atrás")
        }

    }

}