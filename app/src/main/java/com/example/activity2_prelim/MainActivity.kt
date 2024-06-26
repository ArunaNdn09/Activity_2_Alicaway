package com.example.activity2_prelim

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activity2_prelim.ui.theme.ACTIVITY2_PRELIMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ACTIVITY2_PRELIMTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CenterContent {
                        Image(
                            painter = painterResource(id = R.drawable.checknobg),
                            contentDescription = null,
                            modifier = Modifier.size(150.dp),
                        )
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Greeting("ALL TASKS COMPLETED!",fontSize=23.sp, fontWeight = FontWeight.Bold, paddingTop = 180.dp, paddingBottom =5.dp)
                            Greeting("Nice Work!", fontSize = 16.sp, paddingTop = 10.dp)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun CenterContent(content: @Composable () -> Unit) {
    ox(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}

@Composable
fun Greeting(
    text: String,
    modifier: Modifier = Modifier,
    fontWeight: FontWeight? = null,
    fontSize: androidx.compose.ui.unit.TextUnit? = null,
    paddingTop: androidx.compose.ui.unit.Dp? = null,
    paddingBottom: androidx.compose.ui.unit.Dp? = null
) {
    Text(
        text = text,
        modifier = modifier.padding(top = paddingTop ?: 0.dp, bottom = paddingBottom ?: 0.dp),
        style = MaterialTheme.typography.headlineLarge.copy(
            fontWeight = fontWeight,
            fontSize = fontSize ?: MaterialTheme.typography.headlineLarge.fontSize
        )
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ACTIVITY2_PRELIMTheme {
        CenterContent {
            Image(
                painter = painterResource(id = R.drawable.checknobg),
                contentDescription = null,
                modifier = Modifier.size(150.dp),
            )
            CenterContent {
                Greeting(
                    "ALL TASKS COMPLETED!",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    paddingTop = 155.dp,
                    paddingBottom = 8.dp
                )
                Greeting("Nice work!", fontSize = 16.sp, paddingTop = 205.dp)
            }
        }
    }
}


