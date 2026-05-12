package com.example.furloop

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.furloop.databinding.FragmentExploreBinding

class ExploreFragment : Fragment() {
    private lateinit var binding: FragmentExploreBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentExploreBinding.inflate(inflater, container, false)
        return binding.root
    }
}