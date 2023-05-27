package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var spmonths: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
          val result=findViewById<TextView>(R.id.result)
        spmonths = findViewById(R.id.spmonths)

        spmonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            //ctrl+i click and select both then ok
            override fun onItemSelected(
                AdapterView: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {


                if (AdapterView != null) {
                    Toast.makeText(
                        this@MainActivity,
                        "you selected${AdapterView.getItemAtPosition(position).toString()}",
                        Toast.LENGTH_SHORT).show()
                    result.text="you are selected :${AdapterView.getItemAtPosition(position).toString()}"
                     result.visibility=View.VISIBLE

                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }


    }


}
