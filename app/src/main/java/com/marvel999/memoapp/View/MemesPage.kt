package com.marvel999.memoapp.View

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import com.bumptech.glide.Glide
import com.marvel999.memoapp.Model.GetMemesUrl
import com.marvel999.memoapp.R
import com.marvel999.memoapp.ViewModel.MemeUrlData
import kotlinx.android.synthetic.main.activity_memes_page.*

class MemesPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memes_page);
        val MemeUrl= MemeUrlData();
        progressBar.setVisibility(VISIBLE)
        val imageurl=MemeUrl.LoadUrl(this,memsImage,progressBar);

        nextbtn.setOnClickListener(View.OnClickListener {
            progressBar.setVisibility(VISIBLE);
            val imageurl=MemeUrl.LoadUrl(this,memsImage,progressBar);
        })

        sharebtn.setOnClickListener(View.OnClickListener {
            val gmu= MemeUrlData();
            val intent= Intent(Intent.ACTION_SEND)
            intent.setType( "text/plain");


            Log.e("URL",gmu.geturl()+"is empty")
            intent.putExtra(Intent.EXTRA_TEXT,"Hello friend I found this Memes${gmu.geturl()}")
            val choose=Intent.createChooser(intent,"Share this memes...")
            if (choose.`package`=="com.whatsapp")
            intent.setPackage("com.whatsapp");
            startActivity(choose);
        })




    }
}