package com.example.gradenilai153

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_proses.*

class MainProses : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proses)

        val bundle: Bundle? = intent.extras
        val nim = bundle?.get("nim")
        val nm = bundle?.get("nama")
        val scr = bundle?.get("score")

        //kondisi
        var sc = scr.toString()
        var score = sc.toInt()
        if (score >= 80){
            show_result.setText("A") }
        else if(score >= 60){
            show_result.setText("B") }
        else if(score >= 40){
            show_result.setText("C") }
        else if(score >= 20){
            show_result.setText("D") }
        else{
            show_result.setText("E") }

        show_nim.setText(""+nim)
        show_nama.setText(""+nm)
        show_score.setText(""+scr)

        tombolbalik.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
