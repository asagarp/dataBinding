package com.example.learnsomething

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import com.example.learnsomething.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)

//        findViewById<Button>(R.id.click_button).setOnClickListener {
//            addName(it)
//        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.clickButton.setOnClickListener {
            addName(it)
        }
    }

    private fun addName(view: View) {
//        val editText : EditText = findViewById(R.id.name_edit_view)
//        val showText : TextView = findViewById(R.id.open_text_view)


        //        showText.text = editText.text
//        editText.visibility = View.GONE
//        view.visibility = View.GONE
//        showText.visibility = View.VISIBLE

        binding.apply {
            openTextView.text = binding.nameEditView.text
            invalidateAll()
            nameEditView.visibility = View.GONE
            clickButton.visibility = View.GONE
            openTextView.visibility = View.VISIBLE
        }
    }
}

