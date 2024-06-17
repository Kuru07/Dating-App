package com.example.datingapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.datingapp.R.color.pink

@Composable
fun homepage(){
    Column (modifier= Modifier
        .fillMaxSize()
        .background(Color.Black)
        .padding(top = 10.dp)){
        Row(modifier=Modifier.padding(start = 38.dp)) {
                Text(text = "Good Evening, Laura"
                , fontFamily = interRegular
                , fontSize = 24.sp
                , color = Color.White)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier=Modifier.padding(start = 38.dp), horizontalArrangement = Arrangement.Center
        , verticalAlignment = Alignment.Bottom) {
            Text("New Matches"
            ,color= Color.White
            , fontFamily = interRegular
            , fontSize = 18.sp)
            Spacer(modifier = Modifier.padding(end = 150.dp))
            Text(text = "View more"
                , color = Color(0xFFFFB6F8)
                , fontFamily = interRegular
                , fontSize = 13.sp
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row(modifier = Modifier
            .size(500.dp, 130.dp)
            .fillMaxWidth()
            .padding(start = 40.dp)
            .horizontalScroll(rememberScrollState())
        , verticalAlignment = Alignment.CenterVertically
        , horizontalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.rectangle7), contentDescription = "iamge"
                ,modifier=Modifier.size(100.dp))
            Spacer(modifier = Modifier.padding(end=30.dp))
            Image(painter = painterResource(id = R.drawable.rectangle8), contentDescription = "iamge"
                ,modifier=Modifier.size(100.dp))
            Spacer(modifier = Modifier.padding(end=30.dp))
            Image(painter = painterResource(id = R.drawable.rectangle9), contentDescription = "iamge"
                ,modifier=Modifier.height(100.dp)
            , contentScale = ContentScale.FillHeight)
            Spacer(modifier = Modifier.padding(end=30.dp))
            Image(painter = painterResource(id = R.drawable.rectangle8), contentDescription = "iamge"
                ,modifier=Modifier.size(100.dp))
            Spacer(modifier = Modifier.padding(end=30.dp))
            Image(painter = painterResource(id = R.drawable.rectangle8), contentDescription = "iamge"
                ,modifier=Modifier.size(100.dp))


        }
        Spacer(modifier = Modifier.height(25.dp))
        Row(modifier=Modifier.padding(start = 38.dp), horizontalArrangement = Arrangement.Center
            , verticalAlignment = Alignment.Bottom) {
            Text("Your Dates"
                ,color= Color.White
                , fontFamily = interRegular
                , fontSize = 18.sp)
            Spacer(modifier = Modifier.padding(end = 180.dp))
            Text(text = "View more"
                , color = Color(0xFFFFB6F8)
                , fontFamily = interRegular
                , fontSize = 13.sp
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row(modifier = Modifier
            .size(500.dp, 130.dp)
            .fillMaxWidth()
            .padding(start = 40.dp)
            .horizontalScroll(rememberScrollState())
            , verticalAlignment = Alignment.CenterVertically
            , horizontalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.rectngle10), contentDescription = "iamge"
                ,modifier=Modifier.size(100.dp))
            Spacer(modifier = Modifier.padding(end=30.dp))
            Image(painter = painterResource(id = R.drawable.rectangle11), contentDescription = "iamge"
                ,modifier=Modifier.size(100.dp))
            Spacer(modifier = Modifier.padding(end=30.dp))
            Image(painter = painterResource(id = R.drawable.rectangle12), contentDescription = "iamge"
                ,modifier=Modifier.height(100.dp)
                , contentScale = ContentScale.FillHeight)
            Spacer(modifier = Modifier.padding(end=30.dp))
            Image(painter = painterResource(id = R.drawable.rectangle8), contentDescription = "iamge"
                ,modifier=Modifier.size(100.dp))
            Spacer(modifier = Modifier.padding(end=30.dp))
            Image(painter = painterResource(id = R.drawable.rectangle8), contentDescription = "iamge"
                ,modifier=Modifier.size(100.dp))
            Spacer(modifier = Modifier.padding(end=30.dp))
            Image(painter = painterResource(id = R.drawable.rectangle8), contentDescription = "iamge"
                ,modifier=Modifier.size(100.dp))
        }
        Spacer(modifier = Modifier.height(25.dp))
        Row(modifier=Modifier.padding(start = 38.dp), horizontalArrangement = Arrangement.Center
            , verticalAlignment = Alignment.Bottom) {
            Text("Near You"
                ,color= Color.White
                , fontFamily = interRegular
                , fontSize = 18.sp)
            Spacer(modifier = Modifier.padding(end = 190.dp))
            Text(text = "View more"
                , color = Color(0xFFFFB6F8)
                , fontFamily = interRegular
                , fontSize = 13.sp
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row(modifier = Modifier
            .size(500.dp, 130.dp)
            .fillMaxWidth()
            .padding(start = 40.dp)
            .horizontalScroll(rememberScrollState())
            , verticalAlignment = Alignment.CenterVertically
            , horizontalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.rectangle13), contentDescription = "iamge"
                ,modifier=Modifier.size(100.dp))
            Spacer(modifier = Modifier.padding(end=30.dp))
            Image(painter = painterResource(id = R.drawable.rectangle14), contentDescription = "iamge"
                ,modifier=Modifier.size(100.dp))
            Spacer(modifier = Modifier.padding(end=30.dp))
            Image(painter = painterResource(id = R.drawable.rectangle15), contentDescription = "iamge"
                ,modifier=Modifier.height(100.dp)
                , contentScale = ContentScale.FillHeight)
            Spacer(modifier = Modifier.padding(end=30.dp))
            Image(painter = painterResource(id = R.drawable.rectangle8), contentDescription = "iamge"
                ,modifier=Modifier.size(100.dp))
            Spacer(modifier = Modifier.padding(end=30.dp))
            Image(painter = painterResource(id = R.drawable.rectangle8), contentDescription = "iamge"
                ,modifier=Modifier.size(100.dp))
            Spacer(modifier = Modifier.padding(end=30.dp))
            Image(painter = painterResource(id = R.drawable.rectangle8), contentDescription = "iamge"
                ,modifier=Modifier.size(100.dp))
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun homepreview(){
    homepage()
}