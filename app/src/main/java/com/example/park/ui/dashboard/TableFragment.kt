package com.example.park.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.ListFragment
import com.example.park.R
import com.example.park.databinding.FragmentTableBinding


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

        val data = arrayOf("one", "two", "three", "four")
        var lv:ListView = root.findViewById(android.R.id.list)
        val adapter = ArrayAdapter(root.context, R.layout.listitem, R.id.textview, data)
        lv.adapter = adapter


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}