package com.example.newappflowe

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.example.newappflowe.databinding.ItemFlowerBinding

class FlowerItem(
    private val binding: ItemFlowerBinding,
    private val glide: RequestManager,
    private val onItemClick: (Flower) -> Unit
) : ViewHolder(binding.root) {
    fun onBind(flower: Flower){
        binding.run{
            tvTittle.text = flower.name
            tvDescr.text = flower.country

            glide
                .load(flower.url)
                .placeholder(R.drawable.saae)
                .error(R.drawable.images)
                .into(ivImageFlower)

            root.setOnClickListener{
                onItemClick(flower)
            }
        }
    }
}