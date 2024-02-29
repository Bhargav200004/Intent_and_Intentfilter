package com.example.intentlearning


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.intentlearning.ui.theme.IntentLearningTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            IntentLearningTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(text = "SecondScreen Activity")
                }
            }
        }
    }
}