package com.example.primera_clase

abstract class Persona(
    private val nombre: String,
    private val edad: Int,
    private val deportes: List<Deportes>?) {

    abstract fun crearSaludo(): String
    abstract fun checkEdad(): String
    abstract fun obtenerApodo(): String
    abstract fun deportePreferido(): String
    abstract fun listarDeportes()
}