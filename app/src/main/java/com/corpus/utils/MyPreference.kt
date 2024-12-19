package com.corpus.utils

import android.content.Context
import android.content.SharedPreferences


class MyPreference private constructor(context: Context) {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    companion object {
        private const val PREF_NAME = "Prefs"

        @Volatile
        private var instance: MyPreference? = null

        // Get the singleton instance of MyPreference
        fun getInstance(context: Context): MyPreference {
            return instance ?: synchronized(this) {
                instance ?: MyPreference(context.applicationContext).also { instance = it }
            }
        }
    }

    // Save a string value to preferences
    fun putString(key: String, value: String) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    // Retrieve a string value from preferences
    fun getString(key: String, defaultValue: String? = null): String? {
        return sharedPreferences.getString(key, defaultValue)
    }

    // Remove a key from preferences
    fun remove(key: String) {
        sharedPreferences.edit().remove(key).apply()
    }

    // Clear all preferences
    fun clear() {
        sharedPreferences.edit().clear().apply()
    }
}