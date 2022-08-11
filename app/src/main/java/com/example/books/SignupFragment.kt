package com.example.books

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation

class SignupFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_signup, container, false)

        val previous = view.findViewById<ImageView>(R.id.previous2)

        previous.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_signupFragment_to_signinFragment)
        }

        val signIn = view.findViewById<TextView>(R.id.signInText)

        signIn.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_signupFragment_to_signinFragment)
        }

        return view
    }
}