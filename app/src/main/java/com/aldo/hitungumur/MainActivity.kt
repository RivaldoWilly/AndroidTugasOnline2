package com.aldo.hitungumur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnhitung.setOnClickListener{

            //deklarasi edit text
            var tahunLahir = nrinput.text.toString()

            //get tahun saat ini dengan calender
            var tahun:Int = Calendar.getInstance().get(Calendar.YEAR)

            //get umur = tahun saat ini di kurangi dengan input pada text
            var umur = 0
            if (tahunLahir.toIntOrNull() !=null) {
                umur = tahun - tahunLahir.toInt()
                tvumur.text = "Umur = $umur Tahun"
            }else {
                tvumur.text = "Tahun Tidak Valid"
            }


        }
    }
}
