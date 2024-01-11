package com.cokimutai.e_extracurricularapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.cokimutai.e_extracurricularapp.navigation.setUpNavGraph
import com.cokimutai.e_extracurricularapp.ui.theme.EExtraCurricularAppTheme
import com.common.utils.Constants.APP_ID
import com.common.utils.Screen
import com.google.firebase.FirebaseApp
import io.realm.kotlin.mongodb.App

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)
        setContent {
            EExtraCurricularAppTheme {
                val navController = rememberNavController()
                setUpNavGraph(
                    startDestination = getStartDestination() ,
                    navController = navController,
                    onDataLoaded = {

                    }
                )
            }
        }
    }
}

private fun getStartDestination(): String {
    val user = App.create(APP_ID).currentUser
    //return if (user != null && user.loggedIn) Screen.Home.route
    return if (user == null ) Screen.Home.route
    else Screen.Authentication.route
}
