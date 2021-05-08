package com.ndewon.coderswag.Services

import com.ndewon.coderswag.Models.Category
import com.ndewon.coderswag.Models.Product

object DataService {
    val categories = listOf(
        Category("shirts", "shirtimage"),
        Category("hoodies", "hoodieimage"),
        Category("hats", "hatimage"),
        Category("digital", "digitalgoodsimage"),
    )

    val hats = listOf(
        Product("Devsloops Graphic Beanie", "$18", "hat1"),
        Product("Devsloops Hat Black", "$20", "hat2"),
        Product("Devsloops Hat White", "$18", "hat3"),
        Product("Devsloops Snapback", "22", "hat4"),
    )

    val hoodies = listOf(
        Product("Devsloops Hoodie Gray", "$20", "hoodie1"),
        Product("Devsloops Hoodie Red", "$32", "hoodie2"),
        Product("Devsloops Gray hoodie", "$20", "hoodie3"),
        Product("Devsloops Black Hoodie", "$20", "hoodie4"),
    )

    val shirts = listOf(
        Product("Devsloops Shirt Black", "$18", "shirt1"),
        Product("Devsloops Badge Light Gray", "$20", "shirt2"),
        Product("Devsloops Logo Shirt Red", "$22", "shirt3"),
        Product("Devsloops Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5"),
    )

    fun getProducts(category: String): List<Product> {
        return when(category) {
            "shirts" -> shirts
            "hats" -> hats
            "hoodies" -> hoodies
            else -> listOf<Product>()
        }
    }

    fun getProductItem() {}
}