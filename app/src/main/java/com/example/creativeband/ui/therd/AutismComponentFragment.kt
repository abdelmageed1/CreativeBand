package com.example.creativeband.ui.therd

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.creativeband.GameActivity
import com.example.creativeband.R
import com.example.creativeband.databinding.FragmentAutismComponentBinding


class AutismComponentFragment : Fragment() {
    lateinit var binding: FragmentAutismComponentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentAutismComponentBinding.inflate(inflater,container,false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val ac = activity
        binding.btnPuzzle.setOnClickListener {
            GameActivity.link ="https://www.tinytap.com/activities/g5g9r/play/puzzle"
            var intent = Intent(ac!!.baseContext, GameActivity::class.java)
            startActivity(intent)


        }
    }


    companion object {

    }

//    "https://www.tinytap.com/activities/g5g9r/play/puzzle

}