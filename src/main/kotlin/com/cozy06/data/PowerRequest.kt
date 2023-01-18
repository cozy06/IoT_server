package com.cozy06.data

import kotlinx.serialization.Serializable

@Serializable
data class PowerRequest (
    val product_name: String,
    val power: String
)