package com.example.recycleview.model

import java.math.BigDecimal

class Data {
    companion object {
        fun createData(): ArrayList<Produto> {
            val array = ArrayList<Produto>()
            array.add(
                Produto(
                    "bala", "bala sabor morango", 150, BigDecimal(1), 0, false,
                )
            )
            array.add(
                Produto(
                    "suco", "suco sabor maracuja", 150, BigDecimal(3.5), 0, true,
                )
            )
            array.add(
                Produto(
                    "bala2", "bala sabor pera", 150, BigDecimal(1), 0, false,
                )
            )
            array.add(
                Produto(
                    "bala3", "bala sabor abacaxi", 150, BigDecimal(1), 0, false,
                )
            )
            array.add(
                Produto(
                    "queijo", "queijo minas 500g", 150, BigDecimal(15.5), 0, false,
                )
            )
            array.add(
                Produto(
                    "bala4", "bala sabor uva", 150, BigDecimal(1), 0, false,
                )
            )


            return array
        }

    }
}