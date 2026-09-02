package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //for pets
        val cat = Cat(name = "whiskers", age = 4)
        val dog = Dog("Leo", 1)
        val scorpion = Scorpion (name = "Stinger", 22)
        val pettablePets = mutableListOf<Pettable>()
        pettablePets.add(cat)
        pettablePets.add(dog)
        //pettablePets.add(scorpion)
        //val pets = mutableListOf<Pettable>(cat, dog, scorpion)

        // for moods
        val happy = Happy(date = "3-2-26")
        val sad = Sad(date = "3-4-26")
        val moods = mutableListOf(happy, sad)
        }
    }

