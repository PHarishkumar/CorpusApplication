package com.corpus.utils

import android.content.Context
import java.io.IOException
import java.nio.charset.StandardCharsets


class UtilHelper {
    companion object {
        val carousalFileName: String = "carousal.json"
        val mobile: String = "Mobile"


        fun getJsonStringFromAssets(context: Context, fileName: String): String? {
            return try {
                val inputStream = context.assets.open(fileName)
                val size = inputStream.available()
                val buffer = ByteArray(size)
                inputStream.read(buffer)
                inputStream.close()

                String(buffer, StandardCharsets.UTF_8)
            } catch (e: IOException) {
                e.printStackTrace()
                null
            }
        }

        fun isValidMobileNumber(mobile: String): Boolean {
            val mobileNumberPattern =
                "^[6-9]\\d{9}$" // Indian mobile numbers: starts with 6-9 and is 10 digits long
            return mobile.matches(Regex(mobileNumberPattern))
        }
    }

}