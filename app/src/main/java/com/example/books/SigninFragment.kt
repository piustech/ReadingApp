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

class SigninFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_signin, container, false)

        val signUp = view.findViewById<TextView>(R.id.signupText)

        signUp.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_signinFragment_to_signupFragment)
        }

        val button = view.findViewById<Button>(R.id.signInButton)

        button.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_signinFragment_to_makeFragment)
        }


        val previous = view.findViewById<ImageView>(R.id.previous)

        previous.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_signinFragment_to_createFragment)
        }

        return view
    }
}