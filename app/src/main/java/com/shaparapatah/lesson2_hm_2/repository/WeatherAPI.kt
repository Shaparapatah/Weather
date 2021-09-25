package com.shaparapatah.lesson2_hm_2.repository

import com.shaparapatah.lesson2_hm_2.utils.YANDEX_API_KEY_NAME
import com.shaparapatah.lesson2_hm_2.utils.YANDEX_API_URL_END_POINT
import com.shaparapatah.lesson2_hm_2.utils.YANDEX_API_URL_END_POINT_FACT
import com.shaparapatah.lesson2_hm_2.utils.YANDEX_API_URL_END_POINT_IMG
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface WeatherAPI {

    @GET(YANDEX_API_URL_END_POINT)
    fun getWeather(
        @Header(YANDEX_API_KEY_NAME) apikey: String,
        @Query("lat") lat: Double,
        @Query("lon") lon: Double
    ): Call<WeatherDTO>

    @GET(YANDEX_API_URL_END_POINT_IMG)
    fun getImages(): Call<FactDTO>

    @GET(YANDEX_API_URL_END_POINT_FACT)
    fun getFact(): Call<FactDTO>
}