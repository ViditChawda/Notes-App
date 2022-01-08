package com.example.notesapp.Repository

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import com.example.notesapp.Dao.NotesDao
import com.example.notesapp.Model.Notes

class NotesRepository(val dao: NotesDao) {

    fun getallNotes():LiveData<List<Notes>>{
        return  dao.getNotes()
    }

    fun insertNotes(notes : Notes){
        dao.insertNotes(notes)
    }

    fun deleteNotes(id: Int){
        dao.deleteNotes(id)
    }

    fun updateNotes(notes: Notes){
       dao.updateNotes(notes)
    }
}