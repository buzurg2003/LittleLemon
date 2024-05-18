package com.programmer_2003.littlelemon

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.programmer_2003.littlelemon.ui.theme.LittleLemonTheme

@Composable
fun UpperPanel() {
    val context = LocalContext.current
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Color(0xFF495E57)
            )
            .windowInsetsPadding(
                WindowInsets.statusBars
            )
    ) {
        Text(
            text = "Little Lemon",
            fontSize = 32.sp,
            color = Color(0xFFF4CE14),
            modifier = Modifier.padding(
                start = 20.dp,
                top = 5.dp
            )
        )
        Text(
            text = "Chicago",
            fontSize = 24.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier.padding(
                start = 20.dp,
            )
        )
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
        ) {
            Text(
                text = stringResource(id = R.string.description_one),
                Modifier
                    .width(200.dp)
                    .padding(
                        top = 10.dp,
                        bottom = 10.dp,
                        start = 20.dp,
                    ),
                color = Color.White,
                fontSize = 20.sp,
            )
            Image(
                painter = painterResource(id = R.drawable.restaurantfood),
                contentDescription = "",
                Modifier
                    .height(200.dp)
                    .clip(RoundedCornerShape(20.dp)),
            )
        }
        Button(
            onClick = {
                      Toast.makeText(
                          context, "Order Successful!", Toast.LENGTH_SHORT
                      ).show()
            },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(
                    start = 20.dp,
                    bottom = 15.dp
                ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF4CE14),
            ),
        ) {
            Text(
                text = stringResource(R.string.order),
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun UpperPanelPreview() {
    LittleLemonTheme {
        UpperPanel()
    }
}