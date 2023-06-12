package com.example.todoapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

class Model {
    @Entity //akan membuat tabel bernama todo
    data class Todo(
        @ColumnInfo(name="title") //nama kolom di db
        var title: String,
        @ColumnInfo(name="notes")
        var notes: String
    ){
        @PrimaryKey(autoGenerate = true)
        var uuid:Int = 0
    }
}