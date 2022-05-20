package com.example.livros

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaBDlivros(val db: SQLiteDatabase) {
    fun cria(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $CAMPO_TITULO TEXT NOT NULL, $CAMPO_AUTOR TEXT NOT NULL, $CAMPO_CATEGORIA_ID INTEGER NOT NULL, FOREIGN KEY ($CAMPO_CATEGORIA_ID) REFERENCES ${TabelaBDcategorias.NOME}(${BaseColumns._ID}) ON DELETE RESTRICT)")
    }

    companion object {
        const val NOME = "Livros"
        const val CAMPO_TITULO = "Titulo"
        const val CAMPO_AUTOR = "Autor"
        const val CAMPO_CATEGORIA_ID = "CategoriaID"
    }
}