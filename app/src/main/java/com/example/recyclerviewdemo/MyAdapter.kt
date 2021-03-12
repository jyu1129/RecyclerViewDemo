package com.example.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val studentList: List<StudentItem>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = studentList[position]
        holder.imagePhoto.setImageResource(currentItem.imageResource)
        holder.textName.text = currentItem.name
        holder.textProgramme.text = currentItem.programme
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val imagePhoto: ImageView = itemView.findViewById(R.id.image_photo)
        val textName: TextView = itemView.findViewById(R.id.text_name)
        val textProgramme: TextView = itemView.findViewById(R.id.text_programme)
    }
}