package com.example.yelpclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // test elements
        // we can make a helper function that displays information that I guess is going to come from an API?
        val location1 = LocationsData("PEPE'S PIZZA", "420 Blaze Street", R.drawable.ic_person_black_24dp)
        val location2 = LocationsData("MIRANDAS", "Somewhere In my town don't remember", R.drawable.ic_person_black_24dp)

        val locations = ArrayList<LocationsData>()

        locations.add(location1)
        locations.add(location2)

        //recyclerView passes 'locations' to the recyclerView to display
        recycler_view.adapter = MyRecyclerAdapter(locations)

        //can set horizontal, default is vertical
        recycler_view.layoutManager = LinearLayoutManager(this)



        //Key's to be used in order to pull information from yelp
        // Client ID:
        //ecHYcoWK7-pVM76EtejaEw

        //API Key:
        //F-iCWcazJq2HmjxyorhONqxfWU4iWE_j_C0L04UExgRMGl8KutAyWTMZxTcQZFvbxvfVUtwGI4uIINagfEadbjp3iFmf_PZDqxtqpGWT9kq93TaL5w4TKbVj0zaVXnYx

        val foodSearch = foodText.text
        val locationSearch = locationText.text

    }
}