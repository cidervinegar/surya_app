package com.example.surya_app.ui.women_care

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class women_careViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Get Treatment from World Renowned Gynecology Laparoscopy and Endoscopy Specialists\n" +
                "Specialist at Surya Hospital finds her name mentioned in the Guinness Book of World Records and the Limca Book of Records with the team that laparoscopically removed the heaviest Uterine fibroid ever reported in the world, a record she has bettered time and again over the years, the heaviest fibroid weighing 5.6 Kgs.\n" +
                "\n" +
                "Conditions Treated:\n" +
                "Endoscopy/ Laparoscopic Gynaec Surgery\n" +
                "These techniques are used for gynaecological surgeries as preferred alternatives to open surgery because they do not produce intense pain after surgery\n" +
                "Fibroid Removal\n" +
                "Fibroids are growths that occur in the uterus, most commonly during childbearing years. Fibroid may be a single fibroid or multiple fibroids; extremely small or big in size, but are mostly benign or non-cancerous in nature.\n" +
                "Hysterectomy\n" +
                "Hysterectomy means removal of the uterus. However other organs such as ovaries, fallopian tubes and the cervix are very frequently removed as part of the surgery.\n" +
                "Endometriosis\n" +
                "Endometriosis is the abnormal growth of uterine lining cells on the location outside of the uterus. Management of endometriosis includes medication and surgery for both pain relief and treatment of infertility if pregnancy is desired.\n" +
                "Prolapse of uterus\n" +
                "Uterine prolapse results from the weakening of pelvic muscles and supportive tissues that support uterus. As a result, the uterus slips down into or protrudes out of the vagina.\n" +
                "Urinary Incontinence\n" +
                "Urinary incontinence is the involuntary leakage of urine due to loss of bladder control.\n" +
                "Solutions Offered:\n" +
                "Laparoscopic Pelvic floor repair for Prolapse of uterus\n" +
                "Tubal Reconstructive Surgeries\n" +
                "Laparoscopic Hysterectomies for Gynecological Malignancies including Lymph Node sampling\n" +
                "Treatment for Stress Urinary Incontinence\n" +
                "Corrective surgeries for uterine malformations\n" +
                "Why Consult at Surya Hospitals?\n" +
                "Voted the best gynaecology hospital in India\n" +
                "A hospital dedicated to women\n" +
                "Hassel-free healthcare\n" +
                "30+ years' experience\n" +
                "Team of 40+ experienced and specialist gynaecologists"
    }
    val text: LiveData<String> = _text
}