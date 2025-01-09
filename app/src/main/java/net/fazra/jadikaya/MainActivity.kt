package net.fazra.jadikaya

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import net.fazra.jadikaya.login.LoginScreen
import net.fazra.jadikaya.ui.theme.JadiKayaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JadiKayaTheme {
                LoginScreen()
            }
        }
    }
}