package com.corpus.ui.viewmodels

import android.app.Activity
import androidx.lifecycle.ViewModel
import com.corpus.interfaces.HomeInterface
import com.corpus.models.CarousalResponseModel
import com.corpus.utils.UtilHelper
import com.google.gson.Gson


class HomeViewModel(

) : ViewModel() {
    private lateinit var homeInterface: HomeInterface

    fun getCarouselData(activity: Activity) {

        val jsonString = UtilHelper.getJsonStringFromAssets(activity, UtilHelper.carousalFileName)
        val gson = Gson()
        val carousalResponseModel = gson.fromJson(jsonString, CarousalResponseModel::class.java)
        homeInterface.onCarousalDataSuccess(carousalResponseModel)
    }

    fun setInterface(activity: HomeInterface) {
        homeInterface = activity
    }
}