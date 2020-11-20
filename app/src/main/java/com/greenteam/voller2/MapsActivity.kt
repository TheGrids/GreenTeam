package com.greenteam.voller2

import android.os.Bundle
import android.view.View
import android.view.animation.TranslateAnimation
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions


internal class MapsActivity : AppCompatActivity(), OnMarkerClickListener, OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var testArray: Array<Any>

    var myView: View? = null
    var isUp = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        myView = findViewById(R.id.event_card)

        // initialize as invisible (could also do in xml)
        myView?.visibility = View.INVISIBLE
        isUp = false
    }

    // slide the view from below itself to the current position
    private fun slideUp(view: View?) {
        view!!.visibility = View.VISIBLE
        val animate = TranslateAnimation(
                0F,  // fromXDelta
                0F,  // toXDelta
                view.height.toFloat(),  // fromYDelta
                0F) // toYDelta
        animate.duration = 500
        animate.fillAfter = true
        view.startAnimation(animate)
    }

    // slide the view from its current position to below itself
    private fun slideDown(view: View?) {
        val animate = TranslateAnimation(
                0F,  // fromXDelta
                0F,  // toXDelta
                0F,  // fromYDelta
                view!!.height.toFloat()) // toYDelta
        animate.duration = 500
        animate.fillAfter = true
        view.startAnimation(animate)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        val sydneyMarker =  mMap.addMarker(MarkerOptions()
                .position(sydney)
                .title("Marker in Sydney")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker)))
//      TODO add setting id to marker
        sydneyMarker.tag = 0
        val adHoc = object {
            var title: String = "test"
            var date: String = "20-11-2020"
        }
        testArray = arrayOf(adHoc)

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
        mMap.setOnMarkerClickListener(this)
    }

    override fun onMarkerClick(marker: Marker): Boolean {
        val markerData = testArray[marker.tag as Int]

        print(markerData)
        if (isUp) {
            slideDown(myView)
        } else {
            slideUp(myView)
        }
        isUp = !isUp

        return true
    }
}
