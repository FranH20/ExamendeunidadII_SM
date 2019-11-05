package com.solidgeargroup.dialogflow.examenunidadiihuichi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.promocion;

public class detalledos extends AppCompatActivity {
    private promocion promo;
    Button botone1;
    TextView textito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalledos);

        Bundle b = getIntent().getExtras();
        promo = (promocion) b.getSerializable("film");

        TextView titleTextView = this.findViewById(R.id.titulo);
        TextView descTextView = this.findViewById(R.id.descripcion);
        ImageView imageImageView = this.findViewById(R.id.imagen);

        titleTextView.setText(promo.getTitulo());
        descTextView.setText(promo.getDescripcion());
        imageImageView.setImageResource(promo.getImagen());
    }
}
