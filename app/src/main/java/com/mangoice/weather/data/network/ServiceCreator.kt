package com.mangoice.weather.data.network

import com.mangoice.weather.common.Constant
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by MangoIce on 2019/3/15.
 */
object ServiceCreator {
    private val mHttpClient = OkHttpClient.Builder()

    private val builder = Retrofit.Builder()
        .baseUrl(Constant.BASE_URL)
        .client(mHttpClient.build())
        .addConverterFactory(GsonConverterFactory.create())

    private val builder2 = Retrofit.Builder()
        .baseUrl(Constant.GUOLIN_URL)
        .client(mHttpClient.build())
        .addConverterFactory(GsonConverterFactory.create())

    private val retrofit = builder.build()
    private val retrofit2 = builder2.build()

    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)
    fun <T> create2(serviceClass: Class<T>): T = retrofit2.create(serviceClass)
}