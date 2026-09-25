import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2vp.R


@Composable
fun Soal2View() {
    var tripHighlightText by remember { mutableStateOf("") }
    var favoriteSpotText by remember { mutableStateOf("") }
    var additionalNotesText by remember { mutableStateOf("") }

    val poppinsFontFamily = FontFamily(
        Font(R.font.poppins_regular, FontWeight.Normal),
        Font(R.font.poppins_medium, FontWeight.Medium),
        Font(R.font.poppins_semibold, FontWeight.SemiBold),
        Font(R.font.poppins_bold, FontWeight.Bold)
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.images),
            contentDescription = "backgroundImage",
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.FillHeight
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.65f)
                    .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                    .background(Color(0xFF22263E))
                    .heightIn(max = 300.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 22.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "My Travel",
                            color = Color.White,
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 24.dp),
                            fontSize = 32.sp
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth().padding(top = 8.dp)) {
                        Text(
                            text = "Aurora",
                            color = Color.White,
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth().padding(top = 6.dp)) {
                        Text(
                            text = "Tromsø, Norway",
                            color = Color(0xFFD0D6E0),
                            fontFamily = poppinsFontFamily,
                            fontSize = 22.sp
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth().padding(top = 8.dp)) {
                        Text(
                            text = "★★★★★ 5.0",
                            color = Color(0xFFFFC107),
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 22.sp
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth().padding(top = 18.dp)) {
                        TextField(
                            value = tripHighlightText,
                            onValueChange = { tripHighlightText = it },
                            placeholder = {
                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.CenterStart
                                ) {
                                    Text(
                                        text = "What did you enjoy most about your trip?",
                                        color = Color(0xFF556070),
                                        fontFamily = poppinsFontFamily,
                                        textAlign = TextAlign.Start,
                                        fontSize = 12.sp
                                    )
                                }
                            },
                            modifier = Modifier
                                .height(58.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(14.dp)),
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color(0xFFEBF1F8),
                                unfocusedContainerColor = Color(0xFFEBF1F8),
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                focusedPlaceholderColor = Color.Gray,
                                unfocusedPlaceholderColor = Color.Gray,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent
                            )
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth().padding(top = 12.dp)) {
                        TextField(
                            value = favoriteSpotText,
                            onValueChange = { favoriteSpotText = it },
                            placeholder = {
                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.CenterStart
                                ) {
                                    Text(
                                        text = "What was your favorite spot?",
                                        color = Color(0xFF556070),
                                        fontFamily = poppinsFontFamily,
                                        textAlign = TextAlign.Start,
                                        fontSize = 12.sp
                                    )
                                }
                            },
                            modifier = Modifier
                                .height(58.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(14.dp)),
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color(0xFFEBF1F8),
                                unfocusedContainerColor = Color(0xFFEBF1F8),
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                focusedPlaceholderColor = Color.Gray,
                                unfocusedPlaceholderColor = Color.Gray,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent
                            )
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth().padding(top = 12.dp)) {
                        TextField(
                            value = additionalNotesText,
                            onValueChange = { additionalNotesText = it },
                            placeholder = {
                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.CenterStart
                                ) {
                                    Text(
                                        text = "Anything else you'd like to add?",
                                        color = Color(0xFF556070),
                                        fontFamily = poppinsFontFamily,
                                        textAlign = TextAlign.Start,
                                        fontSize = 12.sp,
                                    )
                                }
                            },
                            modifier = Modifier
                                .height(58.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(14.dp)),
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color(0xFFEBF1F8),
                                unfocusedContainerColor = Color(0xFFEBF1F8),
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                focusedPlaceholderColor = Color.Gray,
                                unfocusedPlaceholderColor = Color.Gray,
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent
                            )
                        )
                    }
                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 14.dp)
                    ) {
                        FloatingActionButton(
                            onClick = {},
                            shape = RoundedCornerShape(16.dp),
                            modifier = Modifier.size(56.dp),
                            containerColor = Color(0xFFEBF1F8),
                            contentColor = Color(0xFF22263E)
                        ) {
                            Text(
                                text = "+",
                                fontSize = 36.sp,
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight.SemiBold,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Soal2Preview() {
    Soal2View()
}