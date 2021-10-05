package ni.edu.uca.vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonOtroSentido : Button = findViewById(R.id.btnOtro)
        botonOtroSentido.setOnClickListener{
            generarNumeroAleatorio()
        }

        val responderBoton : Button = findViewById(R.id.btnResponder)
        responderBoton.setOnClickListener{
            verificarRespuesta()
        }
    }

    private fun generarNumeroAleatorio() {
        val num = NumeroAleatorio(5)
        val nAleatorio = num.generarNumero()

        val imagenSentido: ImageView = findViewById(R.id.img_Sentido)

        when (nAleatorio) {
            1 -> imagenSentido.setImageResource(R.drawable.img1)
            2 -> imagenSentido.setImageResource(R.drawable.img2)
            3 -> imagenSentido.setImageResource(R.drawable.img3)
            4 -> imagenSentido.setImageResource(R.drawable.img4)
            5 -> imagenSentido.setImageResource(R.drawable.img5)
        }
    }

    private fun verificarRespuesta(){

    }
}