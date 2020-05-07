package com.example.adress

import android.content.Intent
import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.custom_dialog.*
import kotlinx.android.synthetic.main.custom_dialog.view.*

class MainActivity (): AppCompatActivity() {

    var adapter: ListAdapter = ListAdapter(this, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



            val addDialogView =LayoutInflater.from(this).inflate(R.layout.custom_dialog,null)
            val dialog=AlertDialog.Builder(this).setView(addDialogView).show()

            recyclerSpace.adapter = adapter
            recyclerSpace.layoutManager =
                GridLayoutManager(this, 4, GridLayoutManager.VERTICAL, false)
            recyclerSpace.addItemDecoration(
                DividerItemDecoration(
                    this,
                    DividerItemDecoration.VERTICAL
                )
            )

            Data(100)
            binobtn.setOnClickListener {

            btnnegative.setOnClickListener {

                dialog.dismiss()
            }
            btnpositive.setOnClickListener {
                // codeBinoEdit.text=newTitle.toEditable()

                //codeBinoEdit.text = Editable.Factory.getInstance().newEditable(newTitle)
               adapter.setTitle(addDialogView.codeBinoEdit.text.toString())
              //  adapter.setTitle(newTitle)
             //   addDialogView.codeBinoEdit.setText(newTitle)
                dialog.dismiss()
            }

        }

    }

    fun Data(count: Int ){

        val models :MutableList<User> = mutableListOf()

        for(i in 1 .. count) {
            var model = User()
            model.title = "${i}"

            models.add(model)
        }
        adapter.setData(models)
    }


    var newTitle :String =""

    fun onItemClicked(user:User){

        newTitle=user.title

        Toast.makeText(this,"${user.title} - item Clicked $newTitle", Toast.LENGTH_SHORT).show()

    }


}
