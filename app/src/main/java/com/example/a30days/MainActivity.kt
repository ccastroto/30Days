@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.a30days

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
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
        topBar = { AudiTopBar() },
        containerColor = MaterialTheme.colorScheme.primary
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
                    style = MaterialTheme.typography.displayMedium,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        ),
        modifier = modifier
    )
}

@Composable
fun Panel(audi: Audi, modifier: Modifier = Modifier) {
    var expandir by remember { mutableStateOf(false) }

   Card(modifier = modifier) {
       Column(
           modifier = Modifier
               .animateContentSize(
                   animationSpec = spring(
                       dampingRatio = Spring.DampingRatioNoBouncy,
                       stiffness = Spring.StiffnessLow
                   )
               )
       ) {
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
                   decada = audi.decada,
                   modifier = Modifier
                       .padding(start = 12.dp)
                       .weight(1f)
               )
               AudiPanelButton(
                   expandir = expandir,
                   onClick = { expandir = !expandir }
               )
           }
           if (expandir){
               AudiInformacion(
                   descripcion = audi.descripcion,
                   modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 8.dp)
               )
           }
       }
   }
}

@Composable
private fun AudiPanelButton(
    expandir: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    IconButton(
        onClick = onClick,
        modifier = modifier
    ){
        Icon(
            imageVector = if (expandir) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.secondary
        )
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
    decada: Int,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        Text(
            text = stringResource(AudiModelo),
            style = MaterialTheme.typography.titleLarge,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(AudiVariante),
            style = MaterialTheme.typography.titleMedium,
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 4.dp)
        )
        Text(
            text = stringResource(R.string.decada, decada),
            style = MaterialTheme.typography.bodyMedium,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)
        )
    }
}

@Composable
fun AudiInformacion(
    @StringRes descripcion: Int,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
    ){
        Text(
            text = stringResource(descripcion),
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 18.sp,
            lineHeight = 24.sp
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