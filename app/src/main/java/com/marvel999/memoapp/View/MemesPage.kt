package com.marvel999.memoapp.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.*
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.marvel999.memoapp.R
import kotlinx.android.synthetic.main.activity_memes_page.*
import com.marvel999.memoapp.ViewModel.MemeUrlData as MemeUrlData1

class MemesPage : AppCompatActivity() {

      lateinit var viewmodel: MemeUrlData1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memes_page);


        viewmodel= ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory.getInstance(application))
                     .get(MemeUrlData1::class.java);
        viewmodel.LoadUrl(this).observe(this, Observer {
            Glide.with(memsImage)
                .load(it)
                .into(memsImage)
            progressBar.visibility= GONE
        })

        nextbtn.setOnClickListener {
            progressBar.visibility= VISIBLE
            nextbtn.isClickable=false;

            viewmodel.loadUrlNewData(this).observe(this, Observer {
                Glide.with(memsImage)
                    .load(it)
                    .into(memsImage)
                progressBar.visibility= GONE
                nextbtn.isClickable=true;
            })
        }


    }
}

