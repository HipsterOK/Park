package com.example.park.ui.dashboard

//import android.widget.ArrayAdapter
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.ListFragment
import com.example.park.Global
import com.example.park.ListAdapter
import com.example.park.R
import com.example.park.databinding.FragmentTableBinding


class TableFragment : ListFragment() {

    private var _binding: FragmentTableBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    @Synchronized
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


                    Global.data = mutableListOf(
                        Global.dohod.toString()
                    )
                    var lv: ListView = root.findViewById(android.R.id.list)
                    val txtSum: TextView = root.findViewById(R.id.sum)
                    val adapter = ListAdapter(root.context, R.layout.listitem, Global.data);

                    lv.adapter = adapter

                Thread {
            while (true) {
                    activity?.runOnUiThread {
                        if (Global.dohod != 0.toLong()) {
//                            Global.data= mutableListOf(Global.dohod.toString())

                            Global.data.addAll(listOf(Global.dohod.toString()))
//                            adapter.addAll(Global.data)
//                            adapter.clear()
                            val adapter = ListAdapter(root.context, R.layout.listitem, Global.data);

                            lv.adapter = adapter

                            adapter.notifyDataSetChanged();


//                            adapter.notifyDataSetChanged()
//                            lv.invalidate()
                            Global.dohod=0
                        }
                        txtSum.text = "Сумма: ${Global.sum}"

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