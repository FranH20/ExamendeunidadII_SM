package com.solidgeargroup.dialogflow.examenunidadiihuichi.fragmentos;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.solidgeargroup.dialogflow.examenunidadiihuichi.DetailsActivity;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.R;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.OnRecyclerViewItemListener;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.promocion;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.MyAdapter;

import java.util.ArrayList;
import java.util.List;


public class fragment_home extends Fragment implements OnRecyclerViewItemListener {

    private List<promocion> mispromociones = new ArrayList<promocion>();
    RecyclerView recyclerView;
    private LinearLayoutManager mLayoutManager;
    private MyAdapter mAdapter;

    public fragment_home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment_home, container, false);

        recyclerView = v.findViewById(R.id.listaPromociones);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        AgregarItems();

        mAdapter = new MyAdapter(mispromociones,getContext(), this);
        recyclerView.setAdapter(mAdapter);

        return v;
    }

    public void AgregarItems() {
        mispromociones.add(new promocion("Oferta de reserva online",
                "Al hacer tus reservas online, te brindamos GRATIS un Cóctel de Bienvenida para cada persona en el restaurante de tu preferencia. Haz tus Reservas Vía Inbox",
                R.drawable.oferta1));
        mispromociones.add(new promocion("25% de descuento por el dia del periodismo",
                "Queremos desearles un Feliz Día a todos los Profesionales del Periodismo que gracias a su labor nos brindan la información de todo el acontecer nacional. Es por ellos que en este dia tan especial se dara un 25% dedescuento a todos los periodistas que presenten un atentificacion \n Fecha de culminacion 5/11/2019" ,
                R.drawable.oferta2));
        mispromociones.add(new promocion("10% descuento de nuetra recomendacion",
                "La recomendación para este fin de semana es nuestro Fettuccine Alioli acompañado de un jugoso Bife Angosto. Por ello haremos el dia de hoy una oferta especial de 10% de descuento \n Fecha de culmincacion: 4/11/2019",
                R.drawable.oferta3));
        mispromociones.add(new promocion("Oferta de reserva online",
                "Al hacer tus reservas online, te brindamos GRATIS un Cóctel de Bienvenida para cada persona en el restaurante de tu preferencia. Haz tus Reservas Vía Inbox",
                R.drawable.oferta1));
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position) {
        Intent intent = new Intent(getContext(), DetailsActivity.class);
        Bundle b = new Bundle();
        b.putSerializable("film", mispromociones.get(position));
        intent.putExtras(b);
        startActivity(intent);
    }
}
