package com.example.musicompose.ui.allsongslist

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MusicListItemStateful(modifier: Modifier = Modifier) {

    var isLiked by rememberSaveable { mutableStateOf(false) }

    MusicListItemStateless(isLiked = isLiked, isLikedState = { isLiked = !isLiked }, modifier = modifier)
}

@Composable
fun MusicListItemStateless(isLiked: Boolean, isLikedState: () -> Unit, modifier: Modifier = Modifier) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(2.dp)
    ) {
        Column(modifier = modifier.weight(1f)) {
            Text(text = "Song name")
            Text(text = "Author")
        }
        IconButton(onClick = isLikedState) {
            val icon = if (isLiked) Icons.Filled.ThumbUp else Icons.Outlined.ThumbUp
            Icon(imageVector = icon, contentDescription = null)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MusicListItemPreview() {
    MusicListItemStateful()
}