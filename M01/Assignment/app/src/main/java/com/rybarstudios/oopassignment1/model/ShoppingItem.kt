package com.rybarstudios.oopassignment1.model

open class  ShoppingItem protected constructor(val colorId: Int, val productName: String) {

    fun getDisplayName(productName: String) : String {
        return productName
    }
}

