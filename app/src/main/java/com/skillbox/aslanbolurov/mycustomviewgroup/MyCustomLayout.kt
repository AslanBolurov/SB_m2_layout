package com.skillbox.aslanbolurov.mycustomviewgroup

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.skillbox.aslanbolurov.mycustomviewgroup.databinding.MyCustomLayoutBinding

class MyCustomLayout
@JvmOverloads constructor(
    context: Context,
    attrs:AttributeSet?=null,
    defStyleAttr:Int=0
    ):LinearLayout(context,attrs,defStyleAttr) {
    val binding=MyCustomLayoutBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
    }

    fun setTextForTopLine(strData:String){
        binding.tvUpperString.text=strData
    }
    fun setTextForBottomLine(strData:String){
        binding.tvLowerString.text=strData
    }
    }