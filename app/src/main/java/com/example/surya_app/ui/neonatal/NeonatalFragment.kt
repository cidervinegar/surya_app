package com.example.surya_app.ui.neonatal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.surya_app.R

class NeonatalFragment : Fragment() {

    private lateinit var neonatalViewModel: NeonatalViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        neonatalViewModel =
                ViewModelProviders.of(this).get(NeonatalViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tools, container, false)
        val textView: TextView = root.findViewById(R.id.text_tools)
        neonatalViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}