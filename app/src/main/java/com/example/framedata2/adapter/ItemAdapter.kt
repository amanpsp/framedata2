package com.example.framedata2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.framedata2.R
import com.example.framedata2.model.Character

class ItemAdapter(private val context: Context,
                  private val dataset:List<Character>
                  ) :RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val imagebuttonview: ImageButton =  view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)//get instance of layoutInflater from parent context so it knows how to inflate xml layout into hierarchy of view objects then . to inflate the actual list item view by passing in the layout resource, parent view group, and false casue recyclerview adds item to view heirarchy for you

        return ItemViewHolder(adapterLayout) //adapterLayout holds a reference to the list item view so now return a new itemviewholder with that reference


    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imagebuttonview.setImageResource(item.characterportrait)
    }

    override fun getItemCount() = dataset.size



}