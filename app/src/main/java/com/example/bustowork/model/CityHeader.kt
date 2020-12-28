package com.example.bustowork.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "header", strict = false)
data class CityHeader @JvmOverloads constructor(
    @field:Element(name = "resultCode")
    var resultcode: String? = null,
    @field:Element(name = "resultMsg")
    var resultmsg: String? = null
)