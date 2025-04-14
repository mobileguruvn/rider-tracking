package com.brian.ridertracking.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.brian.tracking_contract.TrackingNavigator
import com.brian.tracking_impl.navigation.TrackingRoutes

@Composable
fun AppNavigation(trackingNavigator: TrackingNavigator) {
    val navController = rememberNavController()

    NavHost(navController, startDestination = TrackingRoutes.TrackingScreen.route) {
        with(trackingNavigator.trackingGraph()) {
            this()
        }
    }
}