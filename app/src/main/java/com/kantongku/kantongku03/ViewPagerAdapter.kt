package com.kantongku.kantongku

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
            private val JUMLAH_MENU = 3

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {return TransaksiFragment()}
            1 -> {return TabunganFragment()}
            2 -> {return HutangFragment()}
            else -> {return TransaksiFragment()}
        }
    }

    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}