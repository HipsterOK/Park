package com.example.park.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.park.Global
import com.example.park.R
import com.example.park.databinding.FragmentParkingBinding


class ParkingFragment : Fragment() {

    private var _binding: FragmentParkingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentParkingBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val r = root
        for(i in 0..15){
            var f=16

            if(!Global.free[i]) {
                f=i
                Log.i("free", Global.free[i].toString())
            }
            when (f) {
            0 -> {
                val img: ImageView? = r.findViewById(R.id.i1)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            1 -> {
                val img: ImageView? = r.findViewById(R.id.i2)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            2 -> {
                val img: ImageView? = r.findViewById(R.id.i3)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            3 -> {
                val img: ImageView? = r.findViewById(R.id.i4)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            4 -> {
                val img: ImageView? = r.findViewById(R.id.i5)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            5 -> {
                val img: ImageView? = r.findViewById(R.id.i6)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            6 -> {
                val img: ImageView? = r.findViewById(R.id.i7)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            7 -> {
                val img: ImageView? = r.findViewById(R.id.i8)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            8 -> {
                val img: ImageView? = r.findViewById(R.id.i9)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            9 -> {
                val img: ImageView? = r.findViewById(R.id.i10)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            10 -> {
                val img: ImageView? = r.findViewById(R.id.i11)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            11 -> {
                val img: ImageView? = r.findViewById(R.id.i12)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            12 -> {
                val img: ImageView? = r.findViewById(R.id.i13)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            13 -> {
                val img: ImageView? = r.findViewById(R.id.i14)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            14 -> {
                val img: ImageView? = r.findViewById(R.id.i15)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
            15 -> {
                val img: ImageView? = r.findViewById(R.id.i16)
                img?.setImageResource(R.drawable.fill_place_24dp)
            }
        }
        }

        var timing:Long=0
        Thread {
            while(true) {
                timing++
                var rndm = (0..100).random()
                if(rndm<10) {
                    Log.i("Random", rndm.toString())
                    newAuto(timing, root)
                }
                if(rndm in 11..19) {
                    outAuto(timing, root)
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



    fun newAuto(t:Long, r:View){
        for(i in 0..15){
            if(Global.free[i] && Global.rab1[i]){
                when (i) {
                    0 -> {val img: ImageView? = r.findViewById(R.id.i1)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    1 -> {val img: ImageView? = r.findViewById(R.id.i2)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    2 -> {val img: ImageView? = r.findViewById(R.id.i3)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    3 -> {val img: ImageView? = r.findViewById(R.id.i4)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    4 -> {val img: ImageView? = r.findViewById(R.id.i5)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    5 -> {val img: ImageView? = r.findViewById(R.id.i6)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    6 -> {val img: ImageView? = r.findViewById(R.id.i7)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    7 -> {val img: ImageView? = r.findViewById(R.id.i8)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    8 -> {val img: ImageView? = r.findViewById(R.id.i9)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    9 -> {val img: ImageView? = r.findViewById(R.id.i10)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    10 -> {val img: ImageView? = r.findViewById(R.id.i11)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    11 -> {val img: ImageView? = r.findViewById(R.id.i12)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    12 -> {val img: ImageView? = r.findViewById(R.id.i13)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    13 -> {val img: ImageView? = r.findViewById(R.id.i14)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    14 -> {val img: ImageView? = r.findViewById(R.id.i15)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    15 -> {val img: ImageView? = r.findViewById(R.id.i16)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                }
                Global.free[i]=false
                Global.time[i]=t
                Log.i("Move", "in")
                break
            }
        }
    }

    fun outAuto(t:Long, r: View){
        for(i in 0..15){
            if(!Global.free[i] && Global.rab2[i]){
                when (i) {
                    0 -> {val img: ImageView? = r.findViewById(R.id.i1)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    1 -> {val img: ImageView? = r.findViewById(R.id.i2)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    2 -> {val img: ImageView? = r.findViewById(R.id.i3)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    3 -> {val img: ImageView? = r.findViewById(R.id.i4)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    4 -> {val img: ImageView? = r.findViewById(R.id.i5)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    5 -> {val img: ImageView? = r.findViewById(R.id.i6)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    6 -> {val img: ImageView? = r.findViewById(R.id.i7)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    7 -> {val img: ImageView? = r.findViewById(R.id.i8)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    8 -> {val img: ImageView? = r.findViewById(R.id.i9)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    9 -> {val img: ImageView? = r.findViewById(R.id.i10)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    10 -> {val img: ImageView? = r.findViewById(R.id.i11)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    11 -> {val img: ImageView? = r.findViewById(R.id.i12)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    12 -> {val img: ImageView? = r.findViewById(R.id.i13)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    13 -> {val img: ImageView? = r.findViewById(R.id.i14)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    14 -> {val img: ImageView? = r.findViewById(R.id.i15)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    15 -> {val img: ImageView? = r.findViewById(R.id.i16)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                }
                Global.free[i]=true
                Global.time[i]=t-Global.time[i]
                Log.i("Move", "out")
                break
            }
        }
    }
}