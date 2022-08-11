package com.example.books

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation

class ExploreFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_explore, container, false)

        val genre = view.findViewById<TextView>(R.id.allGenres)
        val bestSeller = view.findViewById<TextView>(R.id.allBestSellers)
        val new = view.findViewById<TextView>(R.id.allNew)

        genre.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_exploreFragment_to_genresFragment)
        }

        bestSeller.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_exploreFragment_to_bestSellerFragment)
        }

        new.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_exploreFragment_to_newFragment)
        }

        return view
    }
}