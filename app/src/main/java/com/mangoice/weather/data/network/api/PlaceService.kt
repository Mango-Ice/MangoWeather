package com.mangoice.weather.data.network.api

import com.mangoice.weather.data.model.place.City
import com.mangoice.weather.data.model.place.County
import com.mangoice.weather.data.model.place.Province
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PlaceService {

    @GET("api/china")
    fun getProvinces(): Call<List<Province>>

    @GET("api/china/{provinceId}")
    fun getCities(@Path("provinceId") provinceId: Int): Call<List<City>>

    @GET("api/china/{provinceId}/{cityId}")
    fun getCounties(@Path("provinceId") provinceId: Int, @Path("cityId") cityId: Int): Call<List<County>>

    @GET("api/bing_pic")
    fun getBingPic(): Call<String>
}