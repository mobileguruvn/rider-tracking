package com.brian.tracking_contract

import androidx.navigation.NavGraphBuilder

interface TrackingNavigator {
    fun trackingGraph() : NavGraphBuilder.() -> Unit
}