package com.example.foodapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.foodapp.ui.theme.screens.login.LoginScreen
import com.example.foodapp.ui.theme.screens.main.Myhomescreen
import com.example.foodapp.ui.theme.screens.register.RegisterScreen
import com.example.foodapp.ui.theme.screens.vanilla.VanillaScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination: String = ROUTE_LOGIN) {

    NavHost(navController = navController, startDestination = startDestination, modifier = modifier) {

        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }

        composable(ROUTE_MAIN){
            Myhomescreen(navController)
        }

        composable(ROUTE_VAN){
            VanillaScreen(navController)
        }

    }
}