package ni.edu.uca.vistas.model

class NumeroAleatorio(private val maxNum: Int) {

    fun generarNumero(): Int {
        return (1..maxNum).random()
    }

}