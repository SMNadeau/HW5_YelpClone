package com.example.yelpclone

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.location_item.view.*


// we use this class to "hold the view"
class MyRecyclerAdapter(private val locations: ArrayList<LocationsData>) : RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>(){

    //Log.d tag
    private val TAG = "MyRecyclerAdapter"

    var count = 0

    //constructor class
    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        //represents a single row in the list

        //assigned references to views in location_item.xml
        // we can use this to do normal stuff like locName.text = "string"
        val locName = itemView.tv_LocName
        val locInfo = itemView.tv_LocInfo
        val profileImage = itemView.img_profile



    }

    //below is imported methods that are required for the class


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // inflate a layout from out xml (location_item.xml) and returns the holder
        //similar to how we inflate the fragments

        //tracks the amount of views being made (seems to show about 11-12)
        Log.d(TAG, "onCreateViewHolder: ${count++}")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.location_item, parent, false)
        return MyViewHolder(view)
    }

    //tells how many rows is going to be in the list
    //can use array.size to set how many are shown.
    override fun getItemCount(): Int {
        return locations.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // gets element from your dataset at this position
        // replace the contents of the view with that element
        val currentItem = locations[position]
        holder.locName.text = currentItem.name
        holder.locInfo.text = currentItem.info
        holder.profileImage.setImageResource(currentItem.profileImage)
    }

}