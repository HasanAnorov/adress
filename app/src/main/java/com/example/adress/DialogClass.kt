package com.example.adress

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat.startActivity
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.custom_dialog.*
import kotlinx.android.synthetic.main.custom_dialog.view.*


class DialogClass(context :Context):Dialog(context) {

    var adapter:ListAdapter= ListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.custom_dialog)
        recyclerSpace.adapter = adapter
        recyclerSpace.layoutManager = GridLayoutManager(context, 4, GridLayoutManager.VERTICAL, false)
        recyclerSpace.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))

        btnnegative.setOnClickListener {
           dismiss()
        }

        btnpositive.setOnClickListener {
            var nomer=adapter.selectedItemPosition+1
            codeBinoEdit.setText(nomer.toString())
            dismiss()
        }

        Data()

  }


    private fun Data(){

        val numbers :MutableList<MyModel> = mutableListOf()

        for(i in 1 .. 100) {
            numbers.add(MyModel(i,false))
        }
        adapter.models=numbers
    }


}