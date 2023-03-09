package com.bhoomi

import com.bhoomi.base.BaseActivity
import com.bhoomi.databinding.ActivityMainBinding
import com.bhoomi.ext.printTost
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomsheet.BottomSheetDialog


class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun onClick() {


    }
    override fun initView() {
        super.initView()
         binding.bottomNavBar.background=null
        binding.bottomNavBar.menu.getItem(2).isEnabled=false
    }




}