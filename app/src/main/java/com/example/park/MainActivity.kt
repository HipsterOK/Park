package com.example.park

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.park.databinding.ActivityMainBinding
import com.example.park.ui.home.ParkingFragment
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val PF:ParkingFragment = ParkingFragment()

        val navView: BottomNavigationView = binding.navView

        val timeText: TextView = binding.time

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_parking, R.id.navigation_table
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        Thread {
            var min: Int = 0
            var hour: Int = 0
            var day: Int = 1
        while(true) {

            min++
            if (min >= 60) {
                min = 0
                hour++
            }
            if (hour >= 24) {
                hour = 0
                Global.dohod[16]=-3000
                Global.data.addAll(listOf(Global.dohod[16].toString()))
                Global.id[16]=false
                day++
            }
//            Log.i("timer", min.toString())
            runOnUiThread {
                if(min<10){
                    if(hour<10){
                        timeText.text = "День: $day Время: 0$hour : 0$min"
                    } else{
                        timeText.text = "День: $day Время: $hour : 0$min"
                    }
                } else{
                    if(hour<10){
                        timeText.text = "День: $day Время: 0$hour : $min"
                    }else
                        timeText.text = "День: $day Время: $hour : $min"
                }
            }


//            if(rndm<10) {
//                Log.i("Random", rndm.toString())
//                PF.newAuto()
//            }
            Thread.sleep(100)
        }
        }.start()
    }

}