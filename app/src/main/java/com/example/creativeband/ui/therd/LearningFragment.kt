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
import com.example.creativeband.databinding.FragmentLearningBinding


class LearningFragment : Fragment() {
    lateinit var binding: FragmentLearningBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLearningBinding.inflate(inflater,container,false)


        val ac = activity

        binding.card31.setOnClickListener {
            GameActivity.link ="https://www.tinytap.com/activities/g5glz/play/writing"
            var intent = Intent(ac!!.baseContext, GameActivity::class.java)
            startActivity(intent)

        }


        binding.card32.setOnClickListener {
            GameActivity.link ="https://www.tinytap.com/activities/g5gjs/play/reading"
            var intent = Intent(ac!!.baseContext, GameActivity::class.java)
            startActivity(intent)

        }

        binding.card33.setOnClickListener {
                GameActivity.link ="https://www.tinytap.com/activities/g5gjt/play/math"
                var intent = Intent(ac!!.baseContext, GameActivity::class.java)
                startActivity(intent)

            }




        return binding.root
    }

    companion object {

    }
}