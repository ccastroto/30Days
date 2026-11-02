package com.example.a30days.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30days.R

data class Audi(
    @DrawableRes val imageResourceId: Int,
    @StringRes val modelo: Int,
    val decada: String,
    @StringRes val variante: Int,
    val Descripcion: String
)

val audis = listOf(
    Audi(R.drawable.audi_80___celebrating_50th_birthday, R.string.audi_80_1, "70", R.string.variante_modelo, "audi 80 ..."),
    Audi(R.drawable.audi50, R.string.audi_50, "70", R.string.variante_modelo_2, "audi 50 ..."),
    Audi(R.drawable.audi100_copue_s_gt,R.string.audi_100, "70", R.string.variante_modelo, "audi 100 ..." )
)