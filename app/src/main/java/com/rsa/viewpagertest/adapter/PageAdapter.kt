package com.rsa.viewpagertest.adapter


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

import java.util.ArrayList

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){

    private val mFragmentList: MutableList<Fragment> = ArrayList()
    private val titleList: MutableList<String> = ArrayList()


    override fun getCount(): Int {
        return mFragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }

    fun addFragment(fragment:Fragment, title:String)
    {
        this.mFragmentList.add(fragment)
        this.titleList.add(title)
    }
}