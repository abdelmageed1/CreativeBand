package com.example.creativeband.ui.Tips

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.creativeband.databinding.FragmentTipsBinding


class TipsADHDFragment : Fragment() {
    lateinit var binding: FragmentTipsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentTipsBinding.inflate(inflater,container,false)
        return binding.root
    }

    companion object {
    var type = ""
    }
}