package com.example.tabloyoutpractice.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tabloyoutpractice.Fragment.Home
import com.example.tabloyoutpractice.Fragment.Profile
import com.example.tabloyoutpractice.Fragment.Setting

internal class MyAdapter(var context: Context, fm: FragmentManager, var totalTabs: Int): FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Home()
            }
            1 -> {
                Profile()
            }
            2 -> {
                Setting()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}