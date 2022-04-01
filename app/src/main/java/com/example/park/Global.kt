package com.example.park

import android.app.Application
import android.widget.ArrayAdapter




class Global : Application() {
    companion object {
        @JvmField
        var free: Array<Boolean> = arrayOf(true, true,true, true,true, true,true, true,true, true,true, true,true, true,true, true)
        var rabPlace: Array<Boolean> = arrayOf(true, true,true, true,true, true,true, true,true, true,true, true,true, true,true, true)
        var rab1: Boolean = true
        var rab2: Boolean = false
        var time: Array<Long> = arrayOf(0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0)
        var dohod: Array<Long> = arrayOf(0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0, 0, 0, 0)
        var id:Array<Boolean> = arrayOf(true, true,true, true,true, true,true, true,true, true,true, true,true, true,true, true, true, true, true)
        var sum: Long = 0
        var data:MutableList<String> = mutableListOf()
        var st: Array<Boolean> = arrayOf(false, false)
//        val adapter:ArrayAdapter<String>=null

    }
}