package com.example.android2dop3.ui.fragments

import android.os.Bundle
import android.preference.PreferenceManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android2dop3.R
import com.example.android2dop3.databinding.FragmentRegistrationBinding
import com.example.android2dop3.ui.utils.PreferencesHelper

class RegistrationFragment : Fragment() {

    private lateinit var binding: FragmentRegistrationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListener()
    }

    private fun setupListener() = with(binding) {
        btnCode.setOnClickListener {

            PreferencesHelper.saveText = edPass.text.toString().trim()
            PreferencesHelper.saveText2 = edName.text.toString().trim()

            if (edName.length() < 5) {
                edName.error = "Мало символов"
            }else if (edPass.length() < 8) {
                edPass.error = "Мало символов"
            } else {
                findNavController().navigate(R.id.action_registrationFragment_to_finalFragment)
            }
        }
    }

    private fun initialize() = with(binding) {
        PreferencesHelper.unit(requireContext())

    }
}


