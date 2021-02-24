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
import kotlinx.android.synthetic.main.fragment_posicicao_da_cabeca.*


class posicicaoDaCabeca : Fragment() {


    private lateinit var model: MyViewModel
    var navController: NavController? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        model = ViewModelProvider(requireActivity()) [MyViewModel::class.java]
        navController = Navigation.findNavController(requireActivity(), R.id.fragmentContainerView)
        return inflater.inflate(R.layout.fragment_posicicao_da_cabeca, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        card1.setOnClickListener {
            model.cabeca.value = 0
            navController?.navigate(posicicaoDaCabecaDirections.actionPosicicaoDaCabecaToPontuacaoFinal())
        }

        card2.setOnClickListener {
            model.cabeca.value = 4
            navController?.navigate(posicicaoDaCabecaDirections.actionPosicicaoDaCabecaToPontuacaoFinal())
        }

        card3.setOnClickListener {
            model.cabeca.value = 8
            navController?.navigate(posicicaoDaCabecaDirections.actionPosicicaoDaCabecaToPontuacaoFinal())
        }

        card4.setOnClickListener{
            model.cabeca.value = 12
            navController?.navigate(posicicaoDaCabecaDirections.actionPosicicaoDaCabecaToPontuacaoFinal())
        }

    }
}