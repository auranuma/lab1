package com.example.lab_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter(
    private val animals: List<Animal>,
    private val onAnimalClickListener: OnAnimalClickListener
) : RecyclerView.Adapter<AnimalAdapter.CarViewHolder>() {

    class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val shortDescriptionTextView: TextView = itemView.findViewById(R.id.shortDescriptionTextView)
        val detailsButton: Button = itemView.findViewById(R.id.detailsButton)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.animal_item, parent, false)
        return CarViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car = animals[position]

        holder.imageView.setImageResource(car.imageRes)
        holder.nameTextView.text = car.name
        holder.shortDescriptionTextView.text = car.shortDescription

        holder.detailsButton.setOnClickListener {
            onAnimalClickListener.onClick(car)
        }
    }

    override fun getItemCount(): Int {
        return animals.size
    }
}
