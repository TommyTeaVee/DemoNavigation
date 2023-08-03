package com.lixoten.demonavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ScreenThree(
    onNextButtonClicked: () -> Unit,
    onCancelButtonClicked: () -> Unit
) {
    Column {
        Text(
            text = "Tour Guide for users",
            style = MaterialTheme.typography.h3
        )
        Row {
            OutlinedButton(
                onClick = onCancelButtonClicked
            ) {
                Text(text = "Cancel")
            }
            Button(
                onClick = onNextButtonClicked
            ) {
                Text(text = "Next")
            }
        }
    }
}