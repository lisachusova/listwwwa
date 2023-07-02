package com.example.newappflowe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.Glide.*
import com.example.newappflowe.databinding.FragmentMainFlowerBinding

class MainFlowerFragment : Fragment(R.layout.fragment_main_flower) {

    private var binding: FragmentMainFlowerBinding? = null
    private var adapter: FlowerAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainFlowerBinding.bind(view)
        initAdapter()
    }

    private fun initAdapter(){
        adapter = FlowerAdapter(
            list = RepositoryFlower.list,
            glide = with(this),
            onItemClick = {flower ->
                findNavController().navigate(
                    R.id.action_mainFlowerFragment_to_resultSingleFlowerFragment,
                    ResultSingleFlowerFragment.createBundle(flower.id)
                )
            }
        )
        binding?.rvFlowers?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}