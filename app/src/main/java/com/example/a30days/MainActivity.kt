package com.example.a30days

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30days.model.Audi
import com.example.a30days.ui.theme._30DaysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ){
                    Panel(
                        audi = TODO(),
                        modifier = TODO()
                    )
                }
            }
        }
    }
}

@Composable
fun Panel(audi: Audi, modifier: Modifier = Modifier) {
   Card(modifier = modifier) {
       Row() {
           Image(
               painter = painterResource(audi.imageResourceId),
               contentDescription = null
           )
       // imagen
       // modelo
       // decada (años: xx - xx)
       // descrpcion
       }
   }
}

@Composable
fun AudiImage(audi: Audi, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(audi.imageResourceId),
        contentDescription = null
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _30DaysTheme (darkTheme = true) {
        Panel(Audi(R.drawable.ic_launcher_background, "80", "80", "coupe", "audi 80 ..."))
    }
}