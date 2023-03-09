package com.bhoomi

import com.bhoomi.base.BaseActivity
import com.bhoomi.databinding.ActivityLoginBinding
import com.bhoomi.ext.addbottomSheet
import com.bhoomi.ext.startActivity
import com.google.android.material.bottomsheet.BottomSheetDialog

class LoginActivity : BaseActivity<ActivityLoginBinding>(ActivityLoginBinding::inflate) {
    private lateinit var bottomSheetDialog: BottomSheetDialog
    override fun onClick() {
        binding.btLogin.setOnClickListener {
            //addbottomSheet(this)
            startActivity(MainActivity())
        }
    }

}