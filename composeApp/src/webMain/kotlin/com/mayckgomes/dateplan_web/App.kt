package com.mayckgomes.dateplan_web

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.mayckgomes.dateplanweb.presentation.MainScreen
import com.mayckgomes.dateplanweb.theme.theme.AppTheme

@Composable
fun App() {
    AppTheme {
        MainScreen()
    }
}