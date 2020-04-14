package com.example.yelpclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Key's to be used in order to pull information from yelp
        // Client ID:
        //ecHYcoWK7-pVM76EtejaEw

        //API Key:
        //F-iCWcazJq2HmjxyorhONqxfWU4iWE_j_C0L04UExgRMGl8KutAyWTMZxTcQZFvbxvfVUtwGI4uIINagfEadbjp3iFmf_PZDqxtqpGWT9kq93TaL5w4TKbVj0zaVXnYx

        val food = foodText.text
        val location = locationText.text

    }
}