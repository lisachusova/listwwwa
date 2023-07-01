package com.example.newappl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.newappl.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {
    private var binding: FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        binding?.run{
            btnToPriority.setOnClickListener{
                findNavController().navigate(
                    R.id.action_mainFragment_to_priorityFragment,
                    PriorityFragment.getBundle("MainFragment")
                )
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}