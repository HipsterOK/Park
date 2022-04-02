package com.example.park

import android.app.Activity
import android.app.Application
import android.content.Context
import android.view.View
import android.widget.ArrayAdapter




class Global : Application() {
    companion object {
        @JvmField
        var free: Array<Boolean> = arrayOf(true, true,true, true,true, true,true, true,true, true,true, true,true, true,true, true)
        var rabPlace: Array<Boolean> = arrayOf(true, true,true, true,true, true,true, true,true, true,true, true,true, true,true, true)
        var rab1: Boolean = true
        var rab2: Boolean = true
        var time: Array<Long> = arrayOf(0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0)
        var dohod: Array<Long> = arrayOf(0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0, 0, 0, 0)
        var id:Array<Boolean> = arrayOf(true, true,true, true,true, true,true, true,true, true,true, true,true, true,true, true, true, true, true)
        var sum: Long = 0
        var data:MutableList<String> = mutableListOf()
        var st: Array<Boolean> = arrayOf(false, false)
        var root1: View? = null
        var root2: View? = null
        var act: Activity? = null
        var thisCnt: Context? = null
//        val adapter:ArrayAdapter<String>=null

    }
}