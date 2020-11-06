package com.marvel999.memoapp.ViewModel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.marvel999.memoapp.Repo.GetMemesUrl

class MemeUrlData(applicarion:Application):AndroidViewModel(applicarion) {

    var live_data=MutableLiveData<String>();
    var url="";
    val gmu=GetMemesUrl();
    fun LoadUrl(context: Context):MutableLiveData<String>{
        live_data=gmu.geturl(context);
       return gmu.geturl(context);
    }

 fun loadUrlNewData(context: Context):MutableLiveData<String>{
     val gmu_new=GetMemesUrl();
        live_data=gmu_new.geturl(context);
       return gmu_new.geturl(context);
    }


}
