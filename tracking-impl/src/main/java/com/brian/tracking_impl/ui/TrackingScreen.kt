package com.brian.tracking_impl.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun TrackingScreen(viewModel: TrackingViewModel = hiltViewModel()) {
    val location by viewModel.currentLocation.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text("Location: ${location.latitude}, ${location.longitude}")

        Button(onClick = { viewModel.startTracking() }) {
            Text("Start Tracking")
        }

        Button(onClick = { viewModel.stopTracking() }) {
            Text("Stop Tracking")
        }
    }

}