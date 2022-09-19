package com.example.tabactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout : TabLayout
    private lateinit var viewPager : ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tab)
        viewPager = findViewById(R.id.view_pager)
        viewPager.adapter = MainPageAdapter (supportFragmentManager, lifecycle)

        TabLayoutMediator(tabLayout, viewPager){ tab, position ->
            when (position){
                0 -> tab.icon = getDrawable(R.drawable.ic_baseline_home_24)
                1-> tab.icon = getDrawable(R.drawable.ic_baseline_favorite_24)
            }
        }.attach()
        viewPager.currentItem = 1
    }
}