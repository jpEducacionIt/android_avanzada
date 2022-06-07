package com.example.primera_clase

enum class Deportes {
    Futbol, Rugby, Basquet, Volley, Skate;

    fun showDeporte() : String {
        return "Mi deporte preferido es $this"
    }
}