package com.kantongku.kantongku03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import com.kantongku.kantongku.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnPindah: Button

    val menuTeks = arrayOf("Transaksi", "Tabungan", "Hutang")
    val menuIcon = arrayOf(R.drawable.ic_dompet, R.drawable.ic_nabung, R.drawable.ic_hutaang)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPindah = findViewById(R.id.btnPindah)
        btnPindah.setOnClickListener(this)

        val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter)
        TabLayoutMediator(tab_layout, view_pager,
            TabLayoutMediator.TabConfigurationStrategy{ tab, position ->
                tab.text = menuTeks[position]
                tab.icon = ResourcesCompat.getDrawable(resources, menuIcon[position], null)
            }).attach()
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.btnPindah -> run{
                    var intent = Intent(this@MainActivity, Input::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}