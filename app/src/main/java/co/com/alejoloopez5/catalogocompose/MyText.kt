package co.com.alejoloopez5.catalogocompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
@Preview
fun MyText() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Manu")
        Text(text = "Manu", color = Color.Blue)
        Text(text = "Manu", fontWeight = FontWeight.Light)
        Text(text = "Manu", style = TextStyle(fontFamily = FontFamily.Cursive))
        Text(text = "Manu", style = TextStyle(textDecoration = TextDecoration.LineThrough))
        Text(text = "Manu", style = TextStyle(textDecoration = TextDecoration.Underline))
        Text(
            text = "Manu", style = TextStyle(
                textDecoration = TextDecoration.combine(
                    listOf(TextDecoration.Underline, TextDecoration.LineThrough)
                )
            )
        )
        Text(text = "Manu", fontSize = 30.sp)
    }
}


@Composable
fun MyTextFieldOutLined(name: String, onValueChanged:(String)-> Unit) {
    OutlinedTextField(
        value = name,
        onValueChange = {onValueChanged(it)},
        modifier = Modifier.padding(24.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Magenta,
            unfocusedBorderColor = Color.Blue
        ),
        label = { Text(text = "Inserte aqui") })
}

@Composable
@Preview
fun MyTextField() {
    var mytext by remember {
        mutableStateOf("")
    }
    TextField(
        value = mytext,
        onValueChange = {
            mytext =
                if (it.contains("a")) {
                    it.replace("a", "b")
                } else {
                    it
                }
        },
        label = { Text(text = "Introduce tu nombre") })
}

@Composable
@Preview
fun MyTextFieldAdvance() {
    var mytext by remember {
        mutableStateOf("")
    }
    TextField(value = mytext, onValueChange = { mytext = it })
}