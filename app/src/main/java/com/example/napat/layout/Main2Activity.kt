package com.example.napat.layout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    val animals : ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        addAnimals()
        rv_animal_list.layoutManager = LinearLayoutManager(this)
        rv_animal_list.adapter = ItemAdater(animals, this,actionItemClick1 = {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })
    }
        fun bt_back(view: View){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
         fun onItemClick() {
             val intent = Intent(this,MainActivity::class.java)
             startActivity(intent)
         }

        fun addAnimals() {
            animals.add("dog")
            animals.add("cat")
            animals.add("owl")
            animals.add("cheetah")
            animals.add("raccoon")
            animals.add("bird")
            animals.add("snake")
            animals.add("lizard")
            animals.add("hamster")
            animals.add("bear")
            animals.add("lion")
            animals.add("tiger")
            animals.add("horse")
            animals.add("frog")
            animals.add("fish")
            animals.add("shark")
            animals.add("turtle")
            animals.add("elephant")
            animals.add("cow")
            animals.add("beaver")
            animals.add("bison")
            animals.add("porcupine")
            animals.add("rat")
            animals.add("mouse")
            animals.add("goose")
            animals.add("deer")
            animals.add("fox")
            animals.add("moose")
            animals.add("buffalo")
            animals.add("monkey")
            animals.add("penguin")
            animals.add("parrot")
        }

    }

