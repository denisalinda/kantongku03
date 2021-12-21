package com.kantongku.kantongku

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.ScrollingTabContainerView
import androidx.recyclerview.widget.RecyclerView
import com.kantongku.kantongku03.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.transaksi_item.*

class TransaksiAdapter (private val context: Context, private val items: ArrayList<TransaksiDt>):
    RecyclerView.Adapter<TransaksiAdapter.ViewHolder> ()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.transaksi_item, parent, false)
    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }

    class ViewHolder(override val containerView: View) :
            RecyclerView.ViewHolder(containerView), LayoutContainer {
                fun bindItem(item: TransaksiDt) {
                    txtTransaksiNama.text=item.nama
                    txtTransaksi.text=item.transaksi
                    txtTransaksiNominal.text=item.nominal
                }
            }
}

