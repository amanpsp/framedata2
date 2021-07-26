package com.example.framedata2.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.framedata2.adapter.ItemAdapter
import com.example.framedata2.data.Datasource
import com.example.framedata2.databinding.FragmentMoveTypeBinding



class CharacterList : Fragment() {

    private var _binding: FragmentMoveTypeBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    private var isLinearLayoutManager = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_main)

        //val myDataset = Datasource().loadCharacters()

        // val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        //recyclerView.adapter = ItemAdapter(context, myDataset)
       // recyclerView.setHasFixedSize(true)
        //recyclerView.layoutManager= GridLayoutManager(this, 3)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView
        chooseLayout()
    }

    private fun chooseLayout() {
        val myDataset = Datasource().loadCharacters()
        when (isLinearLayoutManager) {
            true -> {
                recyclerView.layoutManager = LinearLayoutManager(context)
                recyclerView.adapter = ItemAdapter(myDataset)
            }
            false -> {
                recyclerView.layoutManager = GridLayoutManager(context, 3)
                recyclerView.adapter = ItemAdapter( myDataset)
            }
        }
    }


}