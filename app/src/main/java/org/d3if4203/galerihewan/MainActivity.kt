package org.d3if4203.galerihewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val hewan = listOf("Ayam", "Bebek", "Domba", "Kambing", "Sapi")
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        klikButton()
    }

    private fun showNext(){
        index = if (index == hewan.size-1) 0 else index + 1
        val textView : TextView = findViewById(R.id.nameTextView)
        textView.text = hewan[index]

        val imageView : ImageView = findViewById(R.id.imageGaleri)
        val resourceId = when(index){
            1 -> R.drawable.bebek
            2 -> R.drawable.domba
            3 -> R.drawable.kambing
            4 -> R.drawable.sapi
            else -> R.drawable.ayam
        }
        imageView.setImageResource(resourceId)
    }

    private fun showBack(){
        index = if (index == hewan.size-5) 4 else index - 1
        val textView : TextView = findViewById(R.id.nameTextView)
        textView.text = hewan[index]

        val imageView : ImageView = findViewById(R.id.imageGaleri)
        val resourceId = when(index){
            1 -> R.drawable.bebek
            2 -> R.drawable.domba
            3 -> R.drawable.kambing
            4 -> R.drawable.sapi
            else -> R.drawable.ayam
        }
        imageView.setImageResource(resourceId)
    }

    private fun klikButton(){
        val nextButton : Button = findViewById(R.id.nextButton)
        nextButton.setOnClickListener { showNext() }

        val backButton : Button = findViewById(R.id.backButton)
        backButton.setOnClickListener { showBack() }
    }
}