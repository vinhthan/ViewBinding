package com.example.viewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.viewbinding.databinding.FragmentOneBinding

class OneFragment : Fragment() {

    private var _binding: FragmentOneBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_one, container, false)

        _binding = FragmentOneBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.tv2.text = "Fragment"
        binding.btn2.setOnClickListener {
            Toast.makeText(context, "click ", Toast.LENGTH_SHORT).show()
        }


        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}