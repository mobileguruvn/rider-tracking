package com.brian.ridertracking.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.brian.tracking_contract.TrackingNavigator

@Composable
fun AppNavigation(trackingNavigator: TrackingNavigator) {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "tracking") {
        with(trackingNavigator.trackingGraph()) {
            this()
        }
    }
}