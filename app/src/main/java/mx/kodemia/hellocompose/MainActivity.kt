package mx.kodemia.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import mx.kodemia.hellocompose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                HelloCompose()
            }
        }
    }
@Composable
fun HelloCompose(){
    Column {
        Image(painterResource(id =  R.drawable.platzi) ,
            contentDescription = null)
        Text("Este curso es lo mejor")
        Text("Hola, hermoso Edwin :D")
        Button(onClick = {

        }) {
            Text("Click me")
        }
    }
}

@Preview(
 showBackground = true
)
@Composable
fun HelloComposePreview(){
    HelloCompose()
}


