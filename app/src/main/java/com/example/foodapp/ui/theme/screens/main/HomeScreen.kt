package com.example.foodapp.ui.theme.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.foodapp.R
import com.example.foodapp.navigation.ROUTE_VAN

@Composable
fun Myhomescreen(navController: NavHostController){
    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .verticalScroll(rememberScrollState())
    )
    {
        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "Recipe app",
            color = Color.White,
            fontSize = 38.sp,
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Italic
        )

        Spacer(modifier = Modifier.height(30.dp))

        Image(
            painter = painterResource(id = R.drawable.vanilla),
            contentDescription = "Vanilla Cake",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clickable {
                    navController.navigate(ROUTE_VAN)
                }


        )
        Text(
            text = "Vanilla Cake",
            color = Color.White,
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif
        )

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.friedrice),
            contentDescription = "Fried Rice",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clickable {
                    navController.navigate(ROUTE_VAN)
                }


        )
        Text(
            text = "Fried Rice",
            color = Color.White,
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif
        )

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.quiche),
            contentDescription = "Quiche recipe",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clickable {
                    navController.navigate(ROUTE_VAN)
                }


        )
        Text(
            text = "Quiche recipe",
            color = Color.White,
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif
        )
    }
}



@Preview
@Composable
private fun HomeScreenPreview() {
    Myhomescreen(rememberNavController())
}