package com.example.newappflowe

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.newappflowe.databinding.FragmentResultSingleFlowerBinding

class ResultSingleFlowerFragment : Fragment(R.layout.fragment_result_single_flower) {
    private var binding: FragmentResultSingleFlowerBinding? = null
    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentResultSingleFlowerBinding.bind(view)
        var flowerId = arguments?.getInt(ARG_ID_FLOWER)
        var allFlowers = RepositoryFlower.getAllFlowers()
        var currectFlower = allFlowers.firstOrNull{flower -> flower.id == flowerId}

        binding?.run{
            tvNameFlower.text = "Name: ${currectFlower?.name} | Id - ${currectFlower?.id}"
            Glide
                .with(resultFragment)
                .load(currectFlower?.url)
                .into(flowerImageSingle)

            ttvDescr.text = currectFlower?.country
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    companion object{
        private const val ARG_ID_FLOWER = "ARG_ID_FLOWER"

        fun createBundle(id: Int) : Bundle{
            var bundle = Bundle()
            bundle.putInt(ARG_ID_FLOWER,id)
            return bundle
        }
    }
}