package com.mangoice.weather.data.network

import com.mangoice.weather.data.model.place.City
import com.mangoice.weather.data.model.place.County
import com.mangoice.weather.data.model.place.Province
import com.mangoice.weather.data.network.api.PlaceService
import com.mangoice.weather.data.network.api.WeatherService
import retrofit2.Callback

/**
 * Created by MangoIce on 2019/3/18.
 */
class WeatherNetwork {
    private val weatherService = ServiceCreator.create(WeatherService::class.java)

    private val placeService = ServiceCreator.create2(PlaceService::class.java)

    fun fetchProvinceList(callback: Callback<List<Province>>) = placeService.getProvinces().enqueue(callback)

    fun fetchCityList(provinceId: Int, callback: Callback<List<City>>) = placeService.getCities(provinceId).enqueue(callback)

    fun fetchCountyList(provinceId: Int, cityId: Int, callback: Callback<List<County>>) = placeService.getCounties(provinceId, cityId).enqueue(callback)

    fun fetchBingPic(callback: Callback<String>) = placeService.getBingPic().enqueue(callback)

    companion object {
        private var network: WeatherNetwork? = null

        fun  getInstance(): WeatherNetwork {
            if (network == null) {
                synchronized(WeatherNetwork::class.java) {
                    if (network == null) {
                        network = WeatherNetwork()
                    }
                }
            }
            return network!!
        }
    }
}