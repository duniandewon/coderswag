package com.ndewon.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ndewon.coderswag.Models.Product
import com.ndewon.coderswag.R
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductAdapter(
    private val context: Context,
    private val products: List<Product>,
    private val itemClick: (Product) -> Unit
) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    class ViewHolder(itemView: View, val itemClick: (Product) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        private val productImage: ImageView = itemView.productImage
        private val productName: TextView = itemView.productName
        private val productPrice: TextView = itemView.productPrice

        fun bindProduct(product: Product, context: Context) {
            val resourceId =
                context.resources.getIdentifier(product.image, "drawable", context.packageName)

            productImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.price
            itemView.setOnClickListener { itemClick(product) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)

        return ViewHolder(view, itemClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindProduct(products[position], context)
    }

    override fun getItemCount(): Int {
        return products.count()
    }
}