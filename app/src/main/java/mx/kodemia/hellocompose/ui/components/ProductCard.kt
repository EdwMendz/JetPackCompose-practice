package mx.kodemia.hellocompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.kodemia.hellocompose.R
import mx.kodemia.hellocompose.ui.theme.PlatziBlue

//import mx.kodemia.hellocompose.ui.theme.PlatziBlue

@Composable
fun ProfuctCard() {
    Card(
        //Para agregar muchos modifier se debe de agregar un punto
        modifier = Modifier
            .padding(16.dp)
            //fillMaxWidth() toma el ancho de la pantalla
            .fillMaxWidth()
            .size(480.dp)
            //Para hacer click a la tarjeta
            .clickable { },
        elevation = 15.dp,
        shape = MaterialTheme.shapes.medium
    )
    {
        //Dentro de la card va una imagen
        Image(
            painterResource(id = R.drawable.cafe_colombia),
            contentDescription = null
        )
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = PlatziBlue.copy(alpha = 0.2f)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "Café de colombia")
                Text(text = "Café de origen de las montañas")
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Row {
                        Image(painterResource(id = R.drawable.banderita_colombia), contentDescription = null,
                        modifier = Modifier.size(15.dp))
                        Text(text = "$35 USD",
                            modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.End)

                    }
                }
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun ProductCardPreview() {
    ProfuctCard()
}