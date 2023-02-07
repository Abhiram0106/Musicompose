package com.example.musicompose.ui.components

import androidx.compose.material.Slider
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier


@Composable
fun MusicSeekbar(modifier: Modifier = Modifier) {

    var sliderPosition by remember { mutableStateOf(0f)}

    Slider(value = sliderPosition, onValueChange = {sliderPosition = it})
}