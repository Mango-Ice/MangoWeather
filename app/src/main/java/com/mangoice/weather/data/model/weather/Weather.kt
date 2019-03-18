package com.mangoice.weather.data.model.weather

import com.google.gson.annotations.SerializedName

/**
 * Created by MangoIce on 2019/3/15.
 */
class Weather {
    //当前天气状况
    lateinit var current: Current
    //今日天气预测
    @SerializedName("forecastDaily")
    lateinit var daily: Daily
    //今日小时预测
    @SerializedName("forecastHourly")
    lateinit var hourly: Hourly
    //原型
    lateinit var indices: Indices
    //预警信息
    lateinit var alerts: List<String>
    //昨日天气信息
    lateinit var yesterday: Yesterday
    //
    lateinit var preHour: PreHour
    //更新时间
    var updateTime = 0L
    lateinit var aqi: Aqi

    inner class Aqi {
        var status = 0
    }

}