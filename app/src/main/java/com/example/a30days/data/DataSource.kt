package com.example.a30days.data

import androidx.annotation.DrawableRes
import com.example.a30days.R
import com.example.a30days.model.Audi

class DataSource{
    fun audis(): List<Audi> {
        return listOf(
            Audi(R.drawable.audi_80___celebrating_50th_birthday, "80", "80", "coupe", "audi 80 ...")
        )
    }
}
