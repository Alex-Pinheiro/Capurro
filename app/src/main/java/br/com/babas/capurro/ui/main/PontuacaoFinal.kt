package br.com.babas.capurro.ui.main

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import br.com.babas.capurro.MyViewModel
import br.com.babas.capurro.R
import kotlinx.android.synthetic.main.fragment_pontuacao_final.*


class PontuacaoFinal : Fragment() {

    var orelha: Int? = null
    var mamaria: Int? = null
    var mamilo: Int? = null
    var pele: Int? = null
    var pregas: Int? = null
    var cachecol: Int? = null
    var cabeca: Int? = null
    var navController: NavController? = null


    private lateinit var model: MyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        navController = Navigation.findNavController(requireActivity(), R.id.fragmentContainerView)

        return inflater.inflate(R.layout.fragment_pontuacao_final, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        model = ViewModelProvider(requireActivity()) [MyViewModel::class.java]

        val orelha = Observer <Int> {
            orelha = it
        }
        val mamaria = Observer <Int> {
            mamaria = it
        }
        val mamilo = Observer <Int> {
            mamilo = it
        }
        val pele = Observer <Int> {
            pele = it
        }
        val pregas = Observer <Int> {
            pregas = it
        }
        val cachecol = Observer <Int> {
            cachecol = it
        }
        val cabeca = Observer <Int> {
            cabeca = it
        }
        val a = model.getOrelha()
        val b = model.getMamaria()
        val c = model.getMamilo()
        val d = model.getPele()
        val e = model.getPregas()
        val f = model.getCachecol()
        val g = model.getCabeca()

        val metodo = model.getMetodo()

        var pontos: Int? = null

        //0 para somático e 1 para somato neurológico
        if(metodo == 0){
            val lista = listOf(a!!, b!!, c!!, d!!, e!!)
            val soma = lista.sum()
            pontos = (soma+204)/7
            textView9.text = "Os valores selecionados foram Formato da Orelha: $a, Glândula Mamaria: $b, Formato do Mamilo: $c, Textura da Pele: $d, Pregas Plantares: $e"

        } else if(metodo == 1){
            val lista = listOf(a!!, b!!, c!!, d!!, e!!, f!!, g!!)
            val soma = lista.sum()
            pontos = (soma+200)/7
            textView9.text = "Os valores selecionados foram Formato da Orelha: $a, Glândula Mamaria: $b, Formato do Mamilo: $c, Textura da Pele:, $d, Pregas Plantares: $e, Sinal do Cachecol: $f, Posição da Cabeça: $g"
        }

        val semanas = when(pontos){

            -10 -> "20 semanas"
            -9 -> "20 semanas e 03 dias"
            -8 -> "20 semanas e 06 dias"
            -7 -> "21 semanas e 01 dia"
            -6 -> "21 semanas e 04 dias"
            -5 -> "22 semanas"
            -4 -> "22 semanas e 03 dias"
            -3 -> "22 semanas e 06 dias"
            -2 -> " 23 semanas e 01 dia"
            -1 -> "23 semanas e 04 dias"
            0 -> "24 semanas"
            1 -> "24 semanas e 03 dias"
            2 -> "24 semanas e 06 dias"
            3 -> "25 semanas e 01 dia"
            4 -> "25 semanas e 04 dias"
            5 -> "26 semanas"
            6 -> "26 semanas e 03 dias"
            7 -> "26 semanas e 06 dias"
            8 -> "27 semanas e 01 dia"
            9 -> "27 semanas e 04 dias"
            10 -> "28 semanas"
            11 -> "28 semanas e 03 dias"
            12 -> "28 semanas e 06 dias"
            13 -> "29 semanas e 01 dia"
            14 -> "29 semanas e 04 dias"
            15 -> "30 semanas"
            16 -> "30 semanas e 03 dias"
            17 -> "30 semanas e 06 dias"
            18 -> "31 semanas e 01 dia"
            19 -> "31 semanas e 04 dias"
            20 -> "32 semanas"
            21 -> "32 semanas e 03 dias"
            22 -> "32 semanas e 06 dias"
            23 -> "33 semanas e 01 dia"
            24 -> "33 semanas e 04 dias"
            25 -> "34 Semanas"
            26 -> "34 semanas e 03 dias"
            27 -> "34 semanas e 06 dias"
            28 -> "35 semanas e 01 dia"
            29 -> "35 semanas e 04 dias"
            30 -> "36 semanas"
            31 -> "36 semanas e 03 dias"
            32 -> "36 semanas e 06 dias"
            33 -> "37 semanas e 01 dia"
            34 -> "37 semanas e 04 dias"
            35 -> "38 semanas"
            36 -> "38 semanas e 03 dias"
            37 -> "38 semanas e 06 dias"
            38 -> "39 semanas e 01 dia"
            39 -> "39 semanas e 04 dias"
            40 -> "40 semanas"
            41 -> "40 semanas e 03 dias"
            42 -> "40 semanas e 06 dias"
            43 -> "41 semanas e 01 dia"
            44 -> "41 semanas e 04 dias"
            45 -> "42 semanas"
            46 -> "42 semanas e 03 dias"
            47 -> "42 semanas e 06 dias"
            48 -> "43 semanas e 01 dia"
            49 -> "43 semanas e 04 dias"
            50 -> "44 semanas"

            else -> throw IndexOutOfBoundsException()
        }
        textView8.text = "$pontos pontos."

        textView10.text = semanas


        model.orelha.observe(viewLifecycleOwner, orelha)
        model.mamaria.observe(viewLifecycleOwner, mamaria)
        model.mamilo.observe(viewLifecycleOwner, mamilo)
        model.pele.observe(viewLifecycleOwner, pele)
        model.pregas.observe(viewLifecycleOwner, pregas)

        button6.setOnClickListener {
            navController?.navigate(PontuacaoFinalDirections.actionPontuacaoFinalToMainFragment())
        }

    }

}