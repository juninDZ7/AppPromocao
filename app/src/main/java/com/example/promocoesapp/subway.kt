package com.example.promocoesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.promocoesapp.Adapter.Adapter_produto
import com.example.promocoesapp.model.Produtos

class subway : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subway)

        val recyclerView_Produtos= findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView_Produtos.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        recyclerView_Produtos.setHasFixedSize(true)
        //configura Adapter
        val listaProdutos: MutableList<Produtos> = mutableListOf()
        val adapterProduto = Adapter_produto(this,listaProdutos)
        recyclerView_Produtos.adapter = adapterProduto
        // lista de produtos
        val produto1 = Produtos(
            R.drawable.img1,
            nome="Selfie Combo",
            descricao = "4 itens Por R$ 19,90",
            preco = "PREÇO: R$ 19,90"
        )
        listaProdutos.add(produto1)
        val produto2 = Produtos(
            R.drawable.img2,
            nome="2 Pop Subs",
            descricao = "2 Pop Subs Por  R$ 15,90",
            preco = "PREÇO: R$ 15,90"
        )
        listaProdutos.add(produto2)

    }

}