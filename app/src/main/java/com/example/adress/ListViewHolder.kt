package com.example.adress

import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ListViewHolder (itemView : View): RecyclerView.ViewHolder(itemView ) {

    var tvTitle :TextView=itemView.tvTitle



    fun popuateModel (user:User,second:MainActivity){

        tvTitle.text=user.title
        itemView.setOnClickListener {

        second.onItemClicked(user)

        }
    }

}