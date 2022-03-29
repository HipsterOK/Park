package com.example.park.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.ListFragment
import com.example.park.Global
import com.example.park.R
import com.example.park.databinding.FragmentTableBinding
import android.util.Log
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.park.databinding.ActivityMainBinding
import com.example.park.ui.home.ParkingFragment
import kotlinx.coroutines.delay


class TableFragment : ListFragment() {

    private var _binding: FragmentTableBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentTableBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        UiThreadStatement.runOnUiThread(Runnable {  val data: MutableList<String> = mutableListOf(Global.dohod.toString(), Global.yhod.toString(), Global.sum.toString())
//                var lv: ListView = root.findViewById(android.R.id.list)
//                val adapter = ArrayAdapter(root.context, R.layout.listitem, R.id.textview, data)
//                lv.adapter = adapter
//                adapter.notifyDataSetChanged()
//                Thread.sleep(100) })


                    var data: MutableList<String> = mutableListOf(
                        Global.dohod.toString(),
                        Global.yhod.toString(),
                        Global.sum.toString()
                    )
                    var lv: ListView = root.findViewById(android.R.id.list)
                    val adapter = ArrayAdapter(root.context, R.layout.listitem, R.id.textview, data)
                    lv.adapter = adapter

                Thread {
            while (true) {
                    data = mutableListOf(
                        Global.dohod.toString(),
                        Global.yhod.toString(),
                        Global.sum.toString()
                    )
                activity?.runOnUiThread {
                    adapter.clear()
                    adapter.addAll(data)
                    adapter.notifyDataSetChanged()
                    lv.invalidate()
                }
                Thread.sleep(100)
            }
        }.start()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}