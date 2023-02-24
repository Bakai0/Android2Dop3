package com.example.android2dop3.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android2dop3.R
import com.example.android2dop3.databinding.FragmentFinalBinding
import com.example.android2dop3.ui.utils.PreferencesHelper

class FinalFragment : Fragment() {

    private lateinit var binding: FragmentFinalBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFinalBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()

    }

    private fun initialize() = with(binding){
        PreferencesHelper.unit(requireContext())
        dataName.text = PreferencesHelper.saveText2
        dataPassword.text = PreferencesHelper.saveText

    }

}