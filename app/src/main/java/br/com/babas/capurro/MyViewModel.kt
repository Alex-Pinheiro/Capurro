package br.com.babas.capurro

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    var orelha = MutableLiveData<Int>()
    var mamaria = MutableLiveData<Int>()
    var mamilo = MutableLiveData<Int>()
    var pele = MutableLiveData<Int>()
    var pregas = MutableLiveData<Int>()
    var cachecol = MutableLiveData<Int>()
    var cabeca = MutableLiveData<Int>()

    var metodo = MutableLiveData<Int>()



    fun getOrelha(): Int?{
        return orelha.value
    }
    fun getMamaria(): Int?{
        return mamaria.value
    }
    fun getMamilo(): Int?{
        return mamilo.value
    }
    fun getPele(): Int?{
        return pele.value
    }
    fun getPregas(): Int?{
        return pregas.value
    }
    fun getCachecol(): Int?{
        return cachecol.value
    }
    fun getMetodo(): Int? {
        return metodo.value
    }
    fun getCabeca(): Int? {
        return cabeca.value
    }

}