package com.example.datingapp

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.datingapp.ui.theme.DatingAppTheme
import com.example.datingapp.ui.theme.Pink

@Composable
fun notifications(){
    var buto by remember {
        mutableStateOf(0)
    }
    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxSize()) {
        Row(modifier = Modifier.padding(top = 40.dp, start = 51.dp)){
            Button(onClick = { buto =1},
                modifier = Modifier
                    .size(80.dp,45.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Pink
                )) {
                Text(text = "All"
                , fontFamily = interRegular
                , fontSize = 19 .sp
                , color = Color.White)
            }
            Spacer(modifier = Modifier.padding(end = 25.dp))
            OutlinedButton(onClick = { buto=2 },
                modifier = Modifier
                    .size(100.dp,45.dp),
                border = BorderStroke(2.dp, Pink)
            ) {
                Text(text = "New"
                , fontFamily = interRegular
                , fontSize = 19.sp
                , color = Pink)
            }
        }
            if(buto==2)
                newNotification()
            else
                allnotification()

    }
}

@Composable
fun newNotification(){
    Column(modifier = Modifier.padding(top = 20.dp)) {
        rowNotification(text = "John requested you to follow.", backgroundcolour = Pink ,R.drawable.profile1)
        rowNotification(text = "Katropolis sent you a message.", backgroundcolour = Pink,R.drawable.profile2)
        rowNotification(text = "Harry sent you a message.", backgroundcolour = Pink,R.drawable.profile3 )
        rowNotification(text = "Aaron liked your profile.", backgroundcolour = Pink,R.drawable.profile4 )
    }

}

@Composable
fun allnotification(){
    Column(modifier = Modifier.padding(top = 20.dp)) {
        rowNotification(text = "John requested you to follow.", backgroundcolour = Pink ,R.drawable.profile1)
        rowNotification(text = "Katropolis sent you a message.", backgroundcolour = Pink,R.drawable.profile2)
        rowNotification(text = "Harry sent you a message.", backgroundcolour = Pink,R.drawable.profile3 )
        rowNotification(text = "Aaron liked your profile.", backgroundcolour = Pink,R.drawable.profile4 )
        rowNotification(text = "Rhyss Lauren liked your profile.", backgroundcolour = Color.Black,R.drawable.profile5 )

    }
}

@Composable
fun rowNotification(text:String,backgroundcolour:Color,imageid:Int){
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(backgroundcolour)
        .size(50.dp)
        .shadow(elevation = 7.dp, spotColor = Color.Black)
        , verticalAlignment = Alignment.CenterVertically
        , horizontalArrangement = Arrangement.Start) {

        Image(painter = painterResource(imageid), contentDescription = "profile image" , modifier = Modifier.padding(3.dp))
        Text(text=text
            , color = Color.White
            , textAlign = TextAlign.Start
            , fontFamily = interRegular
            , fontSize = 19.sp
        , modifier = Modifier.padding(start = 30.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun preview(){
    notifications()
}