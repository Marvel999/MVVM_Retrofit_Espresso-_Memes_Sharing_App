package com.marvel999.memoapp.Repo

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley


class GetMemesUrl{
    var imageUrl="";
    val repMable= MutableLiveData<String>();
     val Chash_url=com.marvel999.memoapp.Repo.Chash_url();

    fun geturl(context:Context ):MutableLiveData<String>{

        if(!Chash_url.url.isEmpty()){
            Log.e("Volley call",Chash_url.url)
            repMable.setValue(Chash_url.url);
        }else {
            val queue = Volley.newRequestQueue(context)
            val url = "https://meme-api.herokuapp.com/gimme"
            val stringRequest = JsonObjectRequest(
                Request.Method.GET, url, null,
                Response.Listener { response ->
                    Log.e("volley", response.getString("url"));
                    imageUrl = response.getString("url")

                    Chash_url.seturl(imageUrl);
                    repMable.setValue(response.getString("url"));
                },
                Response.ErrorListener {
                    Log.e("Volley", it.localizedMessage)
                    imageUrl = ""

                })

            queue.add(stringRequest);

        }
        return repMable;
}


}