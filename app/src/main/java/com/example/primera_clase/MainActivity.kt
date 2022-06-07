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
        val persona_menor: Menor = Menor("Martin", 32, "Historia", arrayListOf(Deportes.Volley, Deportes.Rugby))

        textViewTitulo.text = TITULO_APP
        textViewText.text = persona_menor.crearSaludo()
        textViewFichar.text = persona_menor.checkEdad()
        textViewNumeroAlto.text = persona_menor.clasePreferida()
        textViewSaludar.text = persona_menor.obtenerApodo()
        textViewDeporte.text = persona_menor.deportePreferido()
    }

    companion object {
        const val TITULO_APP : String = "Mi primera App"
    }
}
