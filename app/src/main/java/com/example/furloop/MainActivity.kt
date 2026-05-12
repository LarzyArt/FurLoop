package com.example.furloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.furloop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, HomeFragment())
            .commit()

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            val fragment = when (item.itemId) {
                R.id.nav_home      -> HomeFragment()
                R.id.nav_advertise -> AdvertiseFragment()
                R.id.nav_post      -> PostFragment()
                R.id.nav_explore   -> ExploreFragment()
                R.id.nav_profile   -> ProfileFragment()
                else               -> HomeFragment()
            }
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
            true
        }
    }
}