package com.brian.tracking_impl.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.brian.tracking_contract.TrackingNavigator
import com.brian.tracking_impl.ui.TrackingScreen
import javax.inject.Inject

class TrackingNavigation @Inject constructor() : TrackingNavigator {
    override fun trackingGraph(): NavGraphBuilder.() -> Unit = {
        composable(TrackingRoutes.TrackingScreen.route) {
            TrackingScreen()
        }
    }
}