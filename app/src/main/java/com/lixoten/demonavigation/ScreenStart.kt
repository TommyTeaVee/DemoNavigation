package com.lixoten.demonavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.lixoten.demonavigation.ui.theme.DemoNavigationTheme

@Composable
fun ScreenStart(
    onNextButtonClicked: () -> Unit
) {
    Column {
        Text(
            text = "Getting Started",
            style = MaterialTheme.typography.h3
        )
        Button(
            onClick = onNextButtonClicked
        ) {
            Text(text = "Next")
        }
    }
}


@Preview
@Composable
fun StartScreenPreview() {
    DemoNavigationTheme {
        ScreenStart(
            onNextButtonClicked = { }
        )
    }
}