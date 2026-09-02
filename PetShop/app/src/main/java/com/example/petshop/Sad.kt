package com.example.petshop

class Sad(date: String) : Mood(date) {
    override fun describe(): String {
        return "Sad"
    }
}