package com.example.datingapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.datingapp.ui.theme.DatingAppTheme
import com.example.datingapp.ui.theme.Pink

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ){
                MainContent()

            }
        }
    }
}
data class TabItem(
    val title:String,
    val unSelectedIcon:ImageVector,
    val selectedicon:ImageVector,
)


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainContent(){
    val tabitems = listOf(
        TabItem(
            title = "Home",
            unSelectedIcon = Icons.Outlined.Home,
            selectedicon = Icons.Outlined.Home
        ),
        TabItem(
            title = "Browse",
            unSelectedIcon = Icons.Outlined.Search,
            selectedicon = Icons.Outlined.Search
        ),
        TabItem(
            title = "Notification",
            unSelectedIcon = Icons.Outlined.Notifications,
            selectedicon = Icons.Outlined.Notifications
        ),
        TabItem(
            title = "Account",
            unSelectedIcon = Icons.Outlined.AccountCircle,
            selectedicon = Icons.Outlined.AccountCircle
        ),

        )
    var selectedTabIndex by remember {
        mutableIntStateOf(0)
    }
    val pagerState = rememberPagerState {
        tabitems.size
    }
    LaunchedEffect(selectedTabIndex){
        pagerState.animateScrollToPage(selectedTabIndex)
    }
    LaunchedEffect(pagerState.currentPage,pagerState.isScrollInProgress){
        if(!pagerState.isScrollInProgress){
            selectedTabIndex=pagerState.currentPage}
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {
        if(pagerState.currentPage==3)
            topIcons2()
        else
            topIcons()
        HorizontalPager(state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
                .background(Color.Black)) {index->
            Box(modifier = Modifier.fillMaxSize()){
                if(pagerState.currentPage==2)
                {
                    notifications()
                }
                else if(pagerState.currentPage==0)
                {
                    homepage()
                }
                else if(pagerState.currentPage==1)
                {
                    serach()
                }
                else{
                    profile()
                }
            }

        }

        TabRow(
            selectedTabIndex = selectedTabIndex, modifier = Modifier
                .fillMaxWidth(),
            containerColor = Color.Black,
            contentColor = Pink
        ) {
            tabitems.forEachIndexed { index, item ->
                val isSelected = selectedTabIndex==index
                val scale = if(isSelected) 1.2f else 1f
                Tab(
                    selected = index == selectedTabIndex,
                    onClick = {
                        selectedTabIndex = index
                    }
                    ,icon = {
                        Icon(
                            imageVector = if (index == selectedTabIndex) {
                                item.selectedicon
                            } else item.unSelectedIcon,
                            tint = if(selectedTabIndex==index){
                                Pink }
                            else
                                Color.White,
                            contentDescription = null
                        )
                    })
            }
        }
    }
}
@Composable
fun topIcons(){
    val context = LocalContext.current
    val activity = context as? Activity
    Row (modifier = Modifier.padding(top = 60.dp, start = 30.dp, end = 30.dp)){
        Image(painter = painterResource(R.drawable.chevron_icon)
            , contentDescription = "Chevron icon"
            , modifier = Modifier
                .size(30.dp)
                .align(Alignment.CenterVertically)
                .clickable {
                    activity?.finish()
                }
            , colorFilter = ColorFilter.tint(Color.White))
        Spacer(modifier = Modifier.padding(end = 270.dp))
        Image(painter = painterResource(R.drawable.messgae_icon)
            , contentDescription = "Message icon"
            , modifier = Modifier
                .size(30.dp)
                .align(Alignment.CenterVertically)
                .clickable {
                    context.startActivity(Intent(context, Message::class.java))
                }
            , colorFilter = ColorFilter.tint(Color.White))
    }
}
@Composable
fun topIcons2(){
    val context = LocalContext.current
    val activity = context as? Activity
    Row (modifier = Modifier.padding(top = 60.dp, start = 30.dp, end = 30.dp)){
        Image(painter = painterResource(R.drawable.chevron_icon)
            , contentDescription = "Chevron icon"
            , modifier = Modifier
                .size(30.dp)
                .align(Alignment.CenterVertically)
                .clickable {
                    activity?.finish()
                }
            , colorFilter = ColorFilter.tint(Color.White)
        )
        Spacer(modifier = Modifier.padding(end = 83.dp))
        Text(text = "My Profile"
        , color = Color.White
        , fontFamily = interRegular
        , fontSize = 23.sp)
        Spacer(modifier = Modifier.padding(end = 70.dp))
        Image(painter = painterResource(R.drawable.hamburger_ico)
            , contentDescription = "Hamburger icon"
            , modifier = Modifier
                .size(30.dp)
                .align(Alignment.CenterVertically)
                .clickable {
                    println("Hello")
                }
            , colorFilter = ColorFilter.tint(Color.White))
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Tabpreview() {
    DatingAppTheme {
       MainContent()

    }
}