package com.mayckgomes.dateplanweb.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInParent
import androidx.compose.ui.unit.dp
import com.mayckgomes.dateplan_web.components.rememberWindowSize
import com.mayckgomes.dateplan_web.presentation.CtaSection
import com.mayckgomes.dateplan_web.presentation.FeatureSection
import com.mayckgomes.dateplan_web.presentation.HeroSection
import com.mayckgomes.dateplan_web.presentation.TopNavBar
import kotlinx.browser.window
import kotlinx.coroutines.launch

@Composable
fun MainScreen() {
    val scrollState = rememberScrollState()
    val scope = rememberCoroutineScope()
    val (width, height) = rememberWindowSize()

    var heroOffset by remember { mutableStateOf(0) }
    var featureOffset by remember { mutableStateOf(0) }
    var ctaOffset by remember { mutableStateOf(0) }

    fun scrollTo(px: Int) {
        scope.launch { scrollState.animateScrollTo(px) }
    }

    Column{
        TopNavBar(
            onHeroClick = { scrollTo(heroOffset) },
            onFeatureClick = { scrollTo(featureOffset) },
            onCtaClick = { scrollTo(ctaOffset) },
            onDownloadClick = { goToPlayStore() },
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(scrollState)
        ) {

            HeroSection(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = height.dp)
                    .onGloballyPositioned { coordinates ->
                        if (heroOffset != coordinates.positionInParent().y.toInt()) {
                            heroOffset = coordinates.positionInParent().y.toInt()
                        }
                    },
                onDownloadClick = { goToPlayStore() }
            )

            FeatureSection(
                width = width.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = height.dp, max = height.dp * 2)
                    .onGloballyPositioned { coordinates ->
                        if (featureOffset != coordinates.positionInParent().y.toInt()) {
                            featureOffset = coordinates.positionInParent().y.toInt()
                        }
                    }
            )

            CtaSection(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = height.dp)
                    .onGloballyPositioned { coordinates ->
                        if (ctaOffset != coordinates.positionInParent().y.toInt()) {
                            ctaOffset = coordinates.positionInParent().y.toInt()
                        }
                    },
                onDownloadClick = { goToPlayStore() }
            )
        }
    }
}

fun goToPlayStore(){
    window.open("https://play.google.com/store/apps/details?id=mayckgomes.com.dateplan")
}