package com.solidgeargroup.dialogflow.examenunidadiihuichi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview.promocion;

public class DetailsActivity extends AppCompatActivity {

    private promocion promo;
    Button botone1;
    Button botone3;
    TextView textito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        Bundle b = getIntent().getExtras();
        promo = (promocion) b.getSerializable("film");

        setContentView(R.layout.activity_details);
        TextView titleTextView = this.findViewById(R.id.titulo);
        TextView descTextView = this.findViewById(R.id.descripcion);
        ImageView imageImageView = this.findViewById(R.id.imagen);

        titleTextView.setText(promo.getTitulo());
        descTextView.setText(promo.getDescripcion());
        imageImageView.setImageResource(promo.getImagen());


        botone3 = findViewById(R.id.btncompartir);
        textito = findViewById(R.id.textView3);
        botone1 = findViewById(R.id.btngenerar);
        botone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textito.setText("15161568");
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("", "15161568");
                clipboard.setPrimaryClip(clip);
                Toast.makeText(getApplicationContext(), "Copiado correctamente", Toast.LENGTH_SHORT).show();
            }
        });

        botone3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView titleTextView = findViewById(R.id.titulo);
                TextView descTextView = findViewById(R.id.descripcion);
                String mensaje = "No te pierdas la promocion del Restaurante Uros \n" + titleTextView.getText().toString() + "\n" + descTextView.getText().toString() + "\n"
                        + "Ubicacion : Puedes visitarnos en Av. Agusto B. Legüía Nº 1105 \n No te olvides descargar nuestra aplicacion UrosApp para obtener mas informacion y puedas ganar premios adicionales";
                Intent compartir = new Intent(android.content.Intent.ACTION_SEND);
                compartir.setType("text/plain");
                compartir.putExtra(android.content.Intent.EXTRA_SUBJECT, "Empleos Baja App");
                compartir.putExtra(android.content.Intent.EXTRA_TEXT,mensaje );
                startActivity(Intent.createChooser(compartir, "Compartir vía"));
            }
        });

    }
}
