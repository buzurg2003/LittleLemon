package com.programmer_2003.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopAppBar() {
    Row(

    ) {
        IconButton(
            onClick = {}
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_hamburger_menu),
                contentDescription = "Menu Icon",
                modifier = Modifier.size(40.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.littlelemon),
            contentDescription = "Little Lemon Logo"
        )
        IconButton(
            onClick = {}
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_cart),
                contentDescription = "Cart"
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun TopAppBarPreview() {
    TopAppBar()
}

// https://www.coursera.org/learn/create-the-user-interface-android-studio/lecture/9h6pZ/material-components