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
import kotlinx.android.synthetic.main.fragment_tabungan.*

class TabunganFragment: Fragment() {
    lateinit var listTabungan : ArrayList<TabunganDt>

    private fun simulasiTabungan() {
        listTabungan = ArrayList()
        listTabungan.add(
            TabunganDt("Senin, 13 Desember 2021",
            "Rp.100.000", "1 Desember 2021", "Bismillah")
        )
        listTabungan.add(TabunganDt("Selasa, 14 Desember 2021",
            "Rp.100.000", "14 Desember 2021", "Bismillah"))
        listTabungan.add(TabunganDt("Rabu, 15 Desember 2021",
            "Rp.100.000", "15 Desember 2021", "Bismillah"))
        listTabungan.add(TabunganDt("Kamis, 16 Desember 2021",
            "Rp.100.000", "16 Desember 2021", "Bismillah"))
        listTabungan.add(TabunganDt("Senin, 20 Desember 2021",
            "Rp.100.000", "20 Desember 2021", "Bismillah"))
    }

    private fun tampilTabungan() {
        rvListTabungan.layoutManager=LinearLayoutManager(activity)
        rvListTabungan.adapter=TabunganAdapter(activity!!, listTabungan)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tabungan, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iniView()
    }

    private fun iniView() {
        simulasiTabungan()
        tampilTabungan()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}