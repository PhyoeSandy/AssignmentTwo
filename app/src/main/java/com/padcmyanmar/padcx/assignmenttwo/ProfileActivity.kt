package com.padcmyanmar.padcx.assignmenttwo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile.*

/**
 * Created by Phyoe Sandy Soe Tun
 * on 1/6/2020.
 */

class ProfileActivity : AppCompatActivity() {

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,ProfileActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setSupportActionBar(tbOne)
        supportActionBar?.setDisplayShowTitleEnabled(false)


        tvDataName.text = intent.getStringExtra("name")
        tvDataEmail.text = intent.getStringExtra("email")
        tvDataPhno.text = intent.getStringExtra("phno")

        ivLike1.setOnClickListener{
            startActivity(DetailActivity.newIntent(this))
        }

        ivLike2.setOnClickListener {
            startActivity(DetailActivity.newIntent(this))
        }

        tvHome.setOnClickListener {
            finish()
        }
    }
}
