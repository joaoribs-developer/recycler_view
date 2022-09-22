package com.example.recycleview.model

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R
import kotlinx.android.synthetic.main.res_item_prod.view.*


class ProdutoAdapter(val onClickListener:(Produto) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private var itens: List<Produto> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProdutoViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_prod, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        //para cada view referenciada no adapter, popula os dados
        when(holder){
            is ProdutoViewHolder->{
                holder.populaDados(itens[position],onClickListener)
            }
        }

    }


    override fun getItemCount(): Int {
        //metodo que retorna o tamanho do recycler
        return itens.size
    }
    fun getData(produtos: List<Produto>){
        itens = produtos
    }

    class ProdutoViewHolder
    constructor(
        itemView : View
    ): RecyclerView.ViewHolder(itemView){
        private var txtDescricao = itemView.descricao
        private var txtItensSelect = itemView.itens_selected
        private var txtEstoque = itemView.estoque
        private var btnAddProduto = itemView.btn_incr
        private var btnDesProduto = itemView.btn_decr
        //metodo que identifica a view que voce quer referenciar


        @SuppressLint("SetTextI18n")
        fun populaDados(produto: Produto, onClickListener:(Produto) -> Unit){

            txtDescricao.text = "${produto.nome} ${produto.descricao}"
            txtItensSelect.text = produto.quantidadeSelecionada.toString()
            txtEstoque.text = "Qtd. em estoque: ${produto.quantidadeEstoque}"



            }

        }



    }

