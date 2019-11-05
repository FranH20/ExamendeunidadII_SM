package com.solidgeargroup.dialogflow.examenunidadiihuichi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;

import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.Adaptador2;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.Adaptador3;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.OnRecyclerViewItemListener;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.promocion;

import java.util.ArrayList;
import java.util.List;

public class listapremios extends AppCompatActivity implements OnRecyclerViewItemListener {

    private List<promocion> mispromociones = new ArrayList<promocion>();
    RecyclerView recyclerView;
    private LinearLayoutManager mLayoutManager;
    private Adaptador3 mAdapter;
    private EditText codetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listapremios);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AgregarItems();
        mAdapter = new Adaptador3(mispromociones,this,this);
        recyclerView.setAdapter(mAdapter);

    }

    public void AgregarItems() {
        mispromociones.add(new promocion("Entrada gratis",
                "30 puntos",
                R.drawable.star));
        mispromociones.add(new promocion("Sopa y cremas",
                "40 puntos",
                R.drawable.star));
        mispromociones.add(new promocion("Ensaladas",
                "50 puntos",
                R.drawable.star));
        mispromociones.add(new promocion("Piqueos",
                "60 puntos",
                R.drawable.star));
        mispromociones.add(new promocion("Carnes a la piedra",
                "170 puntos",
                R.drawable.star));
        mispromociones.add(new promocion("Criollo e internacional",
                "160 puntos",
                R.drawable.star));
        mispromociones.add(new promocion("Bebidas y Cervezas",
                "110 puntos",
                R.drawable.star));
        mispromociones.add(new promocion("Postres",
                "80 puntos",
                R.drawable.star));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position) {
        Intent intent = new Intent(this, detalledos.class);
        Bundle b = new Bundle();
        b.putSerializable("film", mispromociones.get(position));
        intent.putExtras(b);
        startActivity(intent);
    }
}
