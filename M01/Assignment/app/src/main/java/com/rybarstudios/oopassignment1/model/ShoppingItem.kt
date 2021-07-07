package com.rybarstudios.oopassignment1.model

open class  ShoppingItem protected constructor(val colorId: Int, val productName: String, val itemPrice: String) {

    open fun getDisplayName() : String {
        return """
            Product name: $productName
            Product price: $itemPrice
        """.trimIndent()
    }
}

class GroceryItem(colorId: Int, productName: String, itemPrice: String, val isRefigerated: Boolean): ShoppingItem(colorId, productName, itemPrice) {

    override fun getDisplayName(): String {
        var fridge = ""
        if (isRefigerated) fridge = "Yes" else fridge ="No"

        return """
            Product name: $productName
            Product price: $itemPrice
            Requires refrigeration: $fridge
        """.trimIndent()
    }
}

class ClothingItem(colorId: Int, productName: String, itemPrice: String, val size: String): ShoppingItem(colorId, productName, itemPrice) {

    override fun getDisplayName(): String {
        return """
            Product name: $productName
            Product price: $itemPrice
            Product size: $size
        """.trimIndent()
    }
}

class SportsItem(colorId: Int, productName: String, itemPrice: String, val typeOfSport: String): ShoppingItem(colorId, productName, itemPrice) {

    override fun getDisplayName(): String {
        return """
            Product name: $productName
            Product price: $itemPrice
            Sport: $typeOfSport
        """.trimIndent()
    }
}