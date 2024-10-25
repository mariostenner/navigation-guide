package com.mariods.navigationguide.view.Detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailScreen (name : String, navigateBack: () -> Unit){
    var textEditable by remember {
        mutableStateOf("")
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "Detail Screen $name",
            fontSize = 40.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.weight(1f))
        TextField(value = textEditable, onValueChange = {textEditable = it})
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = {  }, shape = RoundedCornerShape(16.dp), colors = ButtonColors(containerColor = Color.White,
            Color.White,
            Color.White,
            Color.White)
        ) {
            Text(text = "Ir a detalle", color = Color.Blue)
        }
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateBack() }, shape = RoundedCornerShape(16.dp), colors = ButtonColors(containerColor = Color.White,
            Color.White,
            Color.White,
            Color.White)
        ) {
            Text(text = "LogOut", color = Color.Red)
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}
