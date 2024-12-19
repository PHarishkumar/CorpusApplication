package com.corpus.ui.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.corpus.R
import com.corpus.databinding.ActivityLoginBinding
import com.corpus.utils.MyPreference
import com.corpus.utils.UtilHelper


class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView<ActivityLoginBinding>(this, R.layout.activity_login)

        getSupportActionBar()?.hide()

        binding.mobilEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(
                charSequence: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) {
                // Code to run before the text changes (optional)
            }

            override fun onTextChanged(
                charSequence: CharSequence?,
                start: Int,
                before: Int,
                count: Int
            ) {
                binding.mobilEditText.setError(null)
                // Code to run when the text changes
                val mobile = charSequence.toString()
                if (mobile.length == 10) {
                    if (UtilHelper.isValidMobileNumber(mobile)) {
                        binding.otpInput.visibility = View.VISIBLE
                    } else {
                        binding.mobilEditText.setError("Please enter mobile number starts with 6|7|8|9")
                    }

                } else {
                    binding.otpInput.visibility = View.GONE
                    binding.passwordEditText.setText("")
                }
            }

            override fun afterTextChanged(editable: Editable?) {
                // Code to run after the text changes (optional)
            }
        })

        binding.passwordEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(
                charSequence: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) {
                // Code to run before the text changes (optional)
            }

            override fun onTextChanged(
                charSequence: CharSequence?,
                start: Int,
                before: Int,
                count: Int
            ) {
                // Code to run when the text changes
                val mobile = charSequence.toString()
                if (mobile.length == 4) {
                    val prefs = MyPreference.getInstance(this@LoginActivity)
                    prefs.putString(UtilHelper.mobile, binding.mobilEditText.text.toString())
                    val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                    startActivity(intent)
                    finish()

                }
            }

            override fun afterTextChanged(editable: Editable?) {
                // Code to run after the text changes (optional)
            }
        })
    }
}