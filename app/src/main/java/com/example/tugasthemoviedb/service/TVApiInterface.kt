package com.example.tugasthemoviedb.service

import com.example.tugasthemoviedb.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=281d3fe3f5911ed4f24e36ce986de054")
    fun getTVList(): Call<MovieResponse>
}