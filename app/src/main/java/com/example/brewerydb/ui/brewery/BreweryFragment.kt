package com.example.brewerydb.ui.brewery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.brewerydb.R
import com.example.brewerydb.data.model.BreweryItem
import com.example.brewerydb.databinding.FragmentBreweryBinding
import com.example.brewerydb.ui.breweryDetail.BreweryDetailViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BreweryFragment : Fragment() {

    private var _binding: FragmentBreweryBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: BreweryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel= ViewModelProvider(this)[BreweryViewModel::class.java]

        _binding = FragmentBreweryBinding.inflate(inflater, container, false)

        val brewerySharedModel : BreweryDetailViewModel by activityViewModels()

        viewModel.brewery.observe(viewLifecycleOwner){
            it?.let{
                setupUI(it, brewerySharedModel)
            }
        }

        viewModel.getBrewery()

        return binding.root
    }

    private fun setupUI(brewery: ArrayList<BreweryItem>, brewerySharedModel: BreweryDetailViewModel){
        val breweryAdapter = BreweryAdapter(brewery as ArrayList<BreweryItem>?)
        binding.rvBrewery.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = breweryAdapter
        }
        breweryAdapter.onItemClick = {
            brewerySharedModel.updateBreweryItem(it)
            findNavController().navigate(
                R.id.action_nav_brewery_to_nav_breweryDetailFragment
            )
        }

    }


}