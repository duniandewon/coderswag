package com.ndewon.coderswag.Controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ndewon.coderswag.Adapters.CategoryAdapter
import com.ndewon.coderswag.R
import com.ndewon.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryListView.adapter = CategoryAdapter(this, DataService.categories) { category ->
            println(category.title)
        }
        categoryListView.layoutManager = LinearLayoutManager(this)
        categoryListView.setHasFixedSize(true)
    }
}