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
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onStart


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
        Global.root1=root

                    var lv: ListView = root.findViewById(android.R.id.list)
                    val txtSum: TextView = root.findViewById(R.id.sum)
                    val adapter = ListAdapter(root.context, R.layout.listitem, Global.data);
                    adapter.notifyDataSetChanged();
                    lv.adapter = adapter
                    txtSum.text = "Сумма: ${Global.sum}"

        if(!Global.st[0]) {
            Thread {
                Log.i("sum1", Global.sum.toString())
                while (true) {
                    activity?.runOnUiThread {
                        Log.i("sum", Global.sum.toString())
                        for (i in 0..18) {
                            if (!Global.id[i] && Global.dohod[i] != 0.toLong()) {
                                var lv: ListView = Global.root1!!.findViewById(android.R.id.list)
                                val txtSum: TextView = Global.root1!!.findViewById(R.id.sum)
                                val adapter = ListAdapter( Global.root1!!.context, R.layout.listitem, Global.data)
                                lv.adapter = adapter
                                Log.i("sum", Global.sum.toString())


                                adapter.notifyDataSetChanged();

                                Global.sum += Global.dohod[i]
                                Global.dohod[i] = 0
                                Global.id[i] = true
                            }
                        }
                        txtSum.text = "Сумма: ${Global.sum}"

                    }
                    Thread.sleep(100)
                }
            }.start()
            Global.st[0]=true
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}