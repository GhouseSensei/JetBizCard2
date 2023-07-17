package com.example.jetbizcard

import android.icu.text.ListFormatter.Width
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetbizcard.ui.theme.JetBizCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetBizCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CreateBizCard()
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}

@Composable
fun CreateBizCard(){
    Surface(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()) {
        
    }
    Card(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(15.dp),
        elevation = 15.dp,
        shape = RoundedCornerShape(corner = CornerSize(15.dp)
        )){
        Column(modifier = Modifier.height(300.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

            ) {

            CreateImageProfile()
            Divider()
            CreateInfo()
            
        }
    }


}

@Composable
private fun CreateInfo() {
    Column(modifier = Modifier.padding(5.dp)) {
        Text(
            text = "Miles Morales",
            style = MaterialTheme.typography.h4,
            color = MaterialTheme.colors.primaryVariant
        )
        Text(
            text = "Android Compose Programmer",
            modifier = Modifier.padding(3.dp)
        )
        Text(
            text = "@moralesmiles",
            modifier = Modifier.padding(3.dp),
            style = MaterialTheme.typography.subtitle1
        )

    }
}

@Composable
private fun CreateImageProfile(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .size(150.dp)
            .padding(5.dp),
        shape = CircleShape,
        border = BorderStroke(1.dp, Color.LightGray),
        elevation = 8.dp,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.1f)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "pfp",
            //modifier = Modifier.size(135.dp),
            //contentScale = ContentScale.Crop
        )


    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetBizCardTheme {
        CreateBizCard()
    }
}