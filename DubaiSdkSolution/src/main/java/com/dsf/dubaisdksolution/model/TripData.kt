package com.dsf.dubaisdksolution.model



data class TripData(
    val _id: String,
    val description: Description,
    val name: Name,
    val picUrl: List<PicUrl>,
    val tripPoi: String
)
data class Description(
    val en: Multigunual
)


data class Name(
    val en: Multigunual
)


data class PicUrl(
    val imgurl: String,
    val name: String,
    val originalUrl: String)


data class Multigunual(
    val en: String,
    val ar: String

)

