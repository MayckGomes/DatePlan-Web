package com.mayckgomes.dateplan_web.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mayckgomes.dateplan_web.components.objects.AppImages
import com.mayckgomes.dateplan_web.components.FeatureBadge
import com.mayckgomes.dateplan_web.components.objects.Icons
import dateplanweb.composeapp.generated.resources.Res
import dateplanweb.composeapp.generated.resources.feature_1
import dateplanweb.composeapp.generated.resources.feature_2
import dateplanweb.composeapp.generated.resources.feature_3
import dateplanweb.composeapp.generated.resources.feature_4
import dateplanweb.composeapp.generated.resources.feature_text
import dateplanweb.composeapp.generated.resources.feature_title
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.stringResource


@Composable
fun FeatureSection(
    modifier: Modifier = Modifier,
    width: Dp
) {

    val isMobile = width < 600.dp

    val imageHeight = if (isMobile) 250.dp else 400.dp

    val surfaceColors = arrayOf(
        0.0f to MaterialTheme.colorScheme.primary.copy(alpha = 0.35f),
        0.15f to MaterialTheme.colorScheme.primary.copy(alpha = 0.18f),
        0.65f to MaterialTheme.colorScheme.surface,
        0.85f to MaterialTheme.colorScheme.surface,
        1.0f to MaterialTheme.colorScheme.primary.copy(alpha = 0.18f)
    )

    val horizontalState = rememberPagerState(
        initialPage = 0,
        pageCount = {5}
    )

    if (isMobile) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(60.dp),
            modifier = modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.background)
                .padding(horizontal = 80.dp, vertical = 80.dp)
        ) {

            TextConteiner(
                modifier = Modifier.weight(1f)
            )


            ImageConteiner(
                horizontalState = horizontalState,
                modifier = Modifier
                    .weight(1f)
                    .height(400.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(
                        Brush.linearGradient(
                            colorStops = surfaceColors,
                        )
                    )
            )

        }

    } else {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(60.dp),
            modifier = modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.background)
                .padding(horizontal = 80.dp, vertical = 80.dp)
        ) {

            TextConteiner(
                modifier = Modifier.weight(1f)
            )


            ImageConteiner(
                horizontalState = horizontalState,
                modifier = Modifier
                    .weight(1f)
                    .height(imageHeight)
                    .clip(RoundedCornerShape(20.dp))
                    .background(
                        Brush.linearGradient(
                            colorStops = surfaceColors,
                        )
                    )
            )

        }

    }
}

@Composable
private fun TextConteiner(
    modifier: Modifier = Modifier,
){
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
    ) {
        Text(
            text = stringResource(resource = Res.string.feature_title),
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 38.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 46.sp,
        )
        Text(
            text = stringResource(resource = Res.string.feature_text),
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 16.sp,
            lineHeight = 26.sp,
        )
        Spacer(Modifier.height(8.dp))
        FeatureBadge(stringResource(resource = Res.string.feature_1))
        FeatureBadge(stringResource(resource = Res.string.feature_2))
        FeatureBadge(stringResource(resource = Res.string.feature_3))
        FeatureBadge(stringResource(resource = Res.string.feature_4))
    }

}

@Composable
private fun ImageConteiner(
    horizontalState: PagerState,
    modifier: Modifier = Modifier,
){

    val scope = rememberCoroutineScope()

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        // Pager central
        HorizontalPager(
            state = horizontalState,
            modifier = Modifier
                .fillMaxSize(),
            userScrollEnabled = false
        ) { page ->
            Image(
                painter = when (page) {
                    0 -> AppImages.image1
                    1 -> AppImages.image2
                    2 -> AppImages.image3
                    3 -> AppImages.image4
                    else -> AppImages.image5
                },
                contentDescription = "App images",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .fillMaxSize()
            )
        }

        // Botão esquerda
        IconButton(
            onClick = {

                if (horizontalState.currentPage > 0) {
                    scope.launch {
                        horizontalState.animateScrollToPage(horizontalState.currentPage - 1)
                    }
                }

            },
            modifier = Modifier.align(Alignment.CenterStart)
        ) {
            Icon(Icons.BackArrow, contentDescription = "back")
        }

        // Botão direita
        IconButton(
            onClick = {

                if (horizontalState.currentPage < 4) {
                    scope.launch {
                        horizontalState.animateScrollToPage(horizontalState.currentPage + 1)
                    }
                }

            },
            modifier = Modifier.align(Alignment.CenterEnd)
        ) {
            Icon(
                Icons.BackArrow,
                contentDescription = "forward",
                modifier = Modifier.rotate(180f)
            )
        }

    }
}
