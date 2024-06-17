package com.example.datingapp

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.datingapp.ui.theme.Pik
import com.example.datingapp.ui.theme.Pink

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun serach(){
    var text by remember {
        mutableStateOf("")
    }
    var active by remember {
        mutableStateOf(false)
    }
    var serachHistory = remember {
        mutableListOf("")
    }
    Spacer(modifier = Modifier.height(30.dp))
    SearchBar(modifier = Modifier.fillMaxWidth()
        .padding(20.dp),
        colors = SearchBarDefaults.colors(
            containerColor = Pik ,
            dividerColor = Color.Black) ,
        query = text,
        onQueryChange = {
            text = it
        },
        onSearch = {
            active = false
        },
        active = active,
        onActiveChange = {
            active = it
        },
        placeholder = {
            Text(text = "Enter your query")
        },
        trailingIcon = {
            Icon(imageVector =
            Icons.Default.Search, contentDescription = null)
            if (active) {
                Icon(
                    modifier = Modifier.clickable {
                        if (text.isNotEmpty()) {
                            text = ""
                        } else {
                            active = false
                        }
                    },
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close icon"
                )
            }
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = "Search icon")
        }) {
        serachHistory.forEach {
            if (it.isNotEmpty()) {
                Row(modifier = Modifier.padding(all = 14.dp)) {
                    Icon(imageVector = Icons.Default.History,           contentDescription = null)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = it)
                }
            }
        }
        Divider()
        Text(
            modifier = Modifier
                .padding(all = 14.dp)
                .fillMaxWidth()
                .clickable {
                    serachHistory.clear()
                },
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            text = "clear all history"
        )

    }
    

    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun serachpreview(){
    Column(modifier= Modifier
        .background(Color.Black)
        .fillMaxSize()) {
        serach()
    }

}