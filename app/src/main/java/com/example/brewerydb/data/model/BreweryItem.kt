package com.example.brewerydb.data.model

import com.google.gson.annotations.SerializedName

data class BreweryItem(
    @SerializedName("address_1")
    val address1: String = "",
    @SerializedName("address_2")
    val address2: String? = "",
    @SerializedName("brewery_type")
    val breweryType: String? = "",
    @SerializedName("city")
    val city: String? = "",
    @SerializedName("country")
    val country: String? = "",
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("latitude")
    val latitude: String? = "",
    @SerializedName("longitude")
    val longitude: String? = "",
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("phone")
    val phone: String? = "",
    @SerializedName("postal_code")
    val postalCode: String? = "",
    @SerializedName("state")
    val state: String? = "",
    @SerializedName("state_province")
    val stateProvince: String? = "",
    @SerializedName("street")
    val street: String? = "",
    @SerializedName("website_url")
    val websiteUrl: String? = ""
)

//{
//    override fun hashCode(): Int {
//        // Return a default hash code if id is null
//        return id?.hashCode() ?: super.hashCode()
//    }
//}