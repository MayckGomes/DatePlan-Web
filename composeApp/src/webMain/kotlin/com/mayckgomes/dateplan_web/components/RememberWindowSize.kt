package com.mayckgomes.dateplan_web.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalDensity
import kotlinx.browser.window
import org.w3c.dom.events.Event

@Composable
fun rememberWindowSize(): Pair<Float, Float> {
    val density = LocalDensity.current

    var size by remember {
        mutableStateOf(window.innerWidth to window.innerHeight)
    }

    DisposableEffect(Unit) {
        val listener: (Event) -> Unit = {
            size = window.innerWidth to window.innerHeight
        }

        window.addEventListener("resize", listener)

        onDispose {
            window.removeEventListener("resize", listener)
        }
    }

    val widthDp = with(density) { size.first.toDp() }
    val heightDp = with(density) { size.second.toDp() }

    return widthDp.value to heightDp.value
}