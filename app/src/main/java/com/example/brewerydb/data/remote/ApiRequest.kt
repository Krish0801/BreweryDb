package com.example.brewerydb.data.remote

import com.example.brewerydb.data.model.BreweryItem
import retrofit2.http.GET

interface ApiRequest {

    @GET(ApiDetails.END_POINT)
    suspend fun getBrewery() : ArrayList<BreweryItem>
}