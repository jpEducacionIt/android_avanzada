package com.example.primera_clase

class Menor(
    private val nombre: String,
    private val edad: Int,
    private val clasePreferida: String,
    private val deportes : List<Deportes>?)
    : Persona(nombre, edad,deportes), AccionesMenor {

    private var isMayorDeEdad : Boolean = false

    init {
        isMayorDeEdad = edad >= 18
    }

    override fun crearSaludo(): String {
        return "Hola soy $nombre y tengo $edad"
    }

    override fun checkEdad(): String {
        val edadFaltante : Int = 18 - edad
        return if (isMayorDeEdad) "$nombre apto para el fichaje"
        else "Vuelve dentro de $edadFaltante años"
    }

    override fun obtenerApodo(): String {
        val apodo = when (nombre) {
            "Juan" -> "Juancho"
            "Martin" -> "Tincho"
            "Gabriela" -> "Gaby"
            else -> "Amigo"
        }
        return "Como andas $apodo"
    }

    override fun deportePreferido(): String {
        return deportes?.firstOrNull()?.showDeporte().toString()
    }

    override fun listarDeportes() {
        deportes?.forEach { Deportes ->
            println(Deportes.showDeporte())
            println("Yo Juego $Deportes")
        }
    }

    override fun clasePreferida(): String {
        return "Mi clase preferida es $clasePreferida"
    }
}
