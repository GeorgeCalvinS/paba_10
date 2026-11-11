package com.example.paba_10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class fSatu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_f_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val _btnOpenFSatu = view.findViewById<Button>(R.id.btnOpenFSatu)

        _btnOpenFSatu.setOnClickListener {
            val fragmentDua = fDua()
            val dataKirim = Bundle().apply {
                putString("Nama", "Andi")
                putString("Alamat", "Siwalankerto")
            }
            fragmentDua.arguments = dataKirim

            val fragmentManager = parentFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, fragmentDua)
            fragmentTransaction.commit()
        }
    }
}
