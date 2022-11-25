package com.example.fragmentsrom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.CreateMethod
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.fragmentsrom.databinding.FragmentOneBinding

class FragmentOne : Fragment(R.layout.fragment_one) {

    private lateinit var binding: FragmentOneBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOneBinding.bind(view)

        binding.textView.text = "wegewrg"
    }

}