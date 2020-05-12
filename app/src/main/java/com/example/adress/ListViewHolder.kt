package com.example.adress

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ListViewHolder (itemView : View,var adapter :ListAdapter): RecyclerView.ViewHolder(itemView ) {

    var tvTitle :TextView=itemView.tvTitle



    fun popuateModel (user:MyModel,pos :Int){

        tvTitle.text=user.number.toString()

        if(user.isSelected){
            itemView.ivBg.setImageResource(R.drawable.doira)
        }

        itemView.setOnClickListener {

            user.isSelected=true
            adapter.selectedItemPosition=pos

        }
}

}