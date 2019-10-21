package com.example.gradenilai153

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nim: EditText = findViewById(R.id.inputnim)
        var nm: EditText = findViewById(R.id.inputnama)
        var sc: EditText = findViewById(R.id.inputscore)

        tombolcek.setOnClickListener(){
            intent = Intent(this, MainProses::class.java)
            intent.putExtra("nim",nim.getText())
            intent.putExtra("nama",nm.getText())
            intent.putExtra("score",sc.getText())
            startActivity(intent)
        }
    }
}
