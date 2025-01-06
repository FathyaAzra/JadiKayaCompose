package net.fazra.jadikaya.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import net.fazra.jadikaya.R

val Jakarta = FontFamily(
    listOf(
        Font(resId = R.font.plusjakarta, weight = FontWeight.Bold),
        Font(resId = R.font.plusjakarta, weight = FontWeight.Medium),
        Font(resId = R.font.plusjakarta, weight = FontWeight.Light),
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = Jakarta,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = Jakarta,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    titleMedium = TextStyle(
        fontFamily = Jakarta,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontFamily = Jakarta,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),

)