package com.example.musicompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicompose.R

@Composable
fun MediaControls(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth()
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.baseline_repeat_24),
                contentDescription = stringResource(id = R.string.repeat)
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = stringResource(id = R.string.previous)
            )
        }
        IconButton(
            onClick = { /*TODO*/ },
            modifier = modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colors.primary)

        ) {
            Icon(
                imageVector = Icons.Filled.PlayArrow,
                contentDescription = stringResource(id = R.string.play),
                tint = MaterialTheme.colors.onPrimary,
                modifier = modifier.size(32.dp)
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = stringResource(id = R.string.next)
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.baseline_shuffle_24),
                contentDescription = stringResource(id = R.string.shuffle)
            )
        }

    }
}

@Preview
@Composable
fun MediaControlsPreview() {
    MediaControls()
}