package com.example.books

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation

class ReviewsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val image = view.findViewById<ImageView>(R.id.rateImage)
        val title = view.findViewById<TextView>(R.id.titleRate)
        val author = view.findViewById<TextView>(R.id.authorRate)

        val picture = requireArguments().getInt("image")
        val name = requireArguments().getInt("title")
        val writer = requireArguments().getInt("author")

        image.setImageResource(picture)
        title.setText(name)
        author.setText(writer)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_reviews, container, false)

        val cancel = view.findViewById<ImageView>(R.id.cancel)
        val check = view.findViewById<ImageView>(R.id.check)

        cancel.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_reviewsFragment_to_shelfFragment)
            Toast.makeText(context, "Your review has been discarded", Toast.LENGTH_SHORT).show()
        }

        check.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_reviewsFragment_to_shelfFragment)
            Toast.makeText(context, "Your review has been posted", Toast.LENGTH_SHORT).show()
        }

        return view
    }

}