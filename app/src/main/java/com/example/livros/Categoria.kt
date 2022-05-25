package com.example.livros

import android.content.ContentValues
import android.provider.BaseColumns

data class Categoria(var id: Long, var nome: String) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()
        valores.put(TabelaBDcategorias.CAMPO_NOME, nome)

        return valores
    }
}