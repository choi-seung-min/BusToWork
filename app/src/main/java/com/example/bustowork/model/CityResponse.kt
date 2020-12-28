package com.example.bustowork.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "response", strict = false)
data class CityResponse @JvmOverloads constructor(
    @field:Element(name = "header")
    var Cityheader: CityHeader? = null,
    @field:Element(name = "body")
    var citiebody: CityBody? = null
)