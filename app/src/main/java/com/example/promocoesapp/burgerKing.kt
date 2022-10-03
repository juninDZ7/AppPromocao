package com.example.promocoesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.promocoesapp.Adapter.Adapter_produto
import com.example.promocoesapp.model.Produtos

class burgerKing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger_king)
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
            R.drawable.whopper_rodeio_fr_thumb_cupom_m_d_2021_09_20_171731_ztwe,
            nome="1 WHOPPER® Rodeio",
            descricao = "1 WHOPPER® Rodeio + 1 Free Refill",
            preco = "PREÇO: R$ 22,99"
        )
        listaProdutos.add(produto1)
        val produto2 = Produtos(
            R.drawable._c_whopper_bb_fake_thumb_cupom_m_d,
            nome="1 Combo de WHOPPER® Barbecue Bacon",
            descricao = "1 Combo de WHOPPER® Barbecue Bacon",
            preco = "PREÇO: R$ 28,90"
        )
        listaProdutos.add(produto2)

    }
}