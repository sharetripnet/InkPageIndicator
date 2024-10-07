package com.pixelcan.ipidemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.pixelcan.inkpageindicator.InkPageIndicator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()

        val mAdapter = TestFragmentAdapter(supportFragmentManager)

        val mPager = findViewById<ViewPager>(R.id.pager)
        mPager.adapter = mAdapter

        val mIndicator = findViewById<InkPageIndicator>(R.id.indicator)
        mIndicator.setViewPager(mPager)
    }
}

