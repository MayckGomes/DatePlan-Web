package com.mayckgomes.dateplan_web.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
    onTermsOfUseClick: () -> Unit,
    onGithubClick: () -> Unit,
    onFeedbackClick: () -> Unit,
    onBugReportClick: () -> Unit,
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

        Spacer(modifier = Modifier.width(16.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ){
            StyledButton(
                label = "Policy Privacy",
                onClick = { onPolicyPrivacyClick() },
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f),
            )
            StyledButton(
                label = "Terms of Use",
                onClick = { onTermsOfUseClick() },
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f),
            )
            StyledButton(
                label = "GitHub",
                onClick = { onGithubClick() },
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f)
            )
            StyledButton(
                label = "Feedback Form",
                onClick = { onFeedbackClick() },
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f)
            )
            StyledButton(
                label = "Bug Report",
                onClick = { onBugReportClick() },
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f)
            )
        }

    }

}