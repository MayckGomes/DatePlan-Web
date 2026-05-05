package com.mayckgomes.dateplan_web.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mayckgomes.dateplan_web.components.DownloadButton
import dateplanweb.composeapp.generated.resources.Res
import dateplanweb.composeapp.generated.resources.hero_text
import dateplanweb.composeapp.generated.resources.hero_title
import org.jetbrains.compose.resources.stringResource

@Composable
fun HeroSection(
    onDownloadClick: () -> Unit = {},
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 40.dp, vertical = 100.dp)
    ) {
        Text(
            text = stringResource(resource = Res.string.hero_title),
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 52.sp,
            fontWeight = FontWeight.ExtraBold,
            textAlign  = TextAlign.Center,
        )

        Spacer(Modifier.height(20.dp))

        Text(
            text = stringResource(resource = Res.string.hero_text),
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
        )

        Spacer(Modifier.height(40.dp))

        DownloadButton(
            onClick = onDownloadClick,
            plusSize = 10,
        )
    }
}
