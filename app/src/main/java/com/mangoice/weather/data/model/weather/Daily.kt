package com.mangoice.weather.data.model.weather

import com.google.gson.annotations.SerializedName

/**
 * Created by MangoIce on 2019/3/15.
 *
 * 今日天气预测
 */
class Daily {
    //Aqi
    lateinit var aqi: Aqi
    //降雨概率
    @SerializedName("precipitationProbability")
    lateinit var rainProbability: RainProbability
    //发布时间
    var pubTime = ""
    //暂不知道
    var status = ""
    //日出日落
    @SerializedName("sunRiseSet")
    lateinit var sunRise: SunRise
    //温度信息
    lateinit var temperature: StatusUnitValue
    //天气状况
    @SerializedName("weather")
    lateinit var weatherInfo: WeatherInfo



    inner class Aqi {
        var status = 0
    }

    inner class RainProbability {
        var status = 0
        lateinit var value: List<String>
    }

    inner class SunRise {
        var status = 0
        lateinit var value: List<FromTo>
    }

    inner class WeatherInfo {
        var status = 0
        lateinit var value: List<FromTo>
    }

    inner class StatusUnitValue {
        var status = 0
        var unit = ""
        lateinit var value: List<FromTo>
    }

    inner class WindInfo {
        //风向
        lateinit var direction: StatusUnitValue
        //风速
        lateinit var speed: StatusUnitValue
    }
}