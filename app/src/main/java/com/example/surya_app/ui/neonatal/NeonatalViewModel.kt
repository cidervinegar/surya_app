package com.example.surya_app.ui.neonatal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NeonatalViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "The dept. of Neonatal care at Surya hospitals provide round the clock cover and function as a team to babies admitted to the unit . Parents are allowed to visit their babies with unlimited access. They are encouraged to actively participate in the day to day care of their baby. Mothers are encouraged to room in with the baby for milk feeding.\n" +
                "\n" +
                "With a bed strength on 105 units, we have a level 3 tertiary set up with advanced equipments including high frequency ventilators catering to premature babies with special needs and those born after high risk pregnancies such as IVF.\n" +
                "\n" +
                "Our multi-level Neonatal Intensive Care Unit (NICU) is not just for high-risk pregnancies or premature births. Even full-term babies sometimes unexpectedly need a little extra support. Our NICU nursing staff cares exclusively for high-risk newborns. This expertise includes supporting families while their baby is receiving care."
    }
    val text: LiveData<String> = _text
}