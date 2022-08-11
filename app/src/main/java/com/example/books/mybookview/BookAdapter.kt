package com.example.books.mybookview

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.books.R

class BookAdapter (private val context: Context, private val book: List<BookClass>):

    RecyclerView.Adapter<BookAdapter.ItemViewHolder>(){
        class ItemViewHolder(val view: View): RecyclerView.ViewHolder(view){

            val image: ImageView = view.findViewById(R.id.sevenHusbands)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = book[position]

        holder.image.setImageResource(item.imageId)

        holder.itemView.setOnClickListener{
            holder.view.context

            val bundle = Bundle()
            bundle.putInt("image", item.imageId)
            bundle.putInt("detail", item.detailId)
            bundle.putInt("title", item.titleId)
            bundle.putInt("author", item.authorId)

            holder.view.findNavController().navigate(R.id.action_shelfFragment_to_detailFragment3, bundle)
        }

    }

    override fun getItemCount(): Int {
        return book.size
    }

}


