package com.mangoice.weather.data.model.weather

import com.google.gson.annotations.SerializedName

/**
 * Created by MangoIce on 2019/3/15.
 *
 * 当前天气信息
 */
class Current {
    //体感温度
    @SerializedName("feelsLike")
    lateinit var feelLike: UnitValue
    //相对空气湿度
    lateinit var humidity: UnitValue
    //气压
    lateinit var pressure: UnitValue
    //发布时间
    var pubTime = ""
    //温度
    lateinit var temperature: UnitValue
    //紫外线指数
    var uvIndex = ""
    //能见度
    lateinit var visibility: UnitValue
    //天气状况（详见天气状况信息表）
    @SerializedName("weather")
    var weatherInfo = ""
    //风信息
    lateinit var wind: Wind
}