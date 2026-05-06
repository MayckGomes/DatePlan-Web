package com.mayckgomes.dateplan_web.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mayckgomes.dateplan_web.components.DownloadButton
import com.mayckgomes.dateplan_web.components.LogoPlaceholder
import com.mayckgomes.dateplan_web.components.StyledButton
import com.mayckgomes.dateplan_web.components.rememberWindowSize
import dateplanweb.composeapp.generated.resources.Res.string
import dateplanweb.composeapp.generated.resources.navBar_1
import dateplanweb.composeapp.generated.resources.navBar_2
import dateplanweb.composeapp.generated.resources.navBar_3
import org.jetbrains.compose.resources.stringResource

@Composable
fun TopNavBar(
    onHeroClick: () -> Unit = {},
    onFeatureClick: () -> Unit = {},
    onCtaClick: () -> Unit = {},
    onDownloadClick: () -> Unit = {},
    modifier: Modifier = Modifier,
) {

    val (wigth, _) = rememberWindowSize()

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 40.dp, vertical = 16.dp)
    ) {
        // ── Logo ──────────────────────────────────────────
        LogoPlaceholder()

        // ── Nav links + CTA ───────────────────────────────
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            if (wigth > 600){
                StyledButton(stringResource(resource = string.navBar_1), onClick = onHeroClick)
                StyledButton(stringResource(resource = string.navBar_2), onClick = onFeatureClick)
                StyledButton(stringResource(resource = string.navBar_3), onClick = onCtaClick)

                Spacer(Modifier.width(16.dp))
            }

            DownloadButton(
                onClick = onDownloadClick,
                modifier = Modifier.height(40.dp),
            )
        }
    }
}


