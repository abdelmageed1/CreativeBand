package com.example.creativeband.ui.Tips

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.creativeband.R
import com.example.creativeband.databinding.FragmentAllTipsBinding
import com.example.creativeband.databinding.FragmentTipsAutismBinding


class TipsAutismFragment : Fragment() {
    lateinit var binding: FragmentTipsAutismBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTipsAutismBinding.inflate(inflater,container,false)
        return binding.root
    }

    companion object {

    }
}