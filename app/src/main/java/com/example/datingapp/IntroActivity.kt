package com.example.datingapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.datingapp.ui.theme.DatingAppTheme
import com.example.datingapp.ui.theme.Pink

val marcellusfont= FontFamily(Font(R.font.marcellus_regular))
val latoBlack= FontFamily(Font(R.font.lato_light))
val interRegular= FontFamily(Font(R.font.inter_regular))
class IntroActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
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
                                , Alignment.TopEnd
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
                            Box(modifier = Modifier) {
                                Text(
                                    text = "Find your Love \nthroughout this \nUniverse",
                                    modifier = Modifier
                                        .size(294.dp, 137.dp)
                                        .fillMaxSize(),
                                    color = Color.White,
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    fontFamily = latoBlack,
                                    textAlign = TextAlign.Center
                                )
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

                            OutlinedButton(onClick = {
                                val intent = Intent(this@IntroActivity,Loading::class.java)
                                startActivity(intent)
                                finish()
                            },modifier = Modifier.size(340.dp,49.dp)
                                , border = BorderStroke(2.dp, Pink) ) {
                                Text(text = "Sign in"
                                    , fontFamily = interRegular,
                                    fontSize = 20.sp
                                    , color = Pink
                                )
                            }
                        }



                    }
                }
            }
        }

@Composable
fun intro(){

    }


@Preview
@Composable
fun introPreview(){
    intro()
}