package com.example.a30days.model

import androidx.annotation.DrawableRes

data class Audi(
    @DrawableRes val imageResourceId: Int,
    val modelo: String,
    val decada: String,
    val variante: String,
    val Descripcion: String
)