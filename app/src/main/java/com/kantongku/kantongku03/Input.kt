package com.kantongku.kantongku03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Input : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnTran: Button
    private lateinit var btnTabung: Button
    private lateinit var btnTanggung: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        btnTran = findViewById(R.id.btn_tran)
        btnTran.setOnClickListener(this)

        btnTabung = findViewById(R.id.btn_tabung)
        btnTabung.setOnClickListener(this)

        btnTanggung = findViewById(R.id.btn_tanggung)
        btnTanggung.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.btn_tran -> run{
                    val intent = Intent(this, InputTransaksi::class.java)
                    startActivity(intent)
                }
                R.id.btn_tabung -> run{
                    val intent = Intent(this, InputTabungan::class.java)
                    startActivity(intent)
                }
                R.id.btn_tanggung -> run{
                    val intent = Intent(this, InputTanggungan::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}