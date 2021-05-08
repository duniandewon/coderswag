package com.ndewon.coderswag.Controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ndewon.coderswag.Models.Product
import com.ndewon.coderswag.R
import com.ndewon.coderswag.Utilities.PRODUCT_DETAIL
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productDetail = intent.getParcelableExtra<Product>(PRODUCT_DETAIL)
        val resourceId = this.resources.getIdentifier(productDetail?.image, "drawable", this.packageName)

        productDetailTitle.text = productDetail?.title
        productDetailPrice.text = productDetail?.price
        productDetailImg.setImageResource(resourceId)
    }
}