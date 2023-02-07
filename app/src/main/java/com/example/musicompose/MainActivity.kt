package com.example.musicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Modifier
import com.example.musicompose.ui.allsongslist.MusicListItemStateful
import com.example.musicompose.ui.theme.MusicomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicomposeTheme {
                LazyColumn() {
                    items(100) {
                        MusicListItemStateful()
                    }
                }
            }
        }
    }
}
