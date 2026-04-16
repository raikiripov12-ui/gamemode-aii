package com.example.gamemode

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SimpleDashboard()
        }
    }
}

@Composable
fun SimpleDashboard() {
    var enabled by remember { mutableStateOf(false) }

    MaterialTheme {
        Column(
            modifier = androidx.compose.ui.Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = if (enabled) "Game Mode ON" else "Game Mode OFF")

            Button(onClick = { enabled = !enabled }) {
                Text("Toggle Game Mode")
            }
        }
    }
}
