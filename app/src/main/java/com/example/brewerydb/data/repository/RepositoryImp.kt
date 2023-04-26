package com.example.brewerydb.data.repository

import com.example.brewerydb.data.model.BreweryItem
import com.example.brewerydb.data.remote.ApiRequest
import javax.inject.Inject

class RepositoryImp @Inject constructor(
    val apiRequest: ApiRequest
) : Repository{

    override suspend fun getBrewery(): List<BreweryItem> = apiRequest.getBrewery()

}