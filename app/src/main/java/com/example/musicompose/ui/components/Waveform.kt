package com.example.musicompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.musicompose.R

@Composable
fun Waveform(modifier: Modifier = Modifier) {
//    Placeholder
    Image(
        imageVector = ImageVector.vectorResource(id = R.drawable.baseline_waves_24),
        contentDescription = null,
        modifier = modifier.size(128.dp)
    )
}