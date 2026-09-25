import com.example.week2vp.R

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.SkipPrevious
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val bgPink = Color(0xFFF7A8A8)
val lyricsBoxColor = Color(0xFF3B0A0A)

@Composable
fun Soal1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(bgPink)
            .padding(horizontal = 20.dp)
    ) {

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "15:00", fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Text(text = "wifi bat", fontSize = 10.sp, color = Color.DarkGray)
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = null)
            Text(text = "Liked Songs", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)
        }

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color.White)
                .padding(6.dp)
        ) {
            // album image, using image.jpeg as placeholder
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "album cover",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(4.dp)),
                contentScale = ContentScale.Crop
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(text = "Blinding Lights", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                Text(text = "The Weeknd", fontSize = 14.sp, color = Color.DarkGray)
            }
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "liked",
                tint = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // progress bar, just did it with a box instead of Slider bc easier
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
                .background(Color.Black.copy(alpha = 0.3f))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.15f)
                    .height(3.dp)
                    .background(Color.Black)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "0:20", fontSize = 12.sp)
            Text(text = "-2:41", fontSize = 12.sp)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.SkipPrevious,
                    contentDescription = null,
                    modifier = Modifier.size(36.dp)
                )
            }

            Box(
                modifier = Modifier
                    .size(64.dp)
                    .clip(RoundedCornerShape(50))
                    .background(Color.Black),
                contentAlignment = Alignment.Center
            ) {
                IconButton(onClick = { /*TODO pause logic*/ }) {
                    Icon(
                        imageVector = Icons.Default.Pause,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(32.dp)
                    )
                }
            }

            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.SkipNext,
                    contentDescription = null,
                    modifier = Modifier.size(36.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        LyricsCard()
    }
}

@Composable
fun LyricsCard() {
    val lyrics = "Yeah\n" +
            "I've been tryna call\n" +
            "I've been on my own for long enough\n" +
            "Maybe you can show me how to love, maybe\n" +
            "I'm going through withdrawals\n" +
            "You don't even have to do too much\n" +
            "You can turn me on with just a touch, baby\n" +
            "I look around and\n" +
            "Sin City's cold and empty (oh)\n" +
            "No one's around to judge me (oh)\n" +
            "I can't see clearly when you're gone"

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .background(lyricsBoxColor)
            .padding(20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = "Lyrics",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = lyrics,
                color = Color.White.copy(alpha = 0.85f),
                fontSize = 16.sp,
                lineHeight = 26.sp
            )
            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}