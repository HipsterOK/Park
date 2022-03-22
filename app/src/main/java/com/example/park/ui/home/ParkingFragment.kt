package com.example.park.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.park.R
import com.example.park.databinding.FragmentParkingBinding


class ParkingFragment : Fragment() {

    private var _binding: FragmentParkingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    var free: Array<Boolean> = arrayOf(true, true,true, true,true, true,true, true,true, true,true, true,true, true,true, true)
    var rab1: Array<Boolean> = arrayOf(true, true,true, true,true, true,true, true,true, true,true, true,true, true,true, true)
    var rab2: Array<Boolean> = arrayOf(true, true,true, true,true, true,true, true,true, true,true, true,true, true,true, true)
    var time: Array<Long> = arrayOf(0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0)


//    private var imgI: MutableList<ImageView>? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(ParkingViewModel::class.java)


        _binding = FragmentParkingBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        imgI?.add(0, binding.root.findViewById(R.id.i1))
//        imgI?.set(1, binding.root.findViewById(R.id.i2))
//        imgI?.set(2, binding.root.findViewById(R.id.i3))
//        imgI?.set(3, binding.root.findViewById(R.id.i4))
//        imgI?.set(4, binding.root.findViewById(R.id.i5))
//        imgI?.set(5, binding.root.findViewById(R.id.i6))
//        imgI?.set(6, binding.root.findViewById(R.id.i7))
//        imgI?.set(7, binding.root.findViewById(R.id.i8))
//        imgI?.set(8, binding.root.findViewById(R.id.i9))
//        imgI?.set(9, binding.root.findViewById(R.id.i10))
//        imgI?.set(10, binding.root.findViewById(R.id.i11))
//        imgI?.set(11, binding.root.findViewById(R.id.i12))
//        imgI?.set(12, binding.root.findViewById(R.id.i13))
//        imgI?.set(13, binding.root.findViewById(R.id.i14))
//        imgI?.set(14, binding.root.findViewById(R.id.i15))
//        imgI?.set(15, binding.root.findViewById(R.id.i16))

//        newAuto()
        var timing:Long=0
        Thread {
            while(true) {
                timing++
                var rndm = (0..100).random()
                if(rndm<10) {
                    Log.i("Random", rndm.toString())
                    newAuto(timing)
                }
                if(rndm>10 && rndm<20) {
                    outAuto(timing)
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



    fun newAuto(t:Long){
        for(i in 0..15){
            if(free[i] && rab1[i]){
                when (i) {
                    0 -> {val img: ImageView? = binding.root.findViewById(R.id.i1)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    1 -> {val img: ImageView? = binding.root.findViewById(R.id.i2)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    2 -> {val img: ImageView? = binding.root.findViewById(R.id.i3)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    3 -> {val img: ImageView? = binding.root.findViewById(R.id.i4)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    4 -> {val img: ImageView? = binding.root.findViewById(R.id.i5)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    5 -> {val img: ImageView? = binding.root.findViewById(R.id.i6)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    6 -> {val img: ImageView? = binding.root.findViewById(R.id.i7)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    7 -> {val img: ImageView? = binding.root.findViewById(R.id.i8)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    8 -> {val img: ImageView? = binding.root.findViewById(R.id.i9)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    9 -> {val img: ImageView? = binding.root.findViewById(R.id.i10)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    10 -> {val img: ImageView? = binding.root.findViewById(R.id.i11)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    11 -> {val img: ImageView? = binding.root.findViewById(R.id.i12)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    12 -> {val img: ImageView? = binding.root.findViewById(R.id.i13)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    13 -> {val img: ImageView? = binding.root.findViewById(R.id.i14)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    14 -> {val img: ImageView? = binding.root.findViewById(R.id.i15)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                    15 -> {val img: ImageView? = binding.root.findViewById(R.id.i16)
                        img?.setImageResource(R.drawable.fill_place_24dp)
                    }
                }
                free[i]=false
                time[i]=t
                break
            }
        }
    }

    fun outAuto(t:Long){
        for(i in 0..15){
            if(!free[i] && rab1[i]){
                when (i) {
                    0 -> {val img: ImageView? = binding.root.findViewById(R.id.i1)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    1 -> {val img: ImageView? = binding.root.findViewById(R.id.i2)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    2 -> {val img: ImageView? = binding.root.findViewById(R.id.i3)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    3 -> {val img: ImageView? = binding.root.findViewById(R.id.i4)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    4 -> {val img: ImageView? = binding.root.findViewById(R.id.i5)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    5 -> {val img: ImageView? = binding.root.findViewById(R.id.i6)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    6 -> {val img: ImageView? = binding.root.findViewById(R.id.i7)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    7 -> {val img: ImageView? = binding.root.findViewById(R.id.i8)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    8 -> {val img: ImageView? = binding.root.findViewById(R.id.i9)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    9 -> {val img: ImageView? = binding.root.findViewById(R.id.i10)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    10 -> {val img: ImageView? = binding.root.findViewById(R.id.i11)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    11 -> {val img: ImageView? = binding.root.findViewById(R.id.i12)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    12 -> {val img: ImageView? = binding.root.findViewById(R.id.i13)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    13 -> {val img: ImageView? = binding.root.findViewById(R.id.i14)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    14 -> {val img: ImageView? = binding.root.findViewById(R.id.i15)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                    15 -> {val img: ImageView? = binding.root.findViewById(R.id.i16)
                        img?.setImageResource(R.drawable.free_place_24dp)
                    }
                }
                free[i]=true
                time[i]=t-time[i]
                break
            }
        }
    }
}