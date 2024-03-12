package com.example.creativeband.ui.therd

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.creativeband.GameActivity
import com.example.creativeband.R
import com.example.creativeband.databinding.FragmentADHDComponentBinding
import com.example.creativeband.databinding.FragmentAutismComponentBinding

class ADHDComponentFragment : Fragment() {
    lateinit var binding: FragmentADHDComponentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentADHDComponentBinding.inflate(inflater,container,false)

        val ac = activity


        binding.card31.setOnClickListener {
            GameActivity.link ="https://www.tinytap.com/activities/g5g9r/play/puzzle"
            var intent = Intent(ac!!.baseContext, GameActivity::class.java)
            startActivity(intent)

        }

        binding.card32.setOnClickListener {
            GameActivity.link ="https://www.tinytap.com/activities/g5gjl/play/shadows"
            var intent = Intent(ac!!.baseContext, GameActivity::class.java)
            startActivity(intent)

        }

        binding.card33.setOnClickListener {
            GameActivity.link ="https://www.tinytap.com/activities/g5gly/play/color"
            var intent = Intent(ac!!.baseContext, GameActivity::class.java)
            startActivity(intent)

        }



        return binding.root
    }

    companion object {

    }
}