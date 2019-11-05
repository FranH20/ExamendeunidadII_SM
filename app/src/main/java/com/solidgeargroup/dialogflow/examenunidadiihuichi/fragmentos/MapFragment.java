package com.solidgeargroup.dialogflow.examenunidadiihuichi.fragmentos;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragment extends Fragment implements OnMapReadyCallback {

    GoogleMap gMap;

    public MapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_map, container, false);
        final SupportMapFragment mapFragment = (SupportMapFragment) this.getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        return v;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap = googleMap;

        LatLng aqui = new LatLng(-18.0064826, -18.0064826);

        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(aqui)
                .zoom(14)//zoom
                .bearing(30)//inclinacion
                .build();
        gMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.markeruros)).position(aqui).title("Restaurante los Uros"));
        gMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }
}
