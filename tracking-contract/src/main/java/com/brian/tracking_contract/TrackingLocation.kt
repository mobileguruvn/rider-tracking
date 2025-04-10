package com.brian.tracking_contract

data class TrackingLocation(
    val latitude: Double,
    val longitude: Double,
    val accuracy: Float,
    val altitude: Double,
    val bearing: Float,
    val timestamp: Long
)
