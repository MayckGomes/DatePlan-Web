package com.mayckgomes.dateplan_web.components.objects

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import dateplanweb.composeapp.generated.resources.Res
import dateplanweb.composeapp.generated.resources.arrow_left
import org.jetbrains.compose.resources.vectorResource

object Icons {

    val BackArrow: ImageVector
        @Composable get() = vectorResource(Res.drawable.arrow_left)
}