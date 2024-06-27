package com.example.customqwertykeyboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomKeyboard(onKeyPress: (String) -> Unit) {
    val key1 = listOf("Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P")
    val key2 = listOf("A", "S", "D", "F", "G", "H", "J", "K", "L")
    val key3 = listOf("Z", "X", "C", "V", "B", "N", "M","<")

    Column(modifier = Modifier.fillMaxWidth()) {

        Box(contentAlignment = Alignment.Center){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                /*for (key in key1) {

                    Key(key, onKeyPress)
                }*/

                key1.forEachIndexed { index, key ->
                    Key(key, onKeyPress)
                    if (index < key1.size - 1) {
                        Spacer(modifier = Modifier.width(5.dp))
                    }
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.Center
        ) {

            key2.forEachIndexed { index, key ->
                Key(key, onKeyPress)
                if (index < key2.size - 1) {
                    Spacer(modifier = Modifier.width(5.dp))
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.Center
        ) {

            key3.forEachIndexed { index, key ->
                if (key == "<") {
                    BackKey(onKeyPress)
                } else {
                    Key(key, onKeyPress)
                }
                if (index < key3.size - 1) {
                    Spacer(modifier = Modifier.width(5.dp))
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
                .padding(start = 20.dp),
            horizontalArrangement = Arrangement.Start
        ) {

            Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                    .width(80.dp)
                    .height(45.dp)
                    .background(Color(0xFF0D1E62), shape = RoundedCornerShape(16.dp))
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .clickable { }
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Booster",
                        fontSize = 14.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }

            }

            Spacer(modifier = Modifier.padding(5.dp))

            Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                    .width(80.dp)
                    .height(45.dp)
                    .background(Color(0xFF0D1E62), shape = RoundedCornerShape(16.dp))
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .clickable { }
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Booster",
                        fontSize = 14.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.padding(15.dp))

            Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                    .width(150.dp)
                    .height(45.dp)
                    .background(Color(0xFF0CA854), shape = RoundedCornerShape(16.dp))
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .clickable { }
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Submit",
                        fontSize = 14.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }

            }
        }

    }
}


@Composable
fun BackKey(onKeyPress: (String) -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(65.dp)
            .height(45.dp)
            .background(Color(0xFF213690), shape = RoundedCornerShape(16.dp))
            .border(
                width = 1.dp,
                color = Color.White,
                shape = RoundedCornerShape(16.dp)
            )
            .clickable { onKeyPress("back") }
    ) {
        Text(text = "←", fontSize = 18.sp, color = Color.White)
    }
}

@Composable
fun Key(label: String, onKeyPress: (String) -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(30.dp)
            .height(45.dp)
            .background(Color(0xFF213690), shape = RoundedCornerShape(16.dp))
            .border(
                width = 1.dp,
                color = Color.White,
                shape = RoundedCornerShape(16.dp)
            )
            .clickable { onKeyPress(label) }
    ) {
        Text(text = label, fontSize = 18.sp, color = Color.White, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun KeyboardApp() {
    var text by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0D1E62)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        CustomKeyboard(onKeyPress = { key ->
            text = TextFieldValue(text.text + key)
        })
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewKeyboardApp() {
    MaterialTheme {
        KeyboardApp()
    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    KeyboardApp()
                }
            }
        }
    }
}
