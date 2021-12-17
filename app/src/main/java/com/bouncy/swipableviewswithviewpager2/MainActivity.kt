package com.bouncy.swipableviewswithviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.frog,
            R.drawable.ttt
        )
        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter

TabLayoutMediator(tab1, viewPager){ tab, position ->
    tab.text = "Tab ${position + 1}"
}.attach()
tab1.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
    override fun onTabSelected(tab: TabLayout.Tab?) {

    }

    override fun onTabUnselected(tab: TabLayout.Tab?) {

    }

    override fun onTabReselected(tab: TabLayout.Tab?) {

    }
})
    }
}