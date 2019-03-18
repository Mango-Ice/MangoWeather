package com.mangoice.weather.data.model.weather

import com.google.gson.annotations.SerializedName

/**
 * Created by MangoIce on 2019/3/15.
 *
 * 今日小时预测
 */
class Hourly {
    //Aqi
    lateinit var aqi: Aqi
    //描述
    var desc = ""
    //暂不知道
    var status = 0
    //温度信息
    lateinit var temperature: Temperature
    //天气状况
    @SerializedName("weather")
    lateinit var weatherInfo: WeatherInfo
    //风信息
    @SerializedName("wind")
    lateinit var windInfo: WindInfo

    inner class Aqi {
        var status = 0
    }

    inner class Temperature {
        var pubTime = ""
        var status = 0
        var unit = ""
        lateinit var value: List<String>
    }

    inner class WeatherInfo {
        var pubTime = ""
        var status = 0
        lateinit var value: List<String>
    }

    inner class WindInfo {
        var status = 0
        lateinit var value: List<WindInfoValue>
    }

    inner class WindInfoValue {
        @SerializedName("datetime")
        var dateTime = ""
        var direction = ""
        var speed = ""
    }
}