package com.example.callforfiretool.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary            = Olive600,
    onPrimary          = Olive50,
    primaryContainer   = Olive100,
    onPrimaryContainer = Olive800,

    secondary            = Tan600,
    onSecondary          = Tan50,
    secondaryContainer   = Tan100,
    onSecondaryContainer = Tan800,

    tertiary            = Slate600,
    onTertiary          = Slate50,
    tertiaryContainer   = Slate100,
    onTertiaryContainer = Slate800,

    background   = Slate50,
    onBackground = Slate900,

    surface          = Tan50,
    onSurface        = Slate900,
    surfaceVariant   = Slate100,
    onSurfaceVariant = Slate600,

    error        = Red400,
    onError      = Red50,
    errorContainer   = Red100,
    onErrorContainer = Red800,

    outline        = Slate200,
    outlineVariant = Slate100,
)

private val DarkColorScheme = darkColorScheme(
    primary            = Olive400,
    onPrimary          = Olive900,
    primaryContainer   = Olive800,
    onPrimaryContainer = Olive100,

    secondary            = Tan400,
    onSecondary          = Tan900,
    secondaryContainer   = Tan800,
    onSecondaryContainer = Tan100,

    tertiary            = Slate400,
    onTertiary          = Slate900,
    tertiaryContainer   = Slate800,
    onTertiaryContainer = Slate100,

    background   = Slate900,
    onBackground = Slate50,

    surface          = Slate800,
    onSurface        = Slate50,
    surfaceVariant   = Slate800,
    onSurfaceVariant = Slate200,

    error        = Red400,
    onError      = Red600,
    errorContainer   = Red800,
    onErrorContainer = Red100,

    outline        = Slate600,
    outlineVariant = Slate800,
)

@Composable
fun CallForFireToolTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography  = Typography,
        content     = content,
    )
}