package com.example.adress

import android.icu.text.CaseMap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class ListAdapter(val second :MainActivity,val dialog :MainActivity): RecyclerView.Adapter<ListViewHolder>() {

  var   models :MutableList<User> = mutableListOf()

fun setData(data :MutableList<User>){

    models=data
    notifyDataSetChanged()

}

fun setTitle(title:String){
    dialog.codeEdittext.setText(title)
}




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        var itemView : View =LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
  return ListViewHolder(itemView)
    }

    override fun getItemCount(): Int {
    return   models.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
       holder.popuateModel(models[position],second)
    }


}