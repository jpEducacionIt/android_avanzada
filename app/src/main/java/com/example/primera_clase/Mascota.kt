package com.example.primera_clase

data class Mascota(
    private val raza: String,
    private val nombre: String,
    private val edad: Int
) {
    var comida = ""
}