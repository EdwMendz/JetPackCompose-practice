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
import mx.kodemia.hellocompose.ui.theme.HelloComposeTheme
import mx.kodemia.hellocompose.ui.theme.PlatziBlue


enum class CountryISO(val iso: String){
    COL("COL"),
    BRA("BRA"),
    CRI("CRI"),
    NIC("NIC");

    fun getBackgroundImage(): Int {
        when (this){
            COL -> return R.drawable.banderita_colombia
            BRA -> return R.drawable.banderita_colombia
            CRI -> return R.drawable.banderita_colombia
            NIC -> return R.drawable.banderita_colombia
        }
    }
    fun getCountryFlag(): Int {
        when (this){
            COL -> return R.drawable.banderita_colombia
            BRA -> return R.drawable.banderita_colombia
            CRI -> return R.drawable.banderita_colombia
            NIC -> return R.drawable.banderita_colombia
        }
    }



}


@Composable
fun ProfuctCard(name:String,
                summary:String,
                price:Double,
                currency: String) {
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
                Text(name,
                    style = MaterialTheme.typography.h4)
                Text(summary,
                style = MaterialTheme.typography.body1)
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Row {
                        Image(
                            painterResource(id = R.drawable.banderita_colombia),
                            contentDescription = null,
                            modifier = Modifier.size(32.dp, 32.dp)
                        )
                        Text(
                            text = "$ $price $currency",
                            modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.End,
                            style = MaterialTheme.typography.h4
                        )

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
    HelloComposeTheme{
        ProfuctCard("Café de colombia", "Café de las montañas",
                35.0,"USD")
    }
}