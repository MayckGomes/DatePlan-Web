package com.mayckgomes.dateplanweb.theme.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.mayckgomes.dateplan_web.theme.typography.typography

@Composable
fun AppTheme(content: @Composable () -> Unit){

    val lightColors = lightColorScheme(
        background = Color(0xFFF0F0F0),
        onBackground = Color(0xFFF0F0F0F),
        primary = Color(0xFFFF0000),
        surface = Color(0xFFD9D9D9),
        onSurface = Color(0xFF848484),
    )

    val darkColors = darkColorScheme(
        background = Color(0xFFF0F0F0F),
        onBackground = Color(0xFFF0F0F0),
        primary = Color(0xFFFF0000),
        surface = Color(0xFF242424),
        onSurface = Color(0xFF848484)
    )

    MaterialTheme(
        colorScheme = if(isSystemInDarkTheme()) darkColors else lightColors,
        typography = typography,
        content = content
    )


}