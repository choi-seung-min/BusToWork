package com.example.bustowork.model

import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "body", strict = false)
data class CityBody @JvmOverloads constructor(
    @field:ElementList(name = "items")
    var items: List<City>? = null
)