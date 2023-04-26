package com.example.brewerydb.ui.brewery

import FakeRepository
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class BreweryViewModelTest {

    private val testDispatcher = StandardTestDispatcher()
    private lateinit var viewModel: BreweryViewModel
    private lateinit var fakeRepository: FakeRepository

    @Before
    fun setup() {
        Dispatchers.setMain(testDispatcher)
        fakeRepository = FakeRepository()
        viewModel = BreweryViewModel(fakeRepository)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun testGetBrewery() = runTest {
        //Given
        viewModel.getBrewery()
        val result = viewModel.brewery.value
        assertEquals(null, result?.size)
    }

}

