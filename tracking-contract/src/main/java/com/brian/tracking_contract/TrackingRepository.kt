package com.brian.tracking_contract

import kotlinx.coroutines.flow.Flow

interface TrackingRepository {
    fun getLocationUpdates() : Flow<TrackingLocation>
    suspend fun startTracking()
    suspend fun stopTracking()
}