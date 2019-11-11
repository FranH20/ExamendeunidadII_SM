package com.solidgeargroup.dialogflow.examenunidadiihuichi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.promocion;
import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.reserva;

public class detallesreserva extends AppCompatActivity {

    private reserva reserva;
    Button botone1;
    Button botone3;
    TextView textito;

    String[] datos = new String[]{"Restaurant Uros - Leguia", "Restaurant Uros - San Martin"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallesreserva);

        Bundle b = getIntent().getExtras();
        reserva = (reserva) b.getSerializable("film");

        TextView titleTextView = this.findViewById(R.id.txtfecha);
        TextView descTextView = this.findViewById(R.id.txthora);

        titleTextView.setText(reserva.getFecha());
        descTextView.setText(reserva.getHora());

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, datos);
        spinner.setAdapter(adapter);
    }
}
