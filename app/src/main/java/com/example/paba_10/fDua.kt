package com.example.paba_10
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class fDua : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_f_dua, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val _tvHasil = view.findViewById<TextView>(R.id.tvHasil)
        val _btnOpenFDua = view.findViewById<Button>(R.id.btnOpenFDua)

        var namaDiterima = ""
        var alamatDiterima = ""

        arguments?.let {
            namaDiterima = it.getString("Nama") ?: ""
            alamatDiterima = it.getString("Alamat") ?: ""
        }

        if (namaDiterima != "") {
            _tvHasil.text = "Halo $namaDiterima! Alamat Anda $alamatDiterima"
        }

        _btnOpenFDua.setOnClickListener {
            val fragmentManager = parentFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, fSatu())
            fragmentTransaction.commit()
        }
    }
}