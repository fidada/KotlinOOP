package com.bilqismufida.kotlinoop.data

enum class CardType(val type : String){
    NEWBIE("Gray"){
        fun calculateBonus(){

        }
    },
    ELITE("White"){
        fun calculateBonus(){

        }
    },
    EXCLUSIVE("Gold")
}