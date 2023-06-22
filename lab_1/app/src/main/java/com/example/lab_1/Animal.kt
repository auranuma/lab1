package com.example.lab_1

import java.io.Serializable

data class Animal(
    val name: String,
    val shortDescription: String,
    val description: String,
    val imageRes: Int
): Serializable