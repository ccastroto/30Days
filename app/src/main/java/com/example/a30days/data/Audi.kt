package com.example.a30days.data

import androidx.annotation.DrawableRes
import com.example.a30days.R

data class Audi(
    @DrawableRes val imageResourceId: Int,
    val modelo: String,
    val decada: String,
    val variante: String,
    val Descripcion: String
)

val audis = listOf(
    Audi(R.drawable.audi_80___celebrating_50th_birthday, "80", "80", "coupe", "audi 80 ...")
)