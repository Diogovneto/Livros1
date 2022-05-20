package com.example.livros

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaBDcategorias(val db: SQLiteDatabase) {
    fun cria(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $CAMPO_NOME TEXT NOT NULL)")
    }

    companion object {
        const val NOME = "categorias"
        const val CAMPO_NOME = "nome"
    }
}