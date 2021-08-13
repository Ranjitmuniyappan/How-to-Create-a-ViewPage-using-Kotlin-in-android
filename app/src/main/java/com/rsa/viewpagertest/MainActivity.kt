package com.rsa.viewpagertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.rsa.viewpagertest.adapter.PageAdapter
import com.rsa.viewpagertest.fragment.FragmentOne.Companion.newInstanceOne
import com.rsa.viewpagertest.fragment.FragmentThree.Companion.newInstanceThree
import com.rsa.viewpagertest.fragment.FragmentTwo.Companion.newInstanceTwo

class MainActivity : AppCompatActivity() {

    var tabTitle = arrayOf("Jagadesan","Ranjit","Karthik")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        val adapter = PageAdapter(supportFragmentManager)
        for (i in tabTitle)
        {
            if (i.equals("Jagadesan"))
            {
                val bundle = Bundle()
                bundle.putString("name","Jagadesan")
                adapter.addFragment(newInstanceOne(bundle), i)
            }else if (i.equals("Ranjit"))
            {
                val bundle = Bundle()
                bundle.putString("name","Ranjit")
                adapter.addFragment(newInstanceOne(bundle), i)
            }else if (i.equals("Karthik"))
            {
                val bundle = Bundle()
                bundle.putString("name","Karthik")
                adapter.addFragment(newInstanceThree(bundle), i)
            }
        }

        viewPager!!.adapter = adapter
        viewPager!!.offscreenPageLimit = 3
        tabLayout.setupWithViewPager(viewPager)
    }
}