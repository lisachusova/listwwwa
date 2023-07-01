package com.example.newappl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newappl.databinding.FragmentPriorityBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.Snackbar.SnackbarLayout

class PriorityFragment : Fragment(R.layout.fragment_priority) {
    private var binding: FragmentPriorityBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPriorityBinding.bind(view)
        val nameClass = arguments?.getString(ARG_NAME_CLASS)
        Snackbar.make(binding?.root!!, nameClass.toString(),Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    companion object{
        private const val ARG_NAME_CLASS = "ARG_NAME_CLASS"
        fun getBundle(nameClass: String) : Bundle{
            val bundle = Bundle()
            bundle.putString(ARG_NAME_CLASS, nameClass)
            return bundle
        }
    }
}