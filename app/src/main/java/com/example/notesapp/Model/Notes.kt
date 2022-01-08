package com.example.notesapp.Model

import android.text.Editable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Notes")
class Notes(
    @PrimaryKey(autoGenerate = true)
    var id:Int?  = null,
    var title: Editable,
    var subTitle: Editable,
    var notes: Editable,
    var date: String,
    var priority: String
)