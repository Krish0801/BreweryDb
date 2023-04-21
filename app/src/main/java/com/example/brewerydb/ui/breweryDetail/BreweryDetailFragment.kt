package com.example.brewerydb.ui.breweryDetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.brewerydb.databinding.FragmentBreweryDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BreweryDetailFragment : Fragment() {

    private var _binding: FragmentBreweryDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBreweryDetailBinding.inflate(inflater, container, false)


        val breweryItemSharedModel: BreweryDetailViewModel by activityViewModels()

        breweryItemSharedModel.selectedBreweryItem.observe(viewLifecycleOwner) {
            with(it) {
                binding.breweryName.text = name
                binding.breweryId.text = id
                binding.breweryAddress.text = address_1
                binding.breweryCity.text = city
                binding.breweryState.text = state
                binding.breweryPostcode.text = postal_code
                binding.breweryPhone.text = phone
            }
        }
        return binding.root
    }
}
