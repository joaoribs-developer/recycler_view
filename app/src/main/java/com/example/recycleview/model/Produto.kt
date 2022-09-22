package com.example.recycleview.model

import java.math.BigDecimal

data class Produto(
    val nome: String,
    val descricao: String,
    var quantidadeEstoque: Long,
    val valor: BigDecimal,
    var quantidadeSelecionada: Int = 0,
    val vendeFracionado: Boolean
)
