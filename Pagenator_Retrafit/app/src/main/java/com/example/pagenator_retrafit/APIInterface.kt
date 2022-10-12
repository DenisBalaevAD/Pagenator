package com.example.pagenator_retrafit

import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface APIInterface {
    @GET("users")
    fun getPage(@Query("page") page: Int): Call<MainPage>
}

data class MainPage(@SerializedName("data") val data:List<PaigeItem>)

data class PaigeItem(
    @SerializedName("first_name")
    val first_name:String,
    @SerializedName("last_name")
    val last_name:String,
    @SerializedName("email")
    val email:String,
    @SerializedName("avatar")
    val avatar:String
    )