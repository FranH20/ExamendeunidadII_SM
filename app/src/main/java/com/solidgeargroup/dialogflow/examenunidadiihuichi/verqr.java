package com.solidgeargroup.dialogflow.examenunidadiihuichi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class verqr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verqr);
        configurarLector();
    }
    private void configurarLector(){
        final ImageButton imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new IntentIntegrator(verqr.this).initiateScan();
            }
        });
    }

    private void actualiarUITextViews(String resultadoScaneo, String formatoResultado){
        ((TextView)findViewById(R.id.tvFormat)).setText(resultadoScaneo);
    }

    private void manipularResultado(IntentResult intentResult){
        if(intentResult != null){
            actualiarUITextViews(intentResult.getContents(),intentResult.getFormatName());
        }else{
            Toast.makeText(getApplicationContext(),"No se leyó nada",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        final IntentResult intentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        manipularResultado(intentResult);
    }

    /*
    public void copiarPortapapeles(View view) {

        TextView textop;
        textop = (TextView) findViewById(R.id.tvFormat);
        String text = textop.getText().toString();

        ClipboardManager myClipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData myClip;

        myClip = ClipData.newPlainText("text", text);
        myClipboard.setPrimaryClip(myClip);

        Toast.makeText(getApplicationContext(),"Se copio correctamente",Toast.LENGTH_SHORT).show();
    }

    public void abrirResultado(View view) {
        TextView textop;
        textop = findViewById(R.id.tvFormat);
        String text = textop.getText().toString();
    }
     */

}
