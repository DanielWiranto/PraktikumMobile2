package com.example.Animal.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Sesuai namanya, Panda Merah memiliki bulu tebal berwarna merah kecokelatan dan berkaki hitam. Mukanya berbentuk bulat berwarna putih dengan garis merah kecokelatan dari mata ke mulutnya. Buntutnya panjang dengan dua belas cincin merah dan cokelat-muda berselang-seling."
    }
    val text: LiveData<String> = _text
}