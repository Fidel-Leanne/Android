package com.example.whatappui.ui.theme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatappui.ui.theme.components.AppBar

@Composable
fun  HomeScreen(){



    Column {

        AppBar()

    }
}

@Preview
@Composable
fun HomeScreenPreview(){

    HomeScreen()
}