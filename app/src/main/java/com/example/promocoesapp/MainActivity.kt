package com.example.promocoesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img1 = findViewById<ImageView>(R.id.logo1)
        Glide.with(this).load("https://santanaparqueshopping.com.br/lojas_files/21807.jpg").into(img1)
        val img2 = findViewById<ImageView>(R.id.logo2)
        Glide.with(this).load("https://logosmarcas.net/wp-content/uploads/2020/10/Burger-King-Logo.png").into(img2)
        val img3 = findViewById<ImageView>(R.id.logo3)
        Glide.with(this).load("https://logodownload.org/wp-content/uploads/2014/07/subway-logo.png").into(img3)

        val button1 = findViewById<Button>(R.id.botao1)
        button1.setOnClickListener {
            irParaMcDonalds()
        }
        val  button2 = findViewById<Button>(R.id.botao2)
        button2.setOnClickListener {
            irParaBurgerKing()
        }
        val button3 = findViewById<Button>(R.id.botao3)
        button3.setOnClickListener {
            irParaSubway()
        }
    }
    private fun irParaMcDonalds(){
        val intent = Intent(this@MainActivity,mc_donalds::class.java)
        startActivity(intent)
    }
    private fun irParaBurgerKing(){
        val burger = Intent(this@MainActivity,burgerKing::class.java)
        startActivity(burger)
    }
    private fun irParaSubway(){
        val subway = Intent(this@MainActivity,subway::class.java)
        startActivity(subway)
    }
}