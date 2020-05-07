package com.example.adress

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_dialog.*


class DialogClass(context :Context,val activity :MainActivity):Dialog(context) {

   // var adapter:ListAdapter= ListAdapter(this,this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.custom_dialog)
//        recyclerSpace.adapter=adapter
//        recyclerSpace.layoutManager=GridLayoutManager(context,4,GridLayoutManager.VERTICAL,false)
//        recyclerSpace.addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.VERTICAL))
//
//    Data(100)
//
//    btnnegative.setOnClickListener {
//        dismiss()
//    }
//        btnpositive.setOnClickListener {
//            // codeBinoEdit.text=newTitle.toEditable()
//
//            //codeBinoEdit.text = Editable.Factory.getInstance().newEditable(newTitle)
//            dismiss()
//        }

    }
    fun String.toEditable(): Editable =  Editable.Factory.getInstance().newEditable(this)

//    fun Data(count: Int ){
//
//        val models :MutableList<User> = mutableListOf()
//
//        for(i in 1 .. count) {
//            var model = User()
//            model.title = "${i}"
//
//            models.add(model)
//        }
//        adapter.setData(models)
//    }
//
//
//    var newTitle :String =""
//
//fun onItemClicked(user:User){
//
//    newTitle=user.title
//
//    Toast.makeText(context,"${user.title} - item Clicked $newTitle", Toast.LENGTH_SHORT).show()
//
//}



}