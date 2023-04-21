package com.example.brewerydb.ui.breweryDetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.brewerydb.data.model.BreweryItem
import com.example.brewerydb.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BreweryDetailViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {
    private val _selectedBreweryItem : MutableLiveData<BreweryItem> = MutableLiveData()

    val selectedBreweryItem: LiveData<BreweryItem> = _selectedBreweryItem

    fun updateBreweryItem(dataModel: BreweryItem) {
        this._selectedBreweryItem.value = dataModel
    }

}