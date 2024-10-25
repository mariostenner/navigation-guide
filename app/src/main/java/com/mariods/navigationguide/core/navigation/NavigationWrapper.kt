package com.mariods.navigationguide.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.mariods.navigationguide.view.Detail.DetailScreen
import com.mariods.navigationguide.view.Home.HomeScreen
import com.mariods.navigationguide.view.Login.LoginScreen

@Composable
fun NavigationWrapper (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login){

        composable<Login> {
            LoginScreen{navController.navigate(Home)}
        }

        composable<Home> {
            HomeScreen{name -> navController.navigate(Detail(name = name))}
        }

        composable<Detail> {backStackEntry ->
            var detail = backStackEntry.toRoute<Detail>()
            DetailScreen (detail.name) {navController.navigate(Login){
                popUpTo<Login>{inclusive = true}
            } }
        }

    }
}