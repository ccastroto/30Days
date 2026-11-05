@file:OptIn(ExperimentalMaterial3Api::class)

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a30days.data.Audi
import com.example.a30days.data.audis
import com.example.a30days.ui.theme._30DaysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysTheme(
                darkTheme = false
            ) {
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
    Scaffold(
        topBar = {AudiTopBar()}
    ) {
        it ->
        LazyColumn(contentPadding = it){
            items(audis){
                Panel(
                    audi = it,
                    modifier = Modifier.padding(12.dp)
                )
            }
        }
    }
}

@Composable
fun AudiTopBar(modifier: Modifier = Modifier){
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .size(135.dp)
                        .padding(8.dp),
                    painter = painterResource(R.drawable.png_clipart_audi_logo_illustration_audi_rs_2_avant_car_logo_design_text_trademark),
                    contentDescription = "logo audi"
                )
                Text(
                    text = stringResource(R.string.app_name),
                    fontSize = 45.sp,
                    style = MaterialTheme.typography.displayMedium
                )
            }
        },
        modifier = modifier
    )
}

@Composable
fun Panel(audi: Audi, modifier: Modifier = Modifier) {
    var expandir by remember { mutableStateOf(false) }

   Card(modifier = modifier) {
       Row(
           modifier = Modifier
               .fillMaxWidth()
               .padding(8.dp)
       ) {
           AudiImage(
               audiImg = audi.imageResourceId,
               modifier = Modifier.size(120.dp)
           )
           AudiTipo(
               AudiModelo = audi.modelo,
               AudiVariante = audi.variante,
               modifier = Modifier
                   .padding(start = 12.dp)
                   .weight(1f)
           )
       }
       if (expandir){
           AudiInformacion(
               decada = audi.decada,
               descripcion = audi.Descripcion,
           )
       }
   }
}

@Composable
fun AudiImage(@DrawableRes audiImg: Int, modifier: Modifier = Modifier) {
    Image(
        modifier = modifier,
        painter = painterResource(audiImg),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}

@Composable
fun AudiTipo(
    @StringRes AudiModelo: Int,
    @StringRes AudiVariante: Int,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        Text(
            text = stringResource(AudiModelo),
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = stringResource(AudiVariante),
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

@Composable
fun AudiInformacion(
    decada: Int,
    descripcion: String,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
    ){
        Text(
            text = stringResource(R.string.decada, decada),
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(top = 4.dp)
        )
        // description -> hacerla despegable (prox)
        Text(
            text = stringResource(R.string.descripcion, descripcion),
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