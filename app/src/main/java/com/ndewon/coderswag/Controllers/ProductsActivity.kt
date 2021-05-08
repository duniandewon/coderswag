package com.ndewon.coderswag.Controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.ndewon.coderswag.Adapters.ProductAdapter
import com.ndewon.coderswag.R
import com.ndewon.coderswag.Services.DataService
import com.ndewon.coderswag.Utilities.EXTRA_CATEGORY
import com.ndewon.coderswag.Utilities.PRODUCT_DETAIL
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductAdapter(this, DataService.getProducts(categoryType!!)) { product ->
            val productDetailIntent = Intent(this, ProductDetail::class.java)
            productDetailIntent.putExtra(PRODUCT_DETAIL, product)
            startActivity(productDetailIntent)
        }

        val layoutManager = GridLayoutManager(this, 2)

        productListView.layoutManager = layoutManager
        productListView.adapter = adapter
    }
}