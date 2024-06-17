package com.example.datingapp

import android.content.Intent
import android.os.Bundle
import android.widget.ProgressBar
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.datingapp.ui.theme.DatingAppTheme
import com.example.datingapp.ui.theme.Pik
import com.example.datingapp.ui.theme.Pink
import kotlinx.coroutines.delay

class Loading : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DatingAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var progress by remember { mutableStateOf(0f) }
                    val maxProgress = 1f
                    val durationMillis = 3000L
                    val updateInterval = 100L

                    Column(modifier = Modifier
                        .background(Color.Black)
                        .fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        LaunchedEffect(Unit) {
                            val startTime = System.currentTimeMillis()
                            while (progress < maxProgress) {
                                val elapsedTime = System.currentTimeMillis() - startTime
                                progress = (elapsedTime.toFloat() / durationMillis).coerceIn(0f, maxProgress)
                                delay(updateInterval)
                            }
                        }
                        CircularProgressIndicator(modifier = Modifier.size(60.dp)
                            , color = Pink
                            , trackColor = Pik
                            , progress = progress
                            , strokeWidth = 5.dp
                        )
                    }
                    if(progress==maxProgress){
                    val intent= Intent(this@Loading,MainActivity::class.java)
                    startActivity(intent)
                    finish()}
                }
            }
        }
    }
}

@Composable
fun Greeting(){

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    DatingAppTheme {
        Greeting()
    }
}