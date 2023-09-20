package com.jesus.retrofittest

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ConsumirApi {
    @GET("todos")
    suspend fun getTasks(@Query("rut") rut : String) : List<TasksResponse>

    @GET("todos")
    fun getTraer(@Query("rut") rut: String) : Call<TasksResponse>
    @GET("todos")
    fun getTraerTodos(@Query("rut") rut: String): Call<TasksResponse>


    @POST("/events")
    fun postCrearTarea(@Query("title") title:String , @Query("description") description : String, @Query("rut")rut: String) : Call<TasksResponse>

    }
