package com.mayckgomes.dateplan_web.components.objects

import androidx.compose.runtime.Composable
import dateplanweb.composeapp.generated.resources.Res
import dateplanweb.composeapp.generated.resources._1
import dateplanweb.composeapp.generated.resources._2
import dateplanweb.composeapp.generated.resources._3
import dateplanweb.composeapp.generated.resources._4
import dateplanweb.composeapp.generated.resources._5
import org.jetbrains.compose.resources.painterResource

object AppImages {

    val image1 @Composable get() = painterResource(resource = Res.drawable._1)
    val image2 @Composable get() = painterResource(resource = Res.drawable._2)
    val image3 @Composable get() = painterResource(resource = Res.drawable._3)
    val image4 @Composable get() = painterResource(resource = Res.drawable._4)
    val image5 @Composable get() = painterResource(resource = Res.drawable._5)

}