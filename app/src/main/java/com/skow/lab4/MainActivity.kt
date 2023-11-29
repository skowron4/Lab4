package com.skow.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.RadioGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setSupportActionBar()

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentCenterContainerView) as NavHostFragment
        val navController = navHostFragment.navController

//        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

//        bottomNavigation.setOnItemSelectedListener { menuItem ->
//            when (menuItem.itemId) {
//                R.id.leftFragment -> navController.navigate(R.id.action_to_left_frag)
//                R.id.centerFragment -> navController.navigate(R.id.action_to_center_frag)
//                R.id.rightFragment -> navController.navigate(R.id.action_to_right_frag)
//            }
//            true
//        }
        val navigationBar: NavigationBarView = findViewById(R.id.bottomNavigationView)
        navigationBar.setupWithNavController(navController)
    }


}