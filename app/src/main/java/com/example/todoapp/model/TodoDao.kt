package com.example.todoapp.model

import androidx.room.*

@Dao
interface TodoDao { //penjelasan di W8 hlm 33-34
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg todo: Model.Todo)

    @Query("SELECT * FROM todo")
    fun selectAllTodo(): List<Model.Todo>

    @Query("SELECT * FROM todo WHERE uuid= :id")
    fun selectTodo(id:Int): Model.Todo

    @Delete
    fun deleteTodo(todo: Model.Todo)

}