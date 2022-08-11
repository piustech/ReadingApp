package com.example.books

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation

class BestSellerFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_best_seller, container, false)

        val back = view.findViewById<ImageView>(R.id.imageView3)

        back.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_bestSellerFragment_to_exploreFragment2)
        }

        return view
    }
}