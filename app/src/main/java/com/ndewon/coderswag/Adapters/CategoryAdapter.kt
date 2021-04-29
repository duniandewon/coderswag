package com.ndewon.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ndewon.coderswag.Models.Category
import com.ndewon.coderswag.R
import kotlinx.android.synthetic.main.category_list_item.view.*
import java.util.*

class CategoryAdapter(
    private val context: Context,
    private val dataSet: List<Category>,
    private val itemClick: (Category) -> Unit
) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    class ViewHolder(itemView: View, val itemClick: (Category) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        private val categoryName: TextView = itemView.categoryName
        private val categoryImage: ImageView = itemView.categoryImage

        fun bindCategory(category: Category, context: Context) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

            categoryImage.setImageResource(resourceId)
            categoryName.text = category.title.toUpperCase(Locale.ROOT)

            itemView.setOnClickListener { itemClick(category) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.category_list_item, parent, false)

        return ViewHolder(view, itemClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = dataSet[position]
        holder.bindCategory(category, context)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}