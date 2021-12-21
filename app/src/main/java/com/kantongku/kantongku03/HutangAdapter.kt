package com.kantongku.kantongku

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kantongku.kantongku03.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.hutang_item.*
import kotlinx.android.synthetic.main.tabungan_item.*

class HutangAdapter (private val context: Context, private val items: ArrayList<HutangDt>):
    RecyclerView.Adapter<HutangAdapter.ViewHolder> ()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.hutang_item, parent, false)
    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }

    class ViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item: HutangDt) {
            txtHutangNama.text=item.nama
            txtHutangNominal.text=item.nominal
            txtHutangCatatan.text=item.Catatan
        }
    }
}