package com.padcmyanmar.padcx.assignmenttwo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Phyoe Sandy Soe Tun
 * on 1/6/2020.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnContinue.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("name", etName.text.toString())
            intent.putExtra("email",etEmail.text.toString())
            intent.putExtra("phno", etPhno.text.toString())
            startActivity(intent)
        }
    }
}

