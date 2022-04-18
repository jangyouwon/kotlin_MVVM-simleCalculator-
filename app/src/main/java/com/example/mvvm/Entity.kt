package com.example.mvvm

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Test")
data class Entity(
    var name:String,
    @PrimaryKey(autoGenerate = true)
    var id:Int,

)
