package br.com.babas.capurro.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import br.com.babas.capurro.MyViewModel
import br.com.babas.capurro.R

import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {



    private lateinit var model: MyViewModel
    var navController: NavController? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        model = ViewModelProvider(requireActivity()) [MyViewModel::class.java]

        navController = Navigation.findNavController(requireActivity(), R.id.fragmentContainerView)

        return inflater.inflate(R.layout.main_fragment, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        button2?.setOnClickListener {
            navController?.navigate(R.id.action_mainFragment_to_teste)
        }

        button?.setOnClickListener {
            navController?.navigate(R.id.action_mainFragment_to_informacoes)
        }

        button5?.setOnClickListener {
            navController?.navigate(R.id.action_mainFragment_to_referencias)
        }

    }


}