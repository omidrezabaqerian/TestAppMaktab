package com.omidrezabagherian.testappmaktab.data.remote

import com.omidrezabagherian.testappmaktab.model.PictureList
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ImageService {
    @GET("")
    suspend fun getImageList():Response<PictureList>
}