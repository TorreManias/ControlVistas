package ni.edu.uca.vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private var SENTIDO_ACTUAL = "SENTIDO"

    private val VISTA = "vista"
    private val GUSTO = "gusto"
    private val OLFATO = "olfato"
    private val OIDO = "oido"
    private val TACTO = "tacto"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generarNumeroAleatorio()

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

        when (nAleatorio) {
            1 -> SENTIDO_ACTUAL = OIDO
            2 -> SENTIDO_ACTUAL = VISTA
            3 -> SENTIDO_ACTUAL = GUSTO
            4 -> SENTIDO_ACTUAL = OLFATO
            5 -> SENTIDO_ACTUAL = TACTO
        }
    }

    private fun verificarRespuesta(){

    }
}