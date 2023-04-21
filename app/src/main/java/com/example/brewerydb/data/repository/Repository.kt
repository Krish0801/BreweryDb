package com.example.brewerydb.data.repository

import com.example.brewerydb.data.model.BreweryItem

interface Repository {

    suspend fun getBrewery() : ArrayList<BreweryItem>
}