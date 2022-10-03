package com.example.promocoesapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.promocoesapp.R
import com.example.promocoesapp.model.Produtos

class Adapter_produto(private val context: Context,private val produtos: MutableList<Produtos>): RecyclerView.Adapter<Adapter_produto.ProdutoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.mcdonalds_item,parent,false)
        val holder = ProdutoViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.text = produtos[position].nome
        holder.descricao.text = produtos[position].descricao
        holder.preco.text= produtos[position].preco
    }

    override fun getItemCount(): Int =produtos.size

    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val foto = itemView.findViewById<ImageView>(R.id.foto)
        val nome = itemView.findViewById<TextView>(R.id.nome)
        val descricao = itemView.findViewById<TextView>(R.id.descricao)
        val preco = itemView.findViewById<TextView>(R.id.preco)
    }

}