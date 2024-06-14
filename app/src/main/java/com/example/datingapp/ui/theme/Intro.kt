package com.example.datingapp.ui.theme

import android.widget.TextView
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.datingapp.MainContent
import com.example.datingapp.R
import com.example.datingapp.R.color.white

@Composable
fun introScreen(){
    val marcellusfont= FontFamily(Font(R.font.marcellus_regular))
    val latoBlack= FontFamily(Font(R.font.lato_light))
    val interRegular= FontFamily(Font(R.font.inter_regular))
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 51.dp, start = 39.dp)
            .height(44.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(R.drawable.heart), contentDescription = "heart"
            , modifier = Modifier
                    .size(40.dp)
                    .padding(top = 5.dp)
                    ,Alignment.TopEnd
            )
            Spacer(modifier = Modifier.padding(end = 12.dp))
            Text(
                text = "PAIRLY",
                modifier = Modifier,
                color = Color.White,
                fontSize = 35.sp,
                fontFamily = marcellusfont,
                letterSpacing = 5.sp
            )
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ){
            Image(painter = painterResource(R.drawable.moonmoon)
                , contentDescription = "moon"
            , modifier = Modifier.size(210.dp))
            Spacer(modifier = Modifier.height(57.dp))
            Box(modifier = Modifier){
                Text(text = "Find your Love throughout this Universe",
                    modifier = Modifier
                        .size(294.dp, 137.dp)
                        .fillMaxSize(),
                    color = Color.White,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = latoBlack,
                    textAlign = TextAlign.Center)

            }
            Spacer(modifier = Modifier.height(122.dp))

            Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(340.dp, 49.dp)
                        ,colors = ButtonDefaults.buttonColors(
                        containerColor = Pink,
                        contentColor = Color.White // Text color
                    )) {
                        Text(text = "Create Account"
                        , fontFamily = interRegular
                        , fontSize = 20.sp)
                }
            Spacer(modifier = Modifier.height(30.dp))

                OutlinedButton(onClick = { /*TODO*/ },modifier = Modifier.size(340.dp,49.dp)
                    , border = BorderStroke(2.dp, Pink) ) {
                    Text(text = "Sign in"
                        , fontFamily = interRegular,
                        fontSize = 20.sp
                    , color = Pink)
                }
        }



    }
}



@Preview(showSystemUi = true, showBackground = true)
@Composable
fun introScreenPreview(){
    Box(modifier = Modifier) {
        introScreen()
    }
}