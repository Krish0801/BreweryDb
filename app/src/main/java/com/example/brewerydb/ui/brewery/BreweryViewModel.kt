package com.example.brewerydb.ui.brewery

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.brewerydb.data.model.BreweryItem
import com.example.brewerydb.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BreweryViewModel @Inject constructor(
    val repository: Repository
): ViewModel() {

    val brewery = MutableLiveData<ArrayList<BreweryItem>>()

    fun getBrewery() {

        viewModelScope.launch{
            val result = repository.getBrewery()
            brewery.postValue(result)
        }
    }

}