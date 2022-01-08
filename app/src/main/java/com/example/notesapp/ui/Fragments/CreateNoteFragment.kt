package com.example.notesapp.ui.Fragments

import android.os.Bundle
import android.text.format.DateFormat
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.example.notesapp.Model.Notes
import com.example.notesapp.R
import com.example.notesapp.ViewModel.NotesViewModel
import com.example.notesapp.databinding.FragmentCreateNoteBinding
import java.util.*


class CreateNoteFragment : Fragment() {

    lateinit var binding : FragmentCreateNoteBinding
    var priority :String = "1"
    val viewModel : NotesViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCreateNoteBinding.inflate(layoutInflater, container, false)

        binding.btnSaveNotes.setOnClickListener{
            createNotes(it )
        }

        binding.pGreen.setImageResource(R.drawable.ic_baseline_done_24)

        binding.pGreen.setOnClickListener {
            priority = "1"
            binding.pGreen.setImageResource(R.drawable.ic_baseline_done_24)
            binding.pRed.setImageResource(0)
            binding.pYello.setImageResource(0)
        }
        binding.pRed.setOnClickListener{
            priority ="2"
            binding.pRed.setImageResource(R.drawable.ic_baseline_done_24)
            binding.pYello.setImageResource(0)
            binding.pGreen.setImageResource(0)
        }
        binding.pYello.setOnClickListener{
            priority = "3"
            binding.pYello.setImageResource(R.drawable.ic_baseline_done_24)
            binding.pGreen.setImageResource(0)
            binding.pRed.setImageResource(0)
        }
        return binding.root
    }

    private fun createNotes( it: View?) {
        val title = binding.editTitle.text
        val subtitle = binding.editSubtitle.text
        val notes = binding.editNotes.text
        val d = Date()
        val notesDate : CharSequence = DateFormat.format("MMMM d, yyyy", d.time)

        Log.e("@@@@@", "createNotes: $notesDate")
        val data = Notes(null , title = title, subTitle= subtitle, notes = notes, date = notesDate.toString(), priority)
        viewModel.addition(data)
    }
}
