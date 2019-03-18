package com.mangoice.weather.data.model.weather

import com.google.gson.annotations.SerializedName

/**
 * Created by MangoIce on 2019/3/15.
 *
 * 原型
 */
class Indices {
    @SerializedName("indices")
    lateinit var indicesValue: IndicesValue
    var pubTime = ""
    var status = 0

    inner class IndicesValue {
        var type = ""
        var value = ""
    }

}