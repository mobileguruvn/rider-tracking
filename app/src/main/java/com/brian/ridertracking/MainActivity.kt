package com.brian.ridertracking

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.brian.ridertracking.navigation.AppNavigation
import com.brian.ridertracking.ui.theme.RiderTrackingTheme
import com.brian.tracking_contract.TrackingNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    @Inject
    lateinit var trackingNavigator: TrackingNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RiderTrackingTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    AppNavigation(trackingNavigator)
                }
            }
        }
    }
}
