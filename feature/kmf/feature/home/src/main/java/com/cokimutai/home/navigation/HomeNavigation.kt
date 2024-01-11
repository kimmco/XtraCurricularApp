package com.cokimutai.home.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.cokimutai.home.HomeScreen
import com.common.utils.Screen


fun NavGraphBuilder.homeRoute(
    navigateToAuth: () -> Unit,
    onDataLoaded: () -> Unit
){
    composable(route = Screen.Home.route) {

        HomeScreen()

    }

}