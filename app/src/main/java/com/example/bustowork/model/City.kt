package com.example.bustowork.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "item", strict = false)
data class City @JvmOverloads constructor(
    @field:Element(name = "citycode")
    var citycode: String? = null,
    @field:Element(name = "cityname")
    var cityname: String? = null
)