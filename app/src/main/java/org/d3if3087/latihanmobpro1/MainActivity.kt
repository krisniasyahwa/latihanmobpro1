package org.d3if3087.latihanmobpro1

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
//import org.d3if3087.latihanmobpro1.model.Hewan
import org.d3if3087.latihanmobpro1.ui.theme.LatihanMobpro1Theme

class MainActivity : ComponentActivity() {
//    private val data = getData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LatihanMobpro1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Counter()
//                    JustImage()
                    Lights()
                }
            }
        }
    }
//    private fun getData(): List<Hewan> {
//        return listOf(
//            Hewan("Ayam", R.drawable.ayam),
//            Hewan("Bebek", R.drawable.bebek),
//            Hewan("Domba", R.drawable.domba),
//            Hewan("Kambing", R.drawable.kambing),
//            Hewan("Sapi", R.drawable.sapi),
//        )
//    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(content: @Composable (Modifier) -> Unit) {
   // Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                    Text(text = stringResource(id = R.string.app_name))
                },
                    colors = TopAppBarDefaults.mediumTopAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.primary,
                    )
                )
            }
        ) { padding ->
            content(Modifier.padding(padding))
        }
    }


@Composable
fun Greeting(name: String) {
    MainScreen { modifier ->
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun ScreenPreview() {
    LatihanMobpro1Theme {
//        Counter()
//        JustImage()
        Lights()
    }
}

//latihan 02
//@Composable
//fun Counter() {
//    var number by remember {
//        mutableStateOf(0)
//    }
//    MainScreen { modifier ->
//        Column(
//            modifier = modifier
//                .fillMaxSize()
//                .padding(16.dp),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Button(
//                onClick = { number++ },
//                modifier = Modifier
//                    .fillMaxWidth(0.5f)
//                    .padding(top = 16.dp),
//                contentPadding = PaddingValues(16.dp)
//            ) {
//                Text(text = "Hitung +1")
//            }
//        }
//    }
//}

//Challenge 02
//@Composable
//fun Counter() {
//    val number = remember {
//        mutableStateOf(0)
//    }
//    MainScreen { modifier ->
//        Row(
//            modifier = modifier
//                .fillMaxSize()
//                .padding(16.dp),
//            horizontalArrangement = Arrangement.Center,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Button (
//                onClick = { if (number.value > 0) number.value-- },
//                modifier = Modifier
//                    .size(48.dp),
//                contentPadding = PaddingValues(12.dp)
//            ){
//                Text(text = "-")
//            }
//            Spacer(modifier = Modifier.width(16.dp))
//            Text(
//                text = number.value.toString(),
//                style = MaterialTheme.typography.displayLarge
//            )
//            Spacer(modifier = Modifier.width(16.dp))
//            Button (
//                onClick = { number.value++ },
//                modifier = Modifier
//                    .size(48.dp),
//                contentPadding = PaddingValues(0.dp)
//            ){
//                Text(text = "+")
//            }
//        }
//    }
//}

//modul 03
@Composable
fun GaleriHewan() {
    MainScreen {
        modifier ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

        }
    }
}
//tugas tp 03
//@Composable
//fun JustImage() {
//    MainScreen { modifier ->
//        Box(
//            modifier = modifier.fillMaxSize(),
//            contentAlignment = Alignment.Center
//        ) {
//            Image(
//                painter = painterResource(R.drawable.gumi),
//                contentDescription = "Ini Si Gumi",
//                modifier = Modifier
//                    .size(200.dp)
//            )
//        }
//    }
//}

@Composable
fun Lights() {
    var isLightsOn by remember { mutableStateOf(false) }

    MainScreen { modifier ->
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(if (isLightsOn) R.drawable.lightson else R.drawable.lightsoff),
                    contentDescription = "Lampu ${if (isLightsOn) "Hidup" else "Mati"}",
                    modifier = Modifier
                        .size(200.dp)
                )
            }

            Button(
                onClick = { isLightsOn = !isLightsOn },
                modifier = Modifier
                    .padding(top = 16.dp)
            ) {
                Text(text = if (isLightsOn) "Lights Off" else "Lights On")
            }
        }
    }
}




