package br.com.babas.capurro.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import br.com.babas.capurro.MyViewModel
import br.com.babas.capurro.R
import kotlinx.android.synthetic.main.fragment_sinal_do_cachecol.*

class sinalDoCachecol : Fragment() {


    private lateinit var model: MyViewModel
    var navController: NavController? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        model = ViewModelProvider(requireActivity()) [MyViewModel::class.java]
        navController = Navigation.findNavController(requireActivity(), R.id.fragmentContainerView)
        return inflater.inflate(R.layout.fragment_sinal_do_cachecol, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        card1.setOnClickListener {
            model.cachecol.value = 0
            navController?.navigate(sinalDoCachecolDirections.actionSinalDoCachecolToPosicicaoDaCabeca())
        }

        card2.setOnClickListener {
            model.cachecol.value = 6
            navController?.navigate(sinalDoCachecolDirections.actionSinalDoCachecolToPosicicaoDaCabeca())
        }

        card3.setOnClickListener {
            model.cachecol.value = 12
            navController?.navigate(sinalDoCachecolDirections.actionSinalDoCachecolToPosicicaoDaCabeca())
        }

        card4.setOnClickListener{
            model.cachecol.value = 18
            navController?.navigate(sinalDoCachecolDirections.actionSinalDoCachecolToPosicicaoDaCabeca())
        }

    }
}