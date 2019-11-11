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
import com.solidgeargroup.dialogflow.examenunidadiihuichi.detallesreserva;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.Adaptador4;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.MyAdapter;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.OnRecyclerViewItemListener;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.promocion;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.reserva;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_reservacion extends Fragment implements OnRecyclerViewItemListener {

    private List<reserva> misreservas = new ArrayList<reserva>();
    RecyclerView recyclerView;
    private LinearLayoutManager mLayoutManager;
    private Adaptador4 mAdapter;


    public fragment_reservacion() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_reservacion, container, false);
        recyclerView = v.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),3));

        AgregarItems();

        mAdapter = new Adaptador4(misreservas,getContext(), this);
        recyclerView.setAdapter(mAdapter);
        return v;
    }

    public void AgregarItems() {
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "11:30"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "12:00"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "12:30"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "13:00"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "13:30"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "14:00"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "14:30"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "15:30"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "16:00"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "16:30"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "17:00"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "17:30"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "18:00"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "18:30"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "19:00"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "19:30"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "20:00"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "20:30"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "21:00"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "21:30"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "22:00"));
        misreservas.add(new reserva("lunes, 11 de noviembre de 2019", "22:30"));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position) {
        Intent intent = new Intent(getContext(), detallesreserva.class);
        Bundle b = new Bundle();
        b.putSerializable("film", misreservas.get(position));
        intent.putExtras(b);
        startActivity(intent);
    }
}
