package com.example.books

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation

class ProfileFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val signIn = view.findViewById<TextView>(R.id.signIn)

        signIn.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_profileFragment_to_signinFragment)
        }

        return view
    }
}