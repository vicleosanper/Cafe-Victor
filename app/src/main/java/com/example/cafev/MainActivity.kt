package com.example.cafev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.Fragment
import com.example.cafev.ui.theme.CafeVTheme
import androidx.fragment.app.FragmentActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ComidaFragment = FoodFragment()
        var PromocionesFragment = PromoFragment()
        var SucursalesFragment = MapFragment()

        // Obtener la referencia del BottomNavigationView
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)

        bottomNavigationView.setOnNavigationItemSelectedListener  {

            when(it.itemId){
                R.id.nav_comida ->{
                    setCurrentFragment(ComidaFragment)
                    true
                }

                R.id.nav_promo ->{
                    setCurrentFragment(PromocionesFragment)
                    true
                }

                R.id.nav_sucursales ->{
                    setCurrentFragment(SucursalesFragment)
                    true
                }

                else -> false

            }



        }

    }

    private fun setCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.containerView,fragment)
            commit()
        }

    }

}

