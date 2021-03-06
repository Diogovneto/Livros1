package com.example.livros

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase

abstract class TabelaBD(val db: SQLiteDatabase, val nome: String) {
    abstract fun cria()

    fun insert(values: ContentValues) = db.insert(nome, null, values)

    fun update(values: ContentValues, whereClause: String, whereArgs: Array<String>) =
        db.update(nome, values, whereClause,whereArgs)


}