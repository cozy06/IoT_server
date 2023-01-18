package com.cozy06.data

import kotlinx.serialization.Serializable

@Serializable
data class ThingsClickRequest (
    val product_name: String
)