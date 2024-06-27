/*
package com.example.customqwertykeyboard

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomKeyboard(onKeyPress: (String) -> Unit) {
    val keys = listOf(
        listOf("Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"),
        listOf("A", "S", "D", "F", "G", "H", "J", "K", "L"),
        listOf("Z", "X", "C", "V", "B", "N", "M")
    )

    Column(modifier = Modifier.fillMaxWidth()) {
        for (row in keys) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                for (key in row) {
                    Key(key, onKeyPress)
                }
            }
        }
    }
}

@Composable
fun Key(label: String, onKeyPress: (String) -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(4.dp)
            .size(48.dp)
            .background(Color.Gray)
            .clickable { onKeyPress(label) }
    ) {
        Text(text = label, fontSize = 18.sp, color = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCustomKeyboard() {
    CustomKeyboard(onKeyPress = { key -> println("Key pressed: $key") })
}
*/
