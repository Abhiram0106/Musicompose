package com.example.musicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import com.example.musicompose.ui.components.MusicListItemStateful
import com.example.musicompose.ui.playmusicscreen.PlayMusicScreen
import com.example.musicompose.ui.theme.MusicomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicomposeTheme {
                PlayMusicScreen()
//                LazyColumn() {
//                    items(100) {
//                        MusicListItemStateful()
//                    }
//                }
            }
        }
    }
}
