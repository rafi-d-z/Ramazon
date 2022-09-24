package com.example.ramazon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val wishlistItem: WishlistItem) :RecyclerView.Adapter<ItemAdapter.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val itemNameView: TextView
        val linkView: TextView
        val priceView: TextView

        init {
            itemNameView = itemView.findViewById(R.id.itemName)
            linkView = itemView.findViewById(R.id.link)
            priceView = itemView.findViewById(R.id.Price)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.wishlist_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemNameView.text = wishlistItem.itemName
        holder.priceView.text = wishlistItem.itemPrice.toString()
        holder.linkView.text = wishlistItem.itemLink
    }

    override fun getItemCount(): Int {
        return 1
    }

}