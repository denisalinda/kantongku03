package com.kantongku.kantongku

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.kantongku.kantongku03.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_tabungan.*
import kotlinx.android.synthetic.main.fragment_transaksi.*

class TransaksiFragment : Fragment() {
    lateinit var listTransaksi:ArrayList<TransaksiDt>

    private fun simulasiTransaksi() {
        listTransaksi = ArrayList()
        listTransaksi.add(
            TransaksiDt("KIP", "Pemasukkan",
            "Rp.4.200.000", "Rabu, 2 Oktober 2021", "Alhamdulillah")
        )
        listTransaksi.add(TransaksiDt("Bayar Kos", "Pengeluaran",
            "Rp. 500.000", "Senin, 15 November 2021", "Bayar Kos"))
        listTransaksi.add(TransaksiDt("Bayar Kos", "Pengeluaran",
            "Rp. 500.000", "Rabu, 15 Desember 2021", "Bayar Kos"))
    }

    private fun tampilTransaksi() {
        rvListTransaksi.layoutManager=LinearLayoutManager(activity)
        rvListTransaksi.adapter=TransaksiAdapter(activity!!, listTransaksi )
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_transaksi, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iniView()
    }

    private fun iniView() {
        simulasiTransaksi()
        tampilTransaksi()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}