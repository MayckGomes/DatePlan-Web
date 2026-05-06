package com.mayckgomes.dateplan_web.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mayckgomes.dateplan_web.components.LogoPlaceholder
import com.mayckgomes.dateplan_web.components.StyledButton

@Composable
fun FooterSection(
    onPolicyPrivacyClick: () -> Unit,
    onGithubClick: () -> Unit,
) {

    val backgroundColor = if(isSystemInDarkTheme()) {
        Color.Black
    } else {
        Color.White
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .background(backgroundColor)
            .padding(horizontal = 40.dp, vertical = 80.dp)
    ) {

        LogoPlaceholder()

        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ){
            StyledButton(
                label = "Policy privacy",
                onClick = { onPolicyPrivacyClick() },
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f),
            )
            StyledButton(
                label = "GitHub",
                onClick = { onGithubClick() },
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f)
            )
        }

    }

}