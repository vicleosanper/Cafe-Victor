package com.example.cafev

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class PromoFragment : Fragment(R.layout.fragment_promociones) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val comidaOption1 = view.findViewById<View>(R.id.comidaOption1)
        val comidaOption2 = view.findViewById<View>(R.id.comidaOption2)
        val comidaOption3 = view.findViewById<View>(R.id.comidaOption3)



        // Establecer OnClickListener para cada CardView
        comidaOption1.setOnClickListener {
            val ComidaFragment = FoodFragment()
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ComidaFragment)
                .addToBackStack(null)
                .commit()
        }

        comidaOption2.setOnClickListener {
            val ComidaFragment = FoodFragment()
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ComidaFragment)
                .addToBackStack(null)
                .commit()

        }

        comidaOption3.setOnClickListener {
            val ComidaFragment = FoodFragment()
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ComidaFragment)
                .addToBackStack(null)
                .commit()
        }
    }


}