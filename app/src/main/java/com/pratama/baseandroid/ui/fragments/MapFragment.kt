package com.pratama.baseandroid.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.MarkerOptions
import com.pratama.baseandroid.R
import com.pratama.baseandroid.coreandroid.base.BaseFragmentBinding
import com.pratama.baseandroid.databinding.FragmentMapBinding

class MapFragment : BaseFragmentBinding<FragmentMapBinding>(), OnMapReadyCallback {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMapBinding =
        FragmentMapBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val supportMapFragment: SupportMapFragment =
            (childFragmentManager.findFragmentById((R.id.google_map)) as SupportMapFragment)
        supportMapFragment.getMapAsync { googleMap ->
            // When map is loaded
            googleMap.setOnMapClickListener { latLng -> // When clicked on map
                // Initialize marker options
                val markerOptions = MarkerOptions()
                // Set position of marker
                markerOptions.position(latLng)
                // Set title of marker
                markerOptions.title(latLng.latitude.toString() + " : " + latLng.longitude)
                // Remove all marker
                googleMap.clear()
                // Animating to zoom the marker
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 10f))
                // Add marker on map
                googleMap.addMarker(markerOptions)
            }
        }
    }

    override fun onMapReady(p0: GoogleMap) {
        val mapCickListener = GoogleMap.OnMapClickListener {
            fun onMapClick(){
                val markerOptions: MarkerOptions = MarkerOptions()
                markerOptions.position(it)
                markerOptions.title(it.latitude.toString() + " : " + it.longitude.toString())
                p0.clear()
                p0.animateCamera(CameraUpdateFactory.newLatLngZoom(it, 10F))
                p0.addMarker(markerOptions)
            }
        }
        p0.setOnMapClickListener (mapCickListener)
    }


    override fun setupView(binding: FragmentMapBinding) {
    }
}