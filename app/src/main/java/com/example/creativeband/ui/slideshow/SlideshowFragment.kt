package com.example.creativeband.ui.slideshow

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.creativeband.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        goToMail()
        goToFace()


        return root
    }

    fun goToMail(){
        binding.textGoToMail.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            // Set the data (URL) for the intent
            intent.data = Uri.parse("mailto:Creativeband771@gmail.com")

            // Start the activity with the intent
            startActivity(intent)
        }

    }
    fun goToFace(){
        binding.textGoToFace.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)

            // Set the data (URL) for the intent
            intent.data = Uri.parse("https://www.facebook.com/profile.php?id=61557270992276")

            // Start the activity with the intent
            startActivity(intent)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}