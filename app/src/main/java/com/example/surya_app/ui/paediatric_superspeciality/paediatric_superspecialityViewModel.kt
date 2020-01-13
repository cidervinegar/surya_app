package com.example.surya_app.ui.paediatric_superspeciality

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class paediatric_superspecialityViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Children are not small adults. To treat their complicated problems we need super specialists who are trained to treat children and infants. Surya hospital brings to Pune unparalleled team of super specialists. Our expert super specialists are well trained in their respective branches. They utilize established pediatric medical and surgical knowledge as well as new evidence based surgical and medical techniques to offer most current and when appropriate innovative treatments. The pediatric surgeons are experts in surgical care of children with newborn malformations, surgical emergencies, gastrointestinal problems, lung trachea chest wall malformations as well as tumours and cancer. The team performs both traditional and minimally invasive surgeries. The super specialist physicians provide comprehensive range of services in the fields such as intensive care, cardiology, neurology, genetic medicine, hemato-oncology and nephrology . The entire team of surgeons and physicians make Surya hospital one stop destination for any child care related problem under the sun.\n" +
                "\n" +
                "Our Specialities:\n" +
                "Allergology\n" +
                "Anaesthesiology\n" +
                "Clinical Psychology\n" +
                "Community Medicine\n" +
                "Dermatology\n" +
                "Diet and Nutrition\n" +
                "Genetics Clinic\n" +
                "Haematology & Oncology\n" +
                "Lactation Consultant\n" +
                "Paediatric Neurosurgery\n" +
                "Paediatric Cardiologists\n" +
                "Paediatric Dentist\n" +
                "Paediatric Endocrinologists\n" +
                "Paediatric Gastroenterology\n" +
                "Paediatric Nephrologist\n" +
                "Paediatric Ophthalmology\n" +
                "Paediatric Orthopaedic Surgery\n" +
                "Paediatric General Surgery\n" +
                "Paediatric Neurology\n" +
                "Physiotherapy\n" +
                "Psychiatry\n" +
                "Paediatric Urology\n" +
                "Occupational Therapy\n" +
                "Paediatric ENT Surgery\n" +
                "Pathology\n" +
                "Speech Therapy\n" +
                "Child Development and Behaviour (ABA) Centre\n" +
                "Paediatric Rheumatology\n" +
                "Neurophysiology"
    }
    val text: LiveData<String> = _text
}