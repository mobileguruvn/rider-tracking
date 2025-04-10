package com.brian.tracking_impl.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.brian.tracking_contract.TrackingLocation
import com.brian.tracking_contract.TrackingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TrackingViewModel @Inject constructor(
    private val repository: TrackingRepository,
) : ViewModel() {

    private val _currentLocation = MutableStateFlow(
        TrackingLocation(
            latitude = 0.0,
            longitude = 0.0,
            accuracy = 0f,
            altitude = 0.0,
            bearing = 0f,
            timestamp = System.currentTimeMillis()
        )
    )

    val currentLocation: StateFlow<TrackingLocation> = _currentLocation.asStateFlow()

    init {
        viewModelScope.launch {
            repository.getLocationUpdates().collectLatest { location ->
                _currentLocation.value = location
            }
        }
    }

    fun startTracking() {
        viewModelScope.launch {
            repository.startTracking()
        }
    }

    fun stopTracking() {
        viewModelScope.launch {
            repository.stopTracking()
        }
    }
}