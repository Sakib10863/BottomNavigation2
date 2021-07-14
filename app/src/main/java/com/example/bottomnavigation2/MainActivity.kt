package com.example.bottomnavigation2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigation2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        setupBottomNavigation()

        val appBarConfiguration = AppBarConfiguration(
                setOf(R.id.firstFragment, R.id.secondFragment, R.id.thirdFragment)

        )
        setupActionBarWithNavController(
                navController, appBarConfiguration
        )

    }



    //for bottomNavigation
    private fun setupBottomNavigation() {

        navHostFragment = (supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment)
        navController = navHostFragment.navController

        binding.bottomNavigationView.setupWithNavController(navController)

        binding.bottomNavigationView.setOnItemReselectedListener {

        }


    }

}