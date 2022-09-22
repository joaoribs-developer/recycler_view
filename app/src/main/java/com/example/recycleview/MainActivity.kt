package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview.model.Data
import com.example.recycleview.model.ProdutoAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    lateinit var produtoAdapter: ProdutoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initReclycerView()
        populaDados()
    }

    private fun populaDados() {
        val datamoc = Data.createData()
        produtoAdapter.getData(datamoc)
    }

    private fun initReclycerView(){
        this.produtoAdapter = ProdutoAdapter{produto ->


        }
        reclycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = produtoAdapter
        }
    }





}