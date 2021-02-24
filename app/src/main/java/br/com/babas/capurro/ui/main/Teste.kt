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
import br.com.babas.capurro.MyViewModel
import br.com.babas.capurro.R
import kotlinx.android.synthetic.main.fragment_teste.*

class Teste : Fragment() {


    private lateinit var model: MyViewModel
    var navController: NavController? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        model = ViewModelProvider(requireActivity()) [MyViewModel::class.java]
        navController = Navigation.findNavController(requireActivity(), R.id.fragmentContainerView)

        return inflater.inflate(R.layout.fragment_teste, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        button3.setOnClickListener {
            model.metodo.value = 0 // Somático
            navController?.navigate(R.id.action_teste_to_somatico)
        }

        button4.setOnClickListener {
            model.metodo.value = 1 // somato neurológico
            navController?.navigate(R.id.action_teste_to_somatico)
        }
    }


}