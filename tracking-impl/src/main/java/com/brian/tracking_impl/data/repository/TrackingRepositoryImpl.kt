package com.brian.tracking_impl.data.repository

import com.brian.tracking_contract.TrackingLocation
import com.brian.tracking_contract.TrackingRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class TrackingRepositoryImpl @Inject constructor() : TrackingRepository {

    private var isTracking = false

    override fun getLocationUpdates(): Flow<TrackingLocation> = flow {
        while (true) {
            if (isTracking) {
                emit(
                    TrackingLocation(
                        latitude = 10.754792,
                        longitude = 106.6952276,
                        accuracy = 0f,
                        altitude = 0.0,
                        bearing = 0f,
                        timestamp = System.currentTimeMillis()
                    )
                )
            }
            delay(2000)
        }
    }

    override suspend fun startTracking() {
        isTracking = true
    }

    override suspend fun stopTracking() {
        isTracking = false
    }
}