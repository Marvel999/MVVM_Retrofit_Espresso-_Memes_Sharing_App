package com.marvel999.memoapp.ViewModel

import android.content.Context
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.lifecycle.ViewModel
import com.marvel999.memoapp.Model.GetMemesUrl

class MemeUrlData: ViewModel() {
    var url="";
    fun LoadUrl(context: Context,image:ImageView,progressBar:ProgressBar){

        val gmu=GetMemesUrl();
       url= gmu.geturl(context,image,progressBar)

    }

    fun geturl():String{
        return url;
    }
}