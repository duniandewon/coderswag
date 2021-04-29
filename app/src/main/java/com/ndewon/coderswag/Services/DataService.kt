package com.ndewon.coderswag.Services

import com.ndewon.coderswag.Models.Category
import com.ndewon.coderswag.Models.Product
import com.ndewon.coderswag.R

object DataService {
    val categories = listOf(
        Category("shirts", "shirtimage"),
        Category("hoodies", "hoodieimage"),
        Category("hats", "hatimage"),
        Category("digital", "digitalgoodsimage"),
    )

    val hats = listOf(
        Product("Devsloops Graphic Beanie", "$18", "hat01"),
        Product("Devsloops Hat Black", "$20", "hat02"),
        Product("Devsloops Hat White", "$18", "hat03"),
        Product("Devsloops Snapback", "22", "hat04"),
    )

    val hoodies = listOf(
        Product("Devsloops Hoodie Gray", "$20", "hoodie01"),
        Product("Devsloops Hoodie Red", "$32", "hoodie02"),
        Product("Devsloops Gray hoodie", "$20", "hoodie03"),
        Product("Devsloops Black Hoodie", "$20", "hoodie04"),
    )

    val shirts = listOf(
        Product("Devsloops Shirt Black", "$18", "shirt01"),
        Product("Devsloops Badge Light Gray", "$20", "shirt02"),
        Product("Devsloops Logo Shirt Red", "$22", "shirt03"),
        Product("Devsloops Hustle", "$22", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05"),
    )
}