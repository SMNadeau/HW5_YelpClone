package com.example.yelpclone

// we use this in MyRecyclerAdapter.kt to form an arraylist of "locations" which has whatever elements we want (name of place, information, and respective image)
data class LocationsData(val name: String, val info: String, val profileImage: Int)