package net.fazra.jadikaya.login

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.android.gms.auth.api.signin.GoogleSignIn
import net.fazra.jadikaya.ui.theme.JadiKayaTheme

@Composable
fun LoginScreen() {
    val context = LocalContext.current
    val authViewModel: AuthViewModel = viewModel(factory = AuthViewModelFactory(context))
    val user by authViewModel.user.collectAsState()

    val signInLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) { result ->
        val task = GoogleSignIn.getSignedInAccountFromIntent(result.data)
        try {
            val account = task.result
            account?.idToken?.let { authViewModel.signInWithCredential(it) }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    JadiKayaTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.surface
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                if (user == null) {
                    Text(text = "Login", color = MaterialTheme.colorScheme.primary)
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = { signInLauncher.launch(authViewModel.getSignInIntent()) }) {
                        Text(text = "Sign in with Google")
                    }
                } else {
                    Text(text = "Welcome, ${user?.displayName ?: "User"}")
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = { authViewModel.signOut() }) {
                        Text(text = "Sign Out")
                    }
                }
            }
        }
    }
}
