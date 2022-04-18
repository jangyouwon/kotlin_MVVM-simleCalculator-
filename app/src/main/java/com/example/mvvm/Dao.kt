package com.example.mvvm

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.Dao

@Dao
interface Dao {

    @Query("SELECT * from Test ORDER BY id ASC")
    fun getAll(): LiveData<List<Entity>>

    @Query("DELETE FROM Test")
    fun deleteAll()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(entity: Entity)

    @Update
    fun update(entity: Entity)

    @Delete
    fun delete(entity: Entity)
}