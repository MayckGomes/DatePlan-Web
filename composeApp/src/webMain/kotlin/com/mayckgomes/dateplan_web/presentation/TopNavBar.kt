package com.mayckgomes.dateplan_web.presentation

import androidx.compose.foundation.Image
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mayckgomes.dateplan_web.components.DownloadButton
import com.mayckgomes.dateplanweb.theme.theme.AppTheme
import com.mayckgomes.dateplan_web.theme.typography.Alexandria
import com.mayckgomes.dateplan_web.components.rememberWindowSize
import dateplanweb.composeapp.generated.resources.Res
import dateplanweb.composeapp.generated.resources.Res.string
import dateplanweb.composeapp.generated.resources.logo_imagem
import dateplanweb.composeapp.generated.resources.navBar_1
import dateplanweb.composeapp.generated.resources.navBar_2
import dateplanweb.composeapp.generated.resources.navBar_3
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.resources.vectorResource

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
                NavTextButton(stringResource(resource = string.navBar_1), onClick = onHeroClick)
                NavTextButton(stringResource(resource = string.navBar_2), onClick = onFeatureClick)
                NavTextButton(stringResource(resource = string.navBar_3), onClick = onCtaClick)

                Spacer(Modifier.width(16.dp))
            }

            DownloadButton(
                onClick = onDownloadClick,
                modifier = Modifier.height(40.dp),
            )
        }
    }
}

@Composable
private fun LogoPlaceholder() {
    AppTheme{
        Row(
            modifier = Modifier.height(25.dp)
        ){
            Text(
                text = "DatePlan",
                fontFamily = Alexandria,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.primary
            )
            Image(
                imageVector = vectorResource(Res.drawable.logo_imagem),
                contentDescription = null,
                contentScale = ContentScale.Inside
            )
        }
    }
}

@Composable
private fun NavTextButton(label: String, onClick: () -> Unit) {
    Text(
        text = label,
        color = MaterialTheme.colorScheme.onBackground,
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium,
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 10.dp)
    )
}
