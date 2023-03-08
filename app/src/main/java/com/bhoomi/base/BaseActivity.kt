package com.bhoomi.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<_binding : ViewBinding>(val bindingFactory: (LayoutInflater) -> _binding) :
    AppCompatActivity() {

    lateinit var binding: _binding
 /*   lateinit var progressBar: ProgressBarHandler
    lateinit var sharePref: SharePref
    lateinit var user:Data*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = bindingFactory(layoutInflater)
        //user = SharePref(this).getUserDetails()
        setContentView(binding.root)
       // progressBar = ProgressBarHandler(this)
        initVM()
        initView()
        setObserver()
        onClick()


    }



    open fun initView() {}
    open fun setObserver() {}
    open fun onClick() {}
    open fun initVM(){}


}