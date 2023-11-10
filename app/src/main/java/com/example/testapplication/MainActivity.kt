package com.example.testapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.testapplication.ui.theme.TestApplicationTheme
import kotlin.random.Random
import android.widget.Button
//import android.os.Bundle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    add()
                }
            }
        }
    }
}

fun rand(low: Int, high: Int): Int {
    require(!(low > high || high - low + 1 > Int.MAX_VALUE)) { "Invalid range" }
    return Random.nextInt(high - low + 1) + low
}

@Composable
fun add( modifier: Modifier = Modifier) {
    var numa:Int =rand(1,20)
    var numb:Int =rand(1,20)
    Text(
        text = "$numa + $numb =__"
    )
    val ans=readLine()?.toInt()
    if(ans==numa+numb){
        Text(
            text="Well Done"
        )
    }
    /*
    else{
        val tmpans=numa+numb
        Text(
            text="The answer is $tmpans"
        )
   }
   */
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
   // TestApplicationTheme {
     //   Greeting("Android")
    //}
//}