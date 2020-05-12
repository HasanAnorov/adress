package com.example.adress
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


val dialog =DialogClass(this)

binobtn.setOnClickListener {



    dialog.show()
}
    }


    }


//
//package com.example.adress
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.LayoutInflater
//import androidx.appcompat.app.AlertDialog
//import androidx.recyclerview.widget.DividerItemDecoration
//import androidx.recyclerview.widget.GridLayoutManager
//import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.custom_dialog.*
//
//class MainActivity (): AppCompatActivity() {
//
//    var adapter: ListAdapter = ListAdapter()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//
//
//        val addDialogView =LayoutInflater.from(this).inflate(R.layout.custom_dialog,null)
//        val dialog=AlertDialog.Builder(this).setView(addDialogView).show()
//
//        recyclerSpace.adapter = adapter
//        recyclerSpace.layoutManager =
//            GridLayoutManager(this, 4, GridLayoutManager.VERTICAL, false)
//        recyclerSpace.addItemDecoration(
//            DividerItemDecoration(
//                this,
//                DividerItemDecoration.VERTICAL
//            )
//        )
//
//        Data()
//
//        binobtn.setOnClickListener {
//
//            btnnegative.setOnClickListener {
//
//                dialog.dismiss()
//            }
//            btnpositive.setOnClickListener {
//
//                dialog.dismiss()
//            }
//
//        }
//
//    }
//
//    private fun Data(){
//
//        val numbers :MutableList<MyModel> = mutableListOf()
//
//        for(i in 1 .. 100) {
//            numbers.add(MyModel(i,false))
//        }
//        adapter.models=numbers
//    }
//
//
//
//
//
//}
