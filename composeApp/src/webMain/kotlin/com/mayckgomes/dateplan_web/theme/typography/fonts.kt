package com.mayckgomes.dateplan_web.theme.typography


import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dateplanweb.composeapp.generated.resources.Res
import dateplanweb.composeapp.generated.resources.alexandria_bold
import dateplanweb.composeapp.generated.resources.alexandria_regular
import dateplanweb.composeapp.generated.resources.alexandria_semibold
import org.jetbrains.compose.resources.Font

val Alexandria @Composable get() = FontFamily(
    Font(
        resource = Res.font.alexandria_regular,
        weight = FontWeight.Normal
    ),
    Font(
        resource = Res.font.alexandria_semibold,
        weight = FontWeight.SemiBold
    ),
    Font(
        resource = Res.font.alexandria_bold,
        weight = FontWeight.Bold
    )
)

val typography: Typography @Composable get() = Typography(
    bodySmall = TextStyle(
        fontFamily = Alexandria,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = Alexandria,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Alexandria,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    ),
    titleSmall = TextStyle(
        fontFamily = Alexandria,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp
    ),
    titleMedium =  TextStyle(
        fontFamily = Alexandria,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    titleLarge = TextStyle(
        fontFamily = Alexandria,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp
    ),
    headlineSmall =  TextStyle(
        fontFamily = Alexandria,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp
    ),
    headlineMedium =  TextStyle(
        fontFamily = Alexandria,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = Alexandria,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    )
)