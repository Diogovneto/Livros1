package com.example.livros

import android.content.ContentValues

data class Livro(var id: Long, var titulo: String, var autor: String, var iDCategoria: Long) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()
        valores.put(TabelaBDlivros.CAMPO_TITULO, titulo)
        valores.put(TabelaBDlivros.CAMPO_AUTOR, autor)
        valores.put(TabelaBDlivros.CAMPO_CATEGORIA_ID, id)

        return valores
    }
}