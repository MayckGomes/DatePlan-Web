package com.mayckgomes.dateplan_web.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.mayckgomes.dateplan_web.theme.typography.Alexandria
import com.mayckgomes.dateplanweb.theme.theme.AppTheme
import dateplanweb.composeapp.generated.resources.Res
import dateplanweb.composeapp.generated.resources.logo_imagem
import org.jetbrains.compose.resources.vectorResource

@Composable
fun LogoPlaceholder() {
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