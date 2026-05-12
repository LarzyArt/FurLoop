package com.example.furloop

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.furloop.databinding.FragmentAdvertiseBinding

class AdvertiseFragment : Fragment() {
    private lateinit var binding: FragmentAdvertiseBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentAdvertiseBinding.inflate(inflater, container, false)
        return binding.root
    }
}