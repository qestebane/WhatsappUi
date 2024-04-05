package com.elizabeth.whastsapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.elizabeth.whastsapp.ui.components.AppbarComponent

@Composable
fun HomeScreen() {
    Column {
        AppbarComponent()
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}