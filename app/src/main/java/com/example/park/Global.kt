package com.example.park

import android.app.Application
import android.widget.ArrayAdapter




class Global : Application() {
    companion object {
        @JvmField
        var free: Array<Boolean> = arrayOf(true, true,true, true,true, true,true, true,true, true,true, true,true, true,true, true)
        var rab1: Array<Boolean> = arrayOf(true, true,true, true,true, true,true, true,true, true,true, true,true, true,true, true)
        var rab2: Array<Boolean> = arrayOf(true, true,true, true,true, true,true, true,true, true,true, true,true, true,true, true)
        var time: Array<Long> = arrayOf(0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0)
        var listItems = ArrayList<String>()
        var adapter: ArrayAdapter<String>? = null

    }
}