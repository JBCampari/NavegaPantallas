package com.example.navegapantallas.screens

import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.navegapantallas.R
import com.example.navegapantallas.navigation.AppScreens

@Composable
fun ThirdScreen(navController: NavController) {

    Scaffold(
        topBar= {
            TopAppBar {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow back",
                    modifier = Modifier.clickable{
                        navController.navigate(route = AppScreens.FirstScreen.route)
                    }
                )

                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "ThirdScreen")
            }
        }
    ) {
        ThirdBodyContent(navController)
    }

}

@Composable
fun ThirdBodyContent(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "He Navegado más")
        Button(onClick = {
            navController.navigate(route = AppScreens.FirstScreen.route)
        }) {
            Text(text = "Volver Atrás")
        }
        Image(
            modifier = Modifier
                .fillMaxSize()
                .height(200.dp),
            painter = painterResource(id = R.drawable.estatuaibirrmm__2_),
            contentDescription = "imagen fondo"
        )
    }

}