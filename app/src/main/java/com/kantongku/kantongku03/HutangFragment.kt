package com.kantongku.kantongku

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.kantongku.kantongku03.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_hutang.*

class HutangFragment: Fragment() {
    lateinit var listHutang: ArrayList<HutangDt>

    private fun simulasiCatatanHutang() {
        listHutang= ArrayList()
        listHutang.add(
            HutangDt("Linda", "100.000", "12 Desember 2021",
            "harus kembali akhir Desember")
        )
        listHutang.add(HutangDt("Wita", "50.000", "13 Desember 2021",
            "harus kembali akhir Desember"))
        listHutang.add(HutangDt("Indah", "25.000", "14 Desember 2021",
            "harus kembali akhir Desember"))
        listHutang.add(HutangDt("Faisol", "10.000", "15 Desember 2021",
            "harus kembali akhir Desember"))
        listHutang.add(HutangDt("Feri", "5.000", "16 Desember 2021",
            "harus kembali akhir Desember"))
        listHutang.add(HutangDt("Dita", "2.000", "11 Desember 2021",
            "harus kembali akhir Desember"))
    }

    private fun tampilHutang() {
        rvListHutang.layoutManager=LinearLayoutManager(activity)
        rvListHutang.adapter=HutangAdapter(activity!!, listHutang)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hutang, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iniView()
    }

    private fun iniView() {
        simulasiCatatanHutang()
        tampilHutang()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}