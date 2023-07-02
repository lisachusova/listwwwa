package com.example.newappflowe

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.newappflowe.databinding.ItemFlowerBinding

class FlowerAdapter(
    private var list: List<Flower>,
    private val glide: RequestManager,
    private val onItemClick: (Flower) -> Unit
) : RecyclerView.Adapter<FlowerItem>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): FlowerItem = FlowerItem(
            ItemFlowerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            glide,
            onItemClick
        )

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: FlowerItem, position: Int) {
        holder.onBind(list[position])
    }
}
