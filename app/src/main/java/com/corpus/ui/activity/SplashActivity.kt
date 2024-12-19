package com.corpus.ui.activity


import android.R
import android.app.Activity
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.Target
import com.corpus.databinding.ActivityHomeBinding
import com.corpus.databinding.ActivitySplashBinding
import com.corpus.utils.MyPreference
import com.corpus.utils.UtilHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashActivity : Activity() {
    private var isAppReady = false
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        splashScreen.setKeepOnScreenCondition {
            !isAppReady

        }
        initializeDelay()
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, com.corpus.R.layout.activity_splash)
    }

    private fun initializeDelay() {
        CoroutineScope(Dispatchers.IO).launch {
            delay(10000)
            isAppReady = true
            startMainActivity()
        }
    }

    private fun startMainActivity() {
        val prefs = MyPreference.getInstance(this@SplashActivity)
        val intent: Intent
        if (prefs.getString(UtilHelper.mobile) != null) {
            intent = Intent(this, HomeActivity::class.java)
        } else {
            intent = Intent(this, LoginActivity::class.java)
        }
        startActivity(intent)
        finish()
    }
}