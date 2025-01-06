package net.fazra.jadikaya

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.fazra.jadikaya.ui.theme.JadiKayaTheme
import net.fazra.jadikaya.ui.theme.Black
import net.fazra.jadikaya.ui.theme.White

@Composable
fun LoginScreen() {
    JadiKayaTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.surface // Use the surface color from the theme
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // Add UI components here, for example:
                Text(
                    text = "Login",
                    color = MaterialTheme.colorScheme.primary // Example of using the primary color
                )
            }
        }
    }
}
