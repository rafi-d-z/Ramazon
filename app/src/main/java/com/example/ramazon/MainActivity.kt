package com.example.ramazon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wishlistItems = ArrayList<WishlistItem>()

        val itemsRv = findViewById<RecyclerView>(R.id.recylerview)
        val adapter = ItemAdapter(wishlistItems)

        itemsRv.adapter = adapter

        itemsRv.layoutManager = LinearLayoutManager(this)

        findViewById<Button>(R.id.addBtn).setOnClickListener {
            val itemNameInput = findViewById<EditText>(R.id.itemNameBox).text.toString()
            val itemPriceInput = findViewById<EditText>(R.id.priceBox).text
            val itemLinkInput = findViewById<EditText>(R.id.linkBox).text.toString()

            val newItem = WishlistItem(itemNameInput,itemLinkInput,itemPriceInput)
            wishlistItems.add(newItem)
        }
    }
}

class WishlistItem(
    val itemName: String,
    val itemLink: String,
    val itemPrice: Editable,)
