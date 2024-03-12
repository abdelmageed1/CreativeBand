package com.example.creativeband.ui.Tips

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.creativeband.R
import com.example.creativeband.databinding.FragmentTipsAutismBinding
import com.example.creativeband.databinding.FragmentTipsBinding
import com.example.creativeband.databinding.FragmentTipsLearningBinding


class TipsLearningFragment : Fragment() {
    lateinit var binding: FragmentTipsLearningBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTipsLearningBinding.inflate(inflater,container,false)

        val imageListadhd = ArrayList<SlideModel>()
        imageListadhd.add(SlideModel(R.drawable.bg_tips_learning_1))
        imageListadhd.add(SlideModel(R.drawable.bg_tips_learning_2))
        imageListadhd.add(SlideModel(R.drawable.bg_tips_learning_3))
        imageListadhd.add(SlideModel(R.drawable.bg_tips_learning_4))
        imageListadhd.add(SlideModel(R.drawable.bg_tips_learning_5))

        binding.sliderImageRec.setImageList(imageListadhd , ScaleTypes.FIT)

        return binding.root

    }

    companion object {

    }
}