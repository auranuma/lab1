package com.example.lab_1

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity: AppCompatActivity() {

    companion object {
        const val CAR_KEY = "CAR_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val animal = intent.getSerializableExtra(CAR_KEY) as Animal
        findViewById<ImageView>(R.id.imageView).setImageResource(animal.imageRes)
        findViewById<TextView>(R.id.nameTextView).text = animal.name
        findViewById<TextView>(R.id.shortDescriptionTextView).text = animal.shortDescription
        findViewById<TextView>(R.id.descriptionTextView).text = animal.description

    }
}