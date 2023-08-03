package com.lixoten.demonavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ScreenLast(
    onCancelButtonClicked: () -> Unit
) {
    Column {
        Text(
            text = "Impressed? Let's get started",
            style = MaterialTheme.typography.h3
        )
        Row {
            OutlinedButton(
                onClick = onCancelButtonClicked
            ) {
                Text(text = "Cancel")
            }
        }
    }
}