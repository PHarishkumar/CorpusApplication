package com.corpus.interfaces

import com.corpus.models.CarousalResponseModel

interface HomeInterface {
    fun onCarousalDataSuccess(carousalResponseModel: CarousalResponseModel)
}