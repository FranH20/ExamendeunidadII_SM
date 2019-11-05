package com.solidgeargroup.dialogflow.examenunidadiihuichi.fragmentos;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.solidgeargroup.dialogflow.examenunidadiihuichi.BackEnd;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.FrontEnd;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.MainActivity;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.R;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.listapremios;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.Adaptador2;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.MyAdapter;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.promocion;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.verqr;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_mihistorial extends Fragment {

    Button btnCodigo;
    Button btnqr;
    Button btnpremios;

    private List<promocion> mispromociones = new ArrayList<promocion>();
    RecyclerView recyclerView;
    private LinearLayoutManager mLayoutManager;
    private Adaptador2 mAdapter;
    private EditText codetext;

    public fragment_mihistorial() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_mihistorial, container, false);
        codetext = v.findViewById(R.id.textocode);
        btnCodigo = v.findViewById(R.id.btnCanjearCodigo);
        btnCodigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String esay = codetext.getText().toString();
                if(esay.equals("17468765579")){
                    Intent intent = new Intent(v.getContext(), verqr.class);
                    startActivity(intent);
                }
                if(esay.equals("123")){
                    Intent intent = new Intent(v.getContext(), BackEnd.class);
                    startActivity(intent);
                }
                if(esay.equals("11111")){
                    Intent intent = new Intent(v.getContext(), verqr.class);
                    startActivity(intent);
                }
            }
        });

        btnqr = v.findViewById(R.id.btnQR);
        btnqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), verqr.class);
                startActivity(intent);
            }
        });

        recyclerView = v.findViewById(R.id.recic);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        AgregarItems();

        mAdapter = new Adaptador2(mispromociones);
        recyclerView.setAdapter(mAdapter);

        btnpremios = v.findViewById(R.id.verpremios);
        btnpremios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), listapremios.class);
                startActivity(intent);
            }
        });

        return v;
    }

    public void AgregarItems() {
        mispromociones.add(new promocion("Oferta de reserva online",
                "150 puntos",
                R.drawable.star));
        mispromociones.add(new promocion("Oferta de reserva online",
                "150 puntos",
                R.drawable.star));
        mispromociones.add(new promocion("Oferta de reserva online",
                "150 puntos",
                R.drawable.star));
        mispromociones.add(new promocion("Oferta de reserva online",
                "150 puntos",
                R.drawable.star));
    }

}
