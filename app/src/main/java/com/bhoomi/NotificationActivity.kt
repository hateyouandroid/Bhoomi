package com.bhoomi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bhoomi.base.BaseActivity
import com.bhoomi.databinding.ActivityNotificationBinding
import com.bhoomi.ext.startActivity

class NotificationActivity: BaseActivity<ActivityNotificationBinding>(ActivityNotificationBinding::inflate) {

    override fun onClick() {
        binding.imgClose.setOnClickListener {
           startActivity(MainActivity())
        }
    }
    override fun initView() {
        super.initView()
    }
}