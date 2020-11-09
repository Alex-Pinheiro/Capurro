package br.com.babas.capurro.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import br.com.babas.capurro.R

class Teste : Fragment() {


    var navController: NavController? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_teste, container, false)

        navController = Navigation.findNavController(requireActivity(), R.id.fragmentContainerView)

        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val button3 = view?.findViewById<Button>(R.id.button3)
        button3?.setOnClickListener {
            navController?.navigate(R.id.action_teste_to_somatico)
        }
    }


}