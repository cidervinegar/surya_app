package com.example.surya_app.ui.women_care

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.surya_app.R

class women_careFragment : Fragment() {

    private lateinit var paediatricSuperspecialityViewModel: women_careViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        paediatricSuperspecialityViewModel =
                ViewModelProviders.of(this).get(women_careViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_women_care, container, false)
        val textView: TextView = root.findViewById(R.id.text_tools)
        paediatricSuperspecialityViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}