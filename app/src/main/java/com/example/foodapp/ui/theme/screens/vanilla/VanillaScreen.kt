package com.example.foodapp.ui.theme.screens.vanilla

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun VanillaScreen(navController: NavHostController) {
    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    )
    {
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "Vanilla Cake",
            color = Color.White,
            fontSize = 38.sp,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Default)
        Spacer(modifier = Modifier.height(30.dp))

        LazyColumn {
            // Add a single item
            item {
                Text(text = "cooking spray",
                    color= Color.White,
                    fontSize = 15.sp)
            }

            // Add 3 items
            items(3) {
                Text(text = "2 ⅔ cups all-purpose flour, or more as needed",
                    color= Color.White,
                    fontSize = 15.sp)
            }

            // Add 2 items

            items(2) {
                Text(text = "1 cup white sugar",
                    color= Color.White,
                    fontSize = 15.sp)
            }

            items(2) {
                Text(text = "1 tablespoon baking powder",
                    color= Color.White,
                    fontSize = 15.sp)
            }

            items(2) {
                Text(text = "1 tablespoon vanilla extract",
                    color= Color.White,
                    fontSize = 15.sp)
            }

            items(2) {
                Text(text = "2 pinches salt",
                    color= Color.White,
                    fontSize = 15.sp)
            }

            items(2) {
                Text(text = "3 eggs",
                    color= Color.White,
                    fontSize = 15.sp)
            }
            // Add another single item

        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Instructions",
            color = Color.White,
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold )

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Preheat the oven to 350 degrees F (175 degrees C). Grease a 9-inch cake tin with cooking spray and line with parchment paper. Mix flour, sugar, baking powder, vanilla extract, and salt together in a large bowl. Add eggs, milk, and vegetable oil; mix by hand or beat with an electric mixer on low speed until smooth. Add more flour if batter is too runny. Pour into the prepared pan. Bake in the preheated oven until a toothpick inserted into the center of the cake comes out clean, about 1 hour. Cool on a wire rack for 5 minutes. Run a table knife around the edges to loosen. Invert cake carefully onto a cooling rack. Let cool completely.",
            color = Color.White,
            fontSize = 15.sp)
    }
}

@Preview
@Composable
private fun VanillaScreen(){
    VanillaScreen(rememberNavController())
}