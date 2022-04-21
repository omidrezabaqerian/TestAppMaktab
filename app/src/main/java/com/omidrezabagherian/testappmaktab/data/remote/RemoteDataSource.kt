package com.omidrezabagherian.testappmaktab.data.remote

import com.omidrezabagherian.testappmaktab.model.PictureList
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val retrofit: ImageService) {

    suspend fun getPictureList(): Response<PictureList> {
        return retrofit.getImageList()
    }

}