package com.example.surya_app.ui.Paediatric

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PediatricViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Department of General paediatrics at Surya hospitals are very few centres in India which aim at providing quality healthcare facilities exclusively for children upto the age of 18 years with high level care in paediatric services including inpatient, outpatient , paediatric ICU, Paediatric Super specialities and Paediatric surgeries.\n" +
                "\n" +
                "We seek to provide paediatric patient and their families easy access to the most advanced and affordable child care from A to Z."
    }
    val text: LiveData<String> = _text
}