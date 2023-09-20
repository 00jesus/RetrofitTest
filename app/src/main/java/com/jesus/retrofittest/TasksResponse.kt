package com.jesus.retrofittest

import com.google.gson.annotations.SerializedName

data class TasksResponse(
    @SerializedName("_id") val id: String,
    @SerializedName("description") val description: String,
    @SerializedName("rut") val rut: String,
    @SerializedName("title") val title: String

    //DogsResponse (@SerializedName("status") var status:String, @SerializedName("message") var images: List<String>)
)