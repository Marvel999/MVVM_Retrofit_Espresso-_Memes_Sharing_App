package com.marvel999.memoapp.Model

import android.content.Context
import android.media.Image
import android.util.Log
import android.view.View.GONE
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide


class GetMemesUrl: ViewModel(){
    var imageUrl="";
    fun geturl( context:Context, image:ImageView,progressBar:ProgressBar):String{
        val queue = Volley.newRequestQueue(context);

        val url = "https://meme-api.herokuapp.com/gimme"
    val stringRequest = JsonObjectRequest(
    Request.Method.GET, url,null,
    Response.Listener { response ->
        Log.e("volley",response.getString("url"));
        imageUrl=response.getString("url")
        Glide.with(image).load(imageUrl).into(image);
        progressBar.setVisibility(GONE)

    },
    Response.ErrorListener { Log.e("Volley",it.localizedMessage )
       imageUrl=""

    })

        queue.add(stringRequest);
return imageUrl;
}


}