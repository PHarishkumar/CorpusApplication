package com.corpus.ui.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import com.corpus.R
import com.corpus.databinding.ActivityHomeBinding
import com.corpus.ui.adapters.HomeViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class HomeActivity : FragmentActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout using DataBindingUtil
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        // Set up the ViewPager with the adapter
        val adapter = HomeViewPagerAdapter(this)
        binding.myViewPager.adapter = adapter
binding.myViewPager.isUserInputEnabled=false
        // Attach TabLayout to ViewPager using TabLayoutMediator
        TabLayoutMediator(binding.myTabLayout, binding.myViewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Home"
                1 -> "About"
                else -> null
            }
        }.attach()
    }
}
