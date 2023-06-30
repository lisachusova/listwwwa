package com.example.app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Texts properties

    private var textName: EditText? = null;
    private var textAge: EditText? = null;
    private var textWeight: EditText? = null;
    private var textHeight: EditText? = null;


    // Work properties
    private var Name: String = "";
    private var Age: Int = 0;
    private var Weight: Int = 0;
    private var Height: Int = 0;

    // Formula property
    private var bmr: Double = 0.0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        InitialProperties()
        val textResult = findViewById<TextView>(R.id.textViewYourRezult)

        var btn = findViewById<Button>(R.id.btnGetResult)
        btn?.setOnClickListener {
            Name = textName?.text.toString()
            Age = textAge?.text.toString().toInt()
            Weight = textWeight?.text.toString().toInt()
            Height = textHeight?.text.toString().toInt()

            if (Name.length > 50 || (Weight <= 0 || Weight > 250) ||
                (Height <= 0 || Height > 250) || (Age <= 0 || Age > 150)
            ) {
                textResult.text = "Exception"
                Log.e("Error", "Not work")
            }
            else {
                bmr = (88.362 + (13.397 * Height) +
                        (4.799 * (Height * 100)) - (5.677 * Age)) * 1.55

                // Succsess
                Log.e("Success", "BMR: $bmr")
                textResult.text = bmr.toString()
            }
        }
    }

    fun InitialProperties() {
        textName = findViewById(R.id.editTextTextName)
        textAge = findViewById(R.id.editTextAge)
        textHeight = findViewById(R.id.editTextHeight)
        textWeight = findViewById(R.id.editTextWeight)
    }
}