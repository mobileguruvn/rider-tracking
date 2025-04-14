package com.brian.tracking_impl.navigation

sealed class TrackingRoutes(val route: String) {
    object TrackingScreen : TrackingRoutes("tracking")
}