package com.example.brewerydb.data.model

data class BreweryItem(
    val address_1: String,
    val address_2: String,
    val address_3: Any?,
    val brewery_type: String,
    val city: String,
    val country: String,
    val id: String?,
    val latitude: String,
    val longitude: String,
    val name: String,
    val phone: String,
    val postal_code: String,
    val state: String,
    val state_province: String,
    val street: String,
    val website_url: String
)
{
    override fun hashCode(): Int {
        // Return a default hash code if id is null
        return id?.hashCode() ?: super.hashCode()
    }
}