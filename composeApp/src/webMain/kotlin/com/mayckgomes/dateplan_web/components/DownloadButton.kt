package com.mayckgomes.dateplan_web.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dateplanweb.composeapp.generated.resources.Res
import dateplanweb.composeapp.generated.resources.download
import org.jetbrains.compose.resources.stringResource


@Composable
fun DownloadButton(
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    plusSize: Int = 0
) {

    val surfaceColors = arrayOf(
        0.0f to MaterialTheme.colorScheme.primary.copy(),
        0.0f to MaterialTheme.colorScheme.primary.copy(),
        1.0f to MaterialTheme.colorScheme.primary.copy(alpha = 0.18f)
    )

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(
                Brush.linearGradient(
                    colorStops = surfaceColors
                )
            )
            .clickable(onClick = onClick)
            .padding(horizontal = (30 + plusSize).dp, vertical = (12 + plusSize).dp)
    ) {
        Text(
            text = stringResource(resource = Res.string.download),
            color = MaterialTheme.colorScheme.onBackground,
            fontSize= 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
