package com.example.creativeband.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.creativeband.R
import com.example.creativeband.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    binding.btn1.setOnClickListener {
        findNavController().navigate( R.id.action_nav_home_to_autismComponentFragment)
    }

        binding.btn2.setOnClickListener {
        findNavController().navigate( R.id.action_nav_home_to_ADHDComponentFragment)
    }


        binding.btn3.setOnClickListener {
        findNavController().navigate( R.id.action_nav_home_to_learningFragment)
    }



    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}