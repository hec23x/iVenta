package com.losbros.iventa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.losbros.iventa.databinding.ActivityMainBinding
import com.losbros.iventa.fragments.BuscarFragment
import com.losbros.iventa.fragments.CuentasFragment
import com.losbros.iventa.fragments.HomeFragment



class MainActivity : AppCompatActivity() {

    //variable global para binding (view)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        //Splash Screen
        Thread.sleep(2000)
        setTheme(R.style.Theme_IVenta)

        super.onCreate(savedInstanceState)
        // binding reemplaza a R.layout.activity_main.
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val homeFragment    = HomeFragment()
        val cuentasFragment = CuentasFragment()
        val buscarFragment  = BuscarFragment()

        setFragmentView(homeFragment)

        //listener de bottomNav
        binding.bottomNavigation.setOnNavigationItemSelectedListener {

            when(it.itemId){
                R.id.ic_home    -> setFragmentView(homeFragment)
                R.id.ic_cuentas -> setFragmentView(cuentasFragment)
                R.id.ic_buscar  -> setFragmentView(buscarFragment)

            }
            true

        }
    }

    private fun setFragmentView(fragment : Fragment = HomeFragment() ){

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_general_container,fragment)
            commit()
        }

    }

}