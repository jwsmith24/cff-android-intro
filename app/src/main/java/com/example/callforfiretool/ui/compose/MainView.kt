package com.example.callforfiretool.ui.compose

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import com.example.callforfiretool.ui.theme.CallForFireToolTheme

@Composable
fun MainView() {
    Scaffold(modifier = Modifier
        .fillMaxSize()
        .testTag("mainScaffold")
    ) {
        innerPadding ->
        Greeting("World!", innerPadding)
    }
}


@Composable
fun Greeting(name: String, innerPaddingValues: PaddingValues) {
    Text(
        text = "Hello $name!",
        modifier = Modifier
            .testTag("greetingText")
            .padding(innerPaddingValues)
    )
}

@Composable
@Preview
fun MainViewPreview() {
    CallForFireToolTheme {
        MainView()
    }
}