package com.rybarstudios.oopassignment1.model

open class  ShoppingItem protected constructor(val colorId: Int, val productName: String, val itemPrice: Int) {

    open fun getDisplayName() : String {
        return """
            Product name:  $productName
            Product price: $itemPrice
        """.trimIndent()
    }
}

class GroceryItem(colorId: Int, productName: String, itemPrice: Int, val isRefigerated: Boolean): ShoppingItem(colorId, productName, itemPrice) {

    override fun getDisplayName(): String {
        return """
            Product name:           $productName
            Product price:          $itemPrice
            Requires refrigeration: $isRefigerated
        """.trimIndent()
    }
}

class ClothingItem(colorId: Int, productName: String, itemPrice: Int, val size: String): ShoppingItem(colorId, productName, itemPrice) {

    override fun getDisplayName(): String {
        return """
            Product name:  $productName
            Product price: $itemPrice
            Product size:  $size
        """.trimIndent()
    }
}

class SportsItem(colorId: Int, productName: String, itemPrice: Int, val typeOfSport: String): ShoppingItem(colorId, productName, itemPrice) {

    override fun getDisplayName(): String {
        return """
            Product name:  $productName
            Product price: $itemPrice
            Sport:         $typeOfSport
        """.trimIndent()
    }
}