package com.example.surya_app.ui.Paediatric

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.surya_app.R

class PediatricFragment : Fragment() {

    private lateinit var pediatricViewModel: PediatricViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        pediatricViewModel =
                ViewModelProviders.of(this).get(PediatricViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        pediatricViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}