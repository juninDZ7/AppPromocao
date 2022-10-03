package com.example.promocoesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.promocoesapp.Adapter.Adapter_produto
import com.example.promocoesapp.model.Produtos

class mc_donalds : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mc_donalds)
        val recyclerView_Produtos= findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView_Produtos.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        recyclerView_Produtos.setHasFixedSize(true)
        //configura Adapter
        val listaProdutos: MutableList<Produtos> = mutableListOf()
        val adapterProduto = Adapter_produto(this,listaProdutos)
        recyclerView_Produtos.adapter = adapterProduto
        // lista de produtos
        val produto1 = Produtos(
            R.drawable.promocao1,
            nome="McOferta Media Big Mac + Sundae Promo",
            descricao = "Dois hambúrgueres (100% carne bovina), alface americana, queijo cheddar, maionese Big Mac, cebola, picles e pão com gergelim Acompanhamento e bebida Mais uma sobremesa sundae (calda Chocolate, Caramelo ou Morango)",
            preco = "PREÇO: R$ 30,80"
        )
        listaProdutos.add(produto1)

        val produto2 = Produtos(
            R.drawable._956488_mop,
            nome="McOferta Media Big Mac + Sundae Promo",
            descricao = "Frango empanado, maionese, alface americana e pão com gergelim. Com acompanhamento e bebida Mais uma sobremesa sundae (calda Chocolate, Caramelo ou Morango)",
            preco = "PREÇO: R$ 27,80"
        )
        listaProdutos.add(produto2)

        val produto3 = Produtos(
            R.drawable.promocao3,
            nome="McOferta Media Cheddar McMelt + Sundae Promo",
            descricao = "Um hambúrguer (100% carne bovina), molho sabor cheddar, cebola ao molho shoyu e pão escuro com gergelim. Com acompanhamento e bebida Mais uma sobremesa sundae (calda Chocolate, Caramelo ou Morango)",
            preco = "PREÇO: R$ 31,80"
        )
        listaProdutos.add(produto3)

        val produto4 = Produtos(
            R.drawable.promocao4,
            nome="McOferta Media Quarterão + Sundae Promo",
            descricao = "Um hambúrguer (100% carne bovina), queijo cheddar, picles, cebola, ketchup, mostarda e pão com gergelim. Com acompanhamento e bebida Mais uma sobremesa sundae (calda Chocolate, Caramelo ou Morango)",
            preco = "PREÇO: R$ 31,80"
        )
        listaProdutos.add(produto4)
    }
}