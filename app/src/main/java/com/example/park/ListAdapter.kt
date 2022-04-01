package com.example.park

import android.content.Context
import android.database.DataSetObserver
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class ListAdapter(var mCtx: Context, var resource:Int, var items:List<String>)
    : ArrayAdapter<String>( mCtx , resource , items ){
    lateinit var itm:List<String>

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)

            val view: View = layoutInflater.inflate(resource, null)
            var textView: TextView = view.findViewById(R.id.textview)
            itm = items

            if (itm[position].toInt() > 0) {
                textView.text = "Оплата парковки: ${itm[position]} руб."
                textView.setTextColor(Color.GREEN)
            }
        if (itm[position].toInt() < 0) {
            textView.text = "Минус: ${itm[position]} руб."
            textView.setTextColor(Color.RED)
        }
                if (itm[position].toInt() == -3000) {
                    textView.text = "Аренда: ${itm[position]} руб."
                    textView.setTextColor(Color.RED)
                }
                if (itm[position].toInt() == -2500) {
                    textView.text = "Ремонт парковочного места: ${itm[position]} руб."
                    textView.setTextColor(Color.RED)
                }
                if (itm[position].toInt() == -5000) {
                    textView.text = "Ремонт шлагбаума: ${itm[position]} руб."
                    textView.setTextColor(Color.RED)
                }

            return view
    }

    fun updateList(newlist: List<String>?) {
//        clear()
        this.itm = newlist!!
        addAll(itm)
        notifyDataSetChanged()
    }

    override fun registerDataSetObserver(observer: DataSetObserver?) {
        super.registerDataSetObserver(observer)
    }

    override fun unregisterDataSetObserver(observer: DataSetObserver?) {
        super.unregisterDataSetObserver(observer)
    }
}
