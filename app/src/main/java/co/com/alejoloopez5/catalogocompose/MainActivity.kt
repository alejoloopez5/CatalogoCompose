package co.com.alejoloopez5.catalogocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.com.alejoloopez5.catalogocompose.ui.theme.CatalogoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatalogoComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyColumn()
                }
            }
        }
    }
}

@Preview
@Composable
fun MyColumn(){
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.SpaceBetween) {
        Text(text = "Prueba1", modifier = Modifier.background(Color.Red))
        Text(text = "Prueba2", modifier = Modifier.background(Color.Black))
        Text(text = "Prueba3", modifier = Modifier.background(Color.Cyan))
        Text(text = "Prueba4", modifier = Modifier.background(Color.Blue))
        Text(text = "Prueba7", modifier = Modifier.background(Color.Blue))
        Text(text = "Prueba8", modifier = Modifier.background(Color.Blue))

        Row(Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Prueba5", modifier = Modifier.background(Color.Yellow))
            Text(text = "Prueba6", modifier = Modifier.background(Color.LightGray))
        }
    }
}

@Preview
@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .background(Color.Cyan)
                .verticalScroll(rememberScrollState()), contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Manu esto es un ejemplo")
        }
    }
}
