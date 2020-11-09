package br.com.babas.capurro.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import br.com.babas.capurro.MyViewModel
import br.com.babas.capurro.R
import kotlinx.android.synthetic.main.main_activity.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

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



        val button2 = view?.findViewById<Button>(R.id.button2)
        button2?.setOnClickListener {
            model.metodo.value = 0 // somatico
            navController?.navigate(R.id.action_mainFragment_to_teste)
        }
    }

}