package com.example.books

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class DetailFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val title = view.findViewById<TextView>(R.id.title)
        val author = view.findViewById<TextView>(R.id.author)

        val image = view.findViewById<ImageView>(R.id.sevenHusbandsImage)
        val blurb = view.findViewById<TextView>(R.id.sevenHusbandsBlurb)

        val picture = requireArguments().getInt("image")
        val detail = requireArguments().getInt("detail")
        val name = requireArguments().getInt("title")
        val writer = requireArguments().getInt("author")

        val back = view.findViewById<ImageView>(R.id.backArrow2)

        back.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_detailFragment_to_shelfFragment)
        }

        val review = view.findViewById<Button>(R.id.writeReviewButton)

        review.setOnClickListener{
            val bundle = Bundle()
            bundle.putInt("image", picture)
            bundle.putInt("title", name)
            bundle.putInt("author", writer)
            findNavController().navigate(R.id.action_detailFragment_to_reviewsFragment, bundle)
        }

        image.setImageResource(picture)
        blurb.setText(detail)
        title.setText(name)
        author.setText(writer)

    }

}