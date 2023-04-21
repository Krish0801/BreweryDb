package com.example.brewerydb.ui.brewery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.brewerydb.R
import com.example.brewerydb.data.model.BreweryItem
import com.example.brewerydb.databinding.ItemBreweryBinding

class BreweryAdapter(val brewery: ArrayList<BreweryItem>?) :
  RecyclerView.Adapter<BreweryAdapter.ViewHolder>() {

      var onItemClick: ((BreweryItem) -> Unit)? = null

    // ITEM/ROW all the settings/UI of individual items

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemBreweryBinding.bind(view)

        fun handleData(item: BreweryItem?){
            binding.breweryId.text = item?.id
            binding.breweryName.text = item?.name
            binding.breweryCity.text = item?.city
        }

    }

    // Creates the ITEM/ROW for the UI
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BreweryAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_brewery, parent, false)

        return ViewHolder(view)
    }

    // Size of the list
    override fun getItemCount(): Int = brewery?.size ?: 0


    // Handle the CURRENT item you are on
    override fun onBindViewHolder(holder: BreweryAdapter.ViewHolder, position: Int) {
        holder.handleData(brewery?.get(position))
        holder.itemView.setOnClickListener {
            brewery?.get(position)?.let {
                onItemClick?.invoke(it)
            }
        }
    }


}