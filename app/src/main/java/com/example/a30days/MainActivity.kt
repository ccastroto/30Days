package com.example.a30days

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30days.data.Audi
import com.example.a30days.data.audis
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
                    AudiApp()
                }
            }
        }
    }
}

@Composable
fun AudiApp(){
    LazyColumn{
        items(audis){
            Panel(
                audi = it,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun Panel(audi: Audi, modifier: Modifier = Modifier) {
   Card(modifier = modifier) {
       Row(
           modifier = Modifier
               .fillMaxWidth()
       ) {
           AudiImage(audi.imageResourceId)
           AudiTipo(audi.modelo, audi.variante, audi.decada)
       // imagen
       // modelo
       // decada (años: xx - xx)
       // descrpcion
       }
   }
}

@Composable
fun AudiImage(@DrawableRes audiImg: Int, modifier: Modifier = Modifier) {
    Image(
        modifier = modifier,
        painter = painterResource(audiImg),
        contentDescription = null
    )
}

@Composable
fun AudiTipo(
    @StringRes AudiModelo: Int,
    @StringRes AudiVariante: Int,
    decada: String,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        Text(
            text = stringResource(AudiModelo),
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = stringResource(R.string.variante_modelo, AudiVariante),
            style = MaterialTheme.typography.displayMedium
        )
        Text(
            text = stringResource(R.string.decada, decada),
            style = MaterialTheme.typography.displayMedium,
        )
    }
}


@Preview
@Composable
fun GreetingPreview() {
    _30DaysTheme (darkTheme = false) {
       AudiApp()
    }
}