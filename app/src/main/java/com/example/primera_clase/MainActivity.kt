package com.example.primera_clase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textViewTitulo : TextView
    private lateinit var textViewText : TextView
    private lateinit var textViewFichar : TextView
    private lateinit var textViewSaludar : TextView
    private lateinit var textViewNumeroAlto : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewTitulo = findViewById(R.id.textViewTitulo)
        textViewText = findViewById(R.id.textViewNombre)
        textViewFichar = findViewById(R.id.textViewFichar)
        textViewSaludar = findViewById(R.id.textViewSaludar)
        textViewNumeroAlto = findViewById(R.id.textViewNumeroAlto)

        ingresarValores()
    }

    private fun ingresarValores() {
        val nombre : String = "Juan"
        val edad = 22

        textViewTitulo.text = TITULO_APP
        textViewText.text = crearSaludo(nombre, edad)
        textViewFichar.text = checkarEdad(nombre, edad)
        textViewNumeroAlto.text = obtenerNumeroAlto()
        textViewSaludar.text = obtenerApodo(nombre)
    }

    private fun obtenerApodo(nombre: String): String {
        val apodo = when (nombre) {
            "Juan" -> "Juancho"
            "Martin" -> "Tincho"
            "Gabriela" -> "Gaby"
            else -> "Fisura"
        }
        return "Como andas $apodo"
    }

    private fun obtenerNumeroAlto(): String {
        val numerosPreferidos = arrayOf(8,9,11,18)
        var numeroAlto : Int = 0
        for (numbers in numerosPreferidos) {
            if (numbers > numeroAlto) numeroAlto = numbers
        }
        return numeroAlto.toString()
    }

    private fun checkarEdad(nombre: String, edad: Int): String {
        val esMenor : Boolean = edad in 0..18
        return if(!esMenor) {
            "$nombre apto para el fichaje"
        } else {
            val edadFaltante : Int = 18 -edad
            "Vuelve dentro de $edadFaltante años"
        }
    }

    private fun crearSaludo(nombre: String, edad: Int): String {
        return "Hola soy $nombre y tengo $edad"
    }

    companion object {
        const val TITULO_APP : String = "Mi primera App"
    }
}
