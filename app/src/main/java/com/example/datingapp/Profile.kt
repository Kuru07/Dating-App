package com.example.datingapp

import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.datingapp.ui.theme.Pink

@Composable
fun profile(){
    Column(modifier= Modifier
        .background(Color.Black)
        .fillMaxSize()
        , verticalArrangement = Arrangement.Center
    , horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.padding(top=20.dp))
        Image(painter = painterResource(R.drawable.profie)
            , contentDescription ="profile"
        ,modifier=Modifier.size(360.dp,420.dp))
        Spacer(modifier = Modifier.height(10.dp))
        Box(modifier= Modifier
            .align(Alignment.Start)
            .padding(start = 40.dp)) {
            Text(text = "Laura Stenzen"
                , color = Color.White
                , fontFamily = interRegular
                , fontSize = 26.sp)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier
            .padding(start = 40.dp)
            .align(Alignment.Start)) {
            Image(painter = painterResource(id = R.drawable.locicon)
                , contentDescription = "icon"
            , modifier = Modifier.size(18.dp))
            Image(painter = painterResource(id = R.drawable.location)
                , contentDescription = "text"
            ,modifier = Modifier.size(73.dp,17.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box (modifier = Modifier.padding(start=40.dp,end=40.dp)){

            Text(
                text = "Hi there✌\uFE0F...I’m Laura,Seeking for true Love❤\uFE0FReady to Date✨",
                color = Color.White,
                fontFamily = interRegular,
                fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row (modifier= Modifier
            .padding(start = 40.dp)
            .align(Alignment.Start)){
                OutlinedButton(onClick = { /*TODO*/ }
                , modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black
                    ),
                    border = BorderStroke(2.dp, Pink)) {
                    Text(text = "28 Connections"
                    , color = Pink
                    , fontFamily = interRegular
                    , fontSize = 15.sp)
                }
            Spacer(modifier = Modifier.padding(end=50.dp))
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Pink
                    )) {
                    Text(text = "143\uD83E\uDD0D"
                    , fontFamily = interRegular
                    , color = Color.White
                    , fontSize = 18.sp)
                }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box (modifier = Modifier
            .align(Alignment.Start)
            .padding(start = 40.dp)){
            OutlinedButton(onClick = { /*TODO*/ }
                , modifier = Modifier.width(310.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black
                ),
                border = BorderStroke(2.dp, Pink)) {
                Text(text = "Edit Profile"
                    , color = Pink
                    , fontFamily = interRegular
                    , fontSize = 17.sp)
            }
        }

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun profprev(){
    profile()
}