package com.kelvinkamara.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInFlater = LayoutInflater.from(parent.context)
        val listItem = layoutInFlater.inflate(
            R.layout.list_item,
            parent,
            false
        )
        return MyViewHolder(listItem)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.myTextView.text = "Hello from onBindViewHolder $position"
    }
}

class MyViewHolder(val view: View): RecyclerView.ViewHolder(view) {
    val myTextView = view.findViewById<TextView>(R.id.tvName)
}