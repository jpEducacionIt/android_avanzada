package com.example.primera_clase

import android.widget.Toast

class GenteGetySet() {
    var nombre: String? = null
    get(){
        return field
    }
    set(value) {
        field = value
    }

    fun getNombre() {
        nombre?.let {
            println("Mi nombre es $it")
        } ?: run {
            println("Anonimo")
        }
    }
}