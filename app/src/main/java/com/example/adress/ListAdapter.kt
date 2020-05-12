package com.example.adress

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(): RecyclerView.Adapter<ListViewHolder>() {





    var selectedItemPosition =-1
    set(value) {
        if (selectedItemPosition != -1){
         models[selectedItemPosition].isSelected=false

            notifyItemChanged(field)
        }

        field=value
        notifyItemChanged(value)
    }


  var   models :List<MyModel> = listOf()
    set(value){
        field=value
        notifyDataSetChanged()
    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        var itemView : View =LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
  return ListViewHolder(itemView,this)
    }

    override fun getItemCount(): Int {
    return   models.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
       holder.popuateModel(models[position],position)
    }


}