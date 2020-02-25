package com.padcmyanmar.padcx.assignmenttwo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_profile.*

/**
 * Created by Phyoe Sandy Soe Tun
 * on 1/6/2020.
 */

class DetailActivity : AppCompatActivity() {

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,DetailActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(tbOne)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        tvBack.setOnClickListener {
            finish()
        }
    }
}
