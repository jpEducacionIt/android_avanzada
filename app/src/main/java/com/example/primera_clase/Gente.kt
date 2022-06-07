package com.example.primera_clase

class Gente(
    private val nombre: String,
    private val edad: Int,
    private val numeros: List<Int>,
    private val deportes : List<Deportes>?) {

    private var isMayorDeEdad : Boolean = false

    init {
        isMayorDeEdad = edad >= 18
    }

    inner class OperacionesPersona() {
        fun crearSaludo(): String {
            return "Hola soy $nombre y tengo $edad"
        }

        fun checkEdad(): String {
            val edadFaltante : Int = 18 -edad
            return if (isMayorDeEdad) "$nombre apto para el fichaje" else "Vuelve dentro de $edadFaltante años"
        }

        fun obtenerApodo(): String {
            val apodo = when (nombre) {
                "Juan" -> "Juancho"
                "Martin" -> "Tincho"
                "Gabriela" -> "Gaby"
                else -> "Amigo"
            }
            return "Como andas $apodo"
        }

        fun obtenerNumeroAlto(): String {
            var numeroAlto : Int = 0
            for (numbers in numeros) {
                if (numbers > numeroAlto) numeroAlto = numbers
            }
            return numeroAlto.toString()
        }

        fun deportePreferido(): String {
            return deportes?.firstOrNull()?.showDeporte().toString()
        }
    }
}
