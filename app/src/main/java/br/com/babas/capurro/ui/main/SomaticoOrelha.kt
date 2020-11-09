package br.com.babas.capurro.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import br.com.babas.capurro.MyViewModel
import br.com.babas.capurro.R
import kotlinx.android.synthetic.main.fragment_somatico_orelha.*


class Somatico : Fragment() {


    private lateinit var model: MyViewModel
    var navController: NavController? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        model = ViewModelProvider(requireActivity()) [MyViewModel::class.java]
        navController = Navigation.findNavController(requireActivity(), R.id.fragmentContainerView)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_somatico_orelha, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        card1.setOnClickListener {
            model.orelha.value = 0
            navController?.navigate(SomaticoDirections.actionSomaticoOrelhaToSomaticoGlMamaria())
        }

        card2.setOnClickListener {
            model.orelha.value = 8
            navController?.navigate(SomaticoDirections.actionSomaticoOrelhaToSomaticoGlMamaria())
        }

        card3.setOnClickListener {
            model.orelha.value = 16
            navController?.navigate(SomaticoDirections.actionSomaticoOrelhaToSomaticoGlMamaria())
        }

        card4.setOnClickListener{
            model.orelha.value = 24
            navController?.navigate(SomaticoDirections.actionSomaticoOrelhaToSomaticoGlMamaria())
        }

    }
}