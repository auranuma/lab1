package com.example.lab_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), OnAnimalClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animalList = listOf(
            Animal(
                name = "Lion",
                shortDescription = "King of the jungle",
                description = "The lion is a large carnivorous mammal and is known as the king of the jungle. It is native to various parts of Africa and has a majestic appearance with its golden mane. Lions are social animals that live in prides and are known for their strength and hunting skills.",
                imageRes = R.drawable.img
            ),
            Animal(
                name = "Dolphin",
                shortDescription = "Intelligent marine mammal",
                description = "The dolphin is an intelligent marine mammal known for its playful nature and remarkable communication abilities. They are found in oceans around the world and are highly social animals, often seen swimming in groups called pods. Dolphins are known for their acrobatic displays and are beloved by humans for their friendly and curious behavior.",
                imageRes = R.drawable.img_1
            ),
            Animal(
                name = "Tiger",
                shortDescription = "Majestic big cat",
                description = "The tiger is a majestic big cat known for its striking orange coat with black stripes. It is the largest cat species and is native to various parts of Asia. Tigers are solitary animals and are known for their strength, agility, and powerful hunting abilities. Sadly, they are also endangered due to habitat loss and poaching.",
                imageRes = R.drawable.img_2
            )
        )
        val adapter = AnimalAdapter(animalList, this)

        findViewById<RecyclerView>(R.id.recyclerView).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            this.adapter = adapter
        }
    }

    override fun onClick(animal: Animal) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra(DetailsActivity.CAR_KEY, animal)
        startActivity(intent)
    }
}

interface OnAnimalClickListener {
    fun onClick(animal: Animal)
}