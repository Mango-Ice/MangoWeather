package com.mangoice.weather.data.model.weather

import com.google.gson.annotations.SerializedName

/**
 * Created by MangoIce on 2019/3/15.
 *
 *
 */
class PreHour {
    //发布时间
    var pubTime = ""
    //风信息
    lateinit var wind: Wind
    //相对空气湿度
    lateinit var humidity: UnitValue
    //气压
    lateinit var pressure: UnitValue
    //能见度
    lateinit var visibility: UnitValue
    //体感温度
    @SerializedName("feelsLike")
    lateinit var feelLike: UnitValue


    inner class Aqi {
        var status = 0
        var pubTime = ""
        var so2 = ""
        var so2Desc = ""
        var o3 = ""
        var o3Desc = ""
        var co = ""
        var coDesc = ""
        var no2 = ""
        var no2Desc = ""
        var primary = ""
        var aqi = ""
        var pm10 = ""
        var pm10Desc = ""
        var pm25 = ""
        var pm25Desc = ""
        var suggest = ""
        var uvIndex = ""
        var weather = ""
        lateinit var temperature: UnitValue
    }
}