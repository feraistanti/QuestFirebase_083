package com.example.questfirebase_083


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.questfirebase_083.ui.theme.QuestFirebase_083Theme
import com.example.questfirebase_083.view.ControlNavigasi.DataSiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // Sesuaikan nama tema dengan yang ada di folder ui.theme/Theme.kt
            QuestFirebase_083Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Pastikan composable DataSiswaApp sudah dibuat (biasanya berisi NavHost)
                    DataSiswaApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}