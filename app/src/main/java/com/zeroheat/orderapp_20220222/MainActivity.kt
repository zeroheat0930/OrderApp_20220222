package com.zeroheat.orderapp_20220222

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeroheat.orderapp_20220222.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit은 무조껀 : 써야됨
    lateinit var mAdapter: MainViewPagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    fun setupEvents(){

    }

    fun setValues(){

        mAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mAdapter


        mainTabLayout.setupWithViewPager(mainViewPager)

    }
}