package com.example.ramazon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class WishlistItem(
    val itemName: String,
    val itemLink: URL,
    val itemPrice: Double,){

}
