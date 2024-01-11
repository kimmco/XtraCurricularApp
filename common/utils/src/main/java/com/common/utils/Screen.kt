package com.common.utils


sealed class Screen(val route: String) {
    object Authentication : Screen(route = "authentication_screen")
    object Home : Screen(route = "home_screen")
}