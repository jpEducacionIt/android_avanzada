package com.example.primera_clase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var textViewTitulo : TextView
    private lateinit var textViewText : TextView
    private lateinit var textViewFichar : TextView
    private lateinit var textViewSaludar : TextView
    private lateinit var textViewNumeroAlto : TextView
    private lateinit var textViewDeporte : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewTitulo = findViewById(R.id.textViewTitulo)
        textViewText = findViewById(R.id.textViewNombre)
        textViewFichar = findViewById(R.id.textViewFichar)
        textViewSaludar = findViewById(R.id.textViewSaludar)
        textViewNumeroAlto = findViewById(R.id.textViewNumeroAlto)
        textViewDeporte = findViewById(R.id.textViewDeporte)

        ingresarValores()
    }

    private fun ingresarValores() {
        val personaMenor: Menor = Menor("Martin", 32, "Historia", arrayListOf(Deportes.Volley, Deportes.Rugby))
        personaMenor.listarDeportes()

        textViewTitulo.text = TITULO_APP
        textViewText.text = personaMenor.crearSaludo()
        textViewFichar.text = personaMenor.checkEdad()
        textViewNumeroAlto.text = personaMenor.clasePreferida()
        textViewSaludar.text = personaMenor.obtenerApodo()
        textViewDeporte.text = personaMenor.deportePreferido()

        //get y set
        val gente = GenteGetySet()
        gente.nombre = "Pepe"
        println(gente.nombre)

        //data class
        val miPerro = Mascota("Perro", "Pichi", 8)
        miPerro.comida = "Kongo"
        Toast.makeText(this, miPerro.toString(), Toast.LENGTH_SHORT).show()
        val miGato = Mascota("Gato", "Rocio", 5)
        println(miGato)
        if (miPerro.equals(miGato)) { println("Iguales") } else { println("Distintos") }
    }

    companion object {
        const val TITULO_APP : String = "Mi primera App"
    }
}
