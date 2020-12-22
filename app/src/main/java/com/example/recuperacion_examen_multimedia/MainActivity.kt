package com.example.recuperacion_examen_multimedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonDuplicar.setOnClickListener {


            }
        botonañadir.setOnClickListener {
            botonañadir.setOnClickListener{
                val numero = Random.nextInt((1000 - 1)) + 1
                textView.text = "$numero"
            }


        }


            botonsiguiente.setOnClickListener {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)

            }



        }





    }




