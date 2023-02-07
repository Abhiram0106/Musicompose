package com.example.musicompose.ui.playmusicscreen

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicompose.ui.components.MediaControls
import com.example.musicompose.ui.components.MusicListItemStateful
import com.example.musicompose.ui.components.Waveform

@Composable
fun PlayMusicScreen(modifier: Modifier = Modifier) {

    Column(modifier = modifier
        .fillMaxSize()
        .padding(8.dp)) {

        Waveform(modifier = modifier
            .fillMaxSize()
            .weight(1f))

        Spacer(modifier = modifier
            .fillMaxWidth()
            .height(12.dp))

        MusicListItemStateful()

        Spacer(modifier = modifier
            .fillMaxWidth()
            .height(12.dp))

        MediaControls()

        Spacer(modifier = modifier
            .fillMaxWidth()
            .height(64.dp))
    }

}

@Preview(showBackground = true)
@Composable
fun PlayMusicScreenPreview() {
    PlayMusicScreen()
}
