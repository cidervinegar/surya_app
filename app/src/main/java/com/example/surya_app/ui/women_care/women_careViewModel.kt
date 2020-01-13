package com.example.surya_app.ui.women_care

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class women_careViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is paediatricsuperspeciality Fragment"
    }
    val text: LiveData<String> = _text
}