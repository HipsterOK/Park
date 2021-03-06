package com.example.park.ui.home

import android.app.Application
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.park.Global
import com.example.park.MainActivity
import com.example.park.R
import com.example.park.databinding.FragmentParkingBinding
import java.util.concurrent.TimeUnit


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
        Global.root2=root
        Global.thisCnt=context
        val r = root
        for(i in 0..15){
            var f=16
            var f1=16

            if(!Global.free[i]) {
                f=i
//                Log.i("free", Global.free[i].toString())
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

            if(!Global.rabPlace[i]) {
                f1=i
//                Log.i("free", Global.free[i].toString())
            }
            when (f1) {
                0 -> {
                    val img: ImageView? = r.findViewById(R.id.i1)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                1 -> {
                    val img: ImageView? = r.findViewById(R.id.i2)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                2 -> {
                    val img: ImageView? = r.findViewById(R.id.i3)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                3 -> {
                    val img: ImageView? = r.findViewById(R.id.i4)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                4 -> {
                    val img: ImageView? = r.findViewById(R.id.i5)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                5 -> {
                    val img: ImageView? = r.findViewById(R.id.i6)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                6 -> {
                    val img: ImageView? = r.findViewById(R.id.i7)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                7 -> {
                    val img: ImageView? = r.findViewById(R.id.i8)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                8 -> {
                    val img: ImageView? = r.findViewById(R.id.i9)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                9 -> {
                    val img: ImageView? = r.findViewById(R.id.i10)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                10 -> {
                    val img: ImageView? = r.findViewById(R.id.i11)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                11 -> {
                    val img: ImageView? = r.findViewById(R.id.i12)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                12 -> {
                    val img: ImageView? = r.findViewById(R.id.i13)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                13 -> {
                    val img: ImageView? = r.findViewById(R.id.i14)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                14 -> {
                    val img: ImageView? = r.findViewById(R.id.i15)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                15 -> {
                    val img: ImageView? = r.findViewById(R.id.i16)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
            }
        }
        if(!Global.rab1) {
                val img: ImageView? = r.findViewById(R.id.`in`)
                img?.setImageResource(R.drawable.broken_place_24dp)
        }

        if(!Global.rab2) {
            val img: ImageView? = r.findViewById(R.id.out)
            img?.setImageResource(R.drawable.broken_place_24dp)
        }


        val repBar1: View = r.findViewById(R.id.repBar1)
        repBar1.setOnClickListener {
            if(!Global.rab1) {
                Global.rab1 = true
                val img: ImageView? = r.findViewById(R.id.`in`)
                img?.setImageResource(R.drawable.free_place_24dp)
                Global.dohod[17]=-5000
                Global.data.addAll(listOf(Global.dohod[17].toString()))
                val toast = Toast.makeText(context, "???????????????? ???1 ????????????????????????????!", Toast.LENGTH_SHORT)
                toast.show()
            } else {
                val toast = Toast.makeText(context, "???????????????? ???1 ???? ?????????????????? ?? ??????????????!", Toast.LENGTH_SHORT)
                toast.show()
            }
        }

        val repBar2: View = r.findViewById(R.id.repBar2)
        repBar2.setOnClickListener {
            if(!Global.rab2) {
                Global.rab2 = true
                val img: ImageView? = r.findViewById(R.id.`out`)
                img?.setImageResource(R.drawable.free_place_24dp)
                Global.dohod[17]=-5000
                Global.data.addAll(listOf(Global.dohod[17].toString()))
                Global.id[17]=false
                val toast = Toast.makeText(context, "???????????????? ???2 ????????????????????????????!", Toast.LENGTH_SHORT)
                toast.show()
            } else {
                val toast = Toast.makeText(context, "???????????????? ???2 ???? ?????????????????? ?? ??????????????!", Toast.LENGTH_SHORT)
                toast.show()
            }
        }

        val repPlace: View = r.findViewById(R.id.repPlace)
        repPlace.setOnClickListener {
            for(i in 0..15) {
                if(!Global.rabPlace[i]) {
                    Global.rabPlace[i] = true
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
                    Global.dohod[18]=-2500
                    Global.data.addAll(listOf(Global.dohod[18].toString()))
                    Global.id[18]=false
                    val toast = Toast.makeText(context, "?????????????????????? ?????????? ???${i+1} ??????????????????????????????!", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }

        if(!Global.st[1]) {
            var timing:Long=0
            Thread {
                while (true) {
                    timing++
                    Log.i("timing", timing.toString())
                    var rndm = (0..500).random()
                    Log.i("Random", rndm.toString())
                    if (rndm < 15) {
                        newAuto(timing, Global.root2!!)
                    }
                    if (rndm in 16..20) {
                        outAuto(timing, Global.root2!!)
                    }

                    if (rndm == 21) {
                        brokeBar1(Global.root2!!)
                    }

                    if (rndm == 24) {
                        brokeBar2(Global.root2!!)
                    }
                    if (rndm in 27..29) {
                        brokePlace(Global.root2!!)
                    }

                    for(i in 0..15){
                        var f=16
                        var f1=16

                        if(!Global.free[i]) {
                            f=i
//                Log.i("free", Global.free[i].toString())
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

                        if(!Global.rabPlace[i]) {
                            f1=i
//                Log.i("free", Global.free[i].toString())
                        }
                        when (f1) {
                            0 -> {
                                val img: ImageView? = r.findViewById(R.id.i1)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            1 -> {
                                val img: ImageView? = r.findViewById(R.id.i2)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            2 -> {
                                val img: ImageView? = r.findViewById(R.id.i3)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            3 -> {
                                val img: ImageView? = r.findViewById(R.id.i4)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            4 -> {
                                val img: ImageView? = r.findViewById(R.id.i5)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            5 -> {
                                val img: ImageView? = r.findViewById(R.id.i6)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            6 -> {
                                val img: ImageView? = r.findViewById(R.id.i7)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            7 -> {
                                val img: ImageView? = r.findViewById(R.id.i8)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            8 -> {
                                val img: ImageView? = r.findViewById(R.id.i9)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            9 -> {
                                val img: ImageView? = r.findViewById(R.id.i10)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            10 -> {
                                val img: ImageView? = r.findViewById(R.id.i11)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            11 -> {
                                val img: ImageView? = r.findViewById(R.id.i12)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            12 -> {
                                val img: ImageView? = r.findViewById(R.id.i13)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            13 -> {
                                val img: ImageView? = r.findViewById(R.id.i14)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            14 -> {
                                val img: ImageView? = r.findViewById(R.id.i15)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                            15 -> {
                                val img: ImageView? = r.findViewById(R.id.i16)
                                img?.setImageResource(R.drawable.broken_place_24dp)
                            }
                        }
                    }
                    if(!Global.rab1) {
                        val img: ImageView? = r.findViewById(R.id.`in`)
                        img?.setImageResource(R.drawable.broken_place_24dp)
                    }

                    if(!Global.rab2) {
                        val img: ImageView? = r.findViewById(R.id.out)
                        img?.setImageResource(R.drawable.broken_place_24dp)
                    }

                    Thread.sleep(100)
                }
            }.start()
            Global.st[1]=true
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    fun newAuto(t:Long, r:View){
        for(i in 0..15){
            Log.i("GID", Global.id[i].toString())
            if(Global.free[i] && Global.rab1 && Global.id[i] && Global.rabPlace[i]){
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
//                Global.dohod[i]=0
                Log.i("Move", "in")
                break
            }
        }
    }

    fun outAuto(t:Long, r: View){
        for(i in 0..15){
            if(!Global.free[i] && Global.rab2 && Global.id[i]){
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
                Global.id[i]=false
                Global.dohod[i]=(t-Global.time[i])*100
                Global.data.addAll(listOf(Global.dohod[i].toString()))
                Log.i("Move", "out")
//                Global.id[i] = true
                break
            }
        }
    }

    fun brokeBar1(r: View) {
        if (Global.rab1) {
            Global.rab1 = false
            val img: ImageView? = r.findViewById(R.id.`in`)
            img?.setImageResource(R.drawable.broken_place_24dp)
//            val toast = Toast.makeText(Global.thisCnt, "?????????????? ?????????????????? ???1!", Toast.LENGTH_SHORT)
//            toast.show()
        }
    }

    fun brokeBar2(r: View) {
            if (Global.rab2) {
                Global.rab2 = false
                val img: ImageView? = r.findViewById(R.id.out)
                img?.setImageResource(R.drawable.broken_place_24dp)
//                val toast = Toast.makeText(Global.thisCnt, "?????????????? ?????????????????? ???2!", Toast.LENGTH_SHORT)
//                toast.show()
            }
        }

    fun brokePlace(r: View) {
        var id:Int = (0..15).random()
        if (Global.rabPlace[id] && Global.free[id]) {
            Global.rabPlace[id] = false
            when (id) {
                0 -> {val img: ImageView? = r.findViewById(R.id.i1)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                1 -> {val img: ImageView? = r.findViewById(R.id.i2)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                2 -> {val img: ImageView? = r.findViewById(R.id.i3)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                3 -> {val img: ImageView? = r.findViewById(R.id.i4)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                4 -> {val img: ImageView? = r.findViewById(R.id.i5)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                5 -> {val img: ImageView? = r.findViewById(R.id.i6)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                6 -> {val img: ImageView? = r.findViewById(R.id.i7)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                7 -> {val img: ImageView? = r.findViewById(R.id.i8)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                8 -> {val img: ImageView? = r.findViewById(R.id.i9)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                9 -> {val img: ImageView? = r.findViewById(R.id.i10)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                10 -> {val img: ImageView? = r.findViewById(R.id.i11)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                11 -> {val img: ImageView? = r.findViewById(R.id.i12)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                12 -> {val img: ImageView? = r.findViewById(R.id.i13)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                13 -> {val img: ImageView? = r.findViewById(R.id.i14)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                14 -> {val img: ImageView? = r.findViewById(R.id.i15)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
                15 -> {val img: ImageView? = r.findViewById(R.id.i16)
                    img?.setImageResource(R.drawable.broken_place_24dp)
                }
            }
            Log.i("Thr Broke3", "place$id broken")
        }
    }
}