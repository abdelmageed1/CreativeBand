package com.example.creativeband.ui.Tips

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.creativeband.R
import com.example.creativeband.databinding.FragmentAllTipsBinding


class AllTipsFragment : Fragment() {
    lateinit var binding: FragmentAllTipsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAllTipsBinding.inflate(inflater,container,false)

        binding.btnTipsAutism.setOnClickListener {

            findNavController().navigate( R.id.action_nav_tips_to_tipsAutismFragment)

        }
        binding.btnTipsAdhd.setOnClickListener {

            findNavController().navigate( R.id.action_nav_tips_to_tips)

        }
         binding.btnTipsLearning.setOnClickListener {

            findNavController().navigate( R.id.action_nav_tips_to_tipsLearningFragment)

        }


        return binding.root
    }



    companion object {


    }

//    binding.btn1.setOnClickListener {
//        findNavController().navigate( R.id.action_nav_home_to_autismComponentFragment)
//    }
}