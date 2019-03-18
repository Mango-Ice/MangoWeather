package com.mangoice.weather.data.network.api

import com.mangoice.weather.data.model.weather.Weather
import retrofit2.Call
import retrofit2.http.QueryMap

/**
 * Created by MangoIce on 2019/3/15.
 */
interface WeatherService {

    fun getWeather(@QueryMap queryMap: QueryMap): Call<Weather>
}