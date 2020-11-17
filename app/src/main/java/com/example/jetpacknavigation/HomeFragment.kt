package com.example.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.jetpacknavigation.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*
import kotlin.concurrent.fixedRateTimer

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false).apply {
            /* ngebug kalau ada ini
            showFragment(HomeFragment())
            bottomNavigation.setOnNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.nav_home -> {
                        showFragment(HomeFragment())
                        return@setOnNavigationItemSelectedListener true
                    }
                    R.id.nav_list -> {
                        showFragment(ListFragment())
                        return@setOnNavigationItemSelectedListener true
                    }
                    R.id.nav_profile -> {
                        showFragment(ProfileFragment())
                        return@setOnNavigationItemSelectedListener true
                    }
                }
                false
            }
            */
        }
        return binding.root
    }

    private fun showFragment(fragment: Fragment) {
        childFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
    }
}

