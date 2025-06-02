package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloworld.ui.theme.HelloWorldTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(modifier=modifier.fillMaxSize()) {
        Row(modifier=modifier.weight(1f)) {
            ComposableInfoCard(
                title = "Makan",
                description = "Minum",
                background = Color(0xFFEADDFF),
                modifier = modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "Makan2",
                description = "Minum1",
                background = Color(0xFFD0BCFF),
                modifier = modifier.weight(1f)
            )
        }
        Row(modifier=modifier.weight(1f)) {
            ComposableInfoCard(
                title = "Makan3",
                description = "Minum3",
                background = Color(0xFFEADDFF),
                modifier = modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "Makan4",
                description = "Minum4",
                background = Color(0xFFD0BCFF),
                modifier = modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    modifier: Modifier=Modifier,
    title:String,
    description:String,
    background:Color=Color.DarkGray,
) {
    Column(modifier=modifier.fillMaxSize()
        .background(background)
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(
            text=title,
            modifier=Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text=description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldTheme {
        Greeting()
    }
}