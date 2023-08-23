package com.example.aquaclean;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.CameraUpdateFactory;



public class pagina_principal extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Configurações do mapa, como tipo de mapa, controles, marcadores, etc.

        // Define o tipo de mapa como MAP_TYPE_NORMAL (mapa de rua)
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        // Move a câmera para exibir o Brasil como um todo
        LatLng brasil = new LatLng(-14.235, -51.925);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(brasil, 4)); // O valor 4 define o nível de zoom
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_principal);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }



}
