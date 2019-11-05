package com.solidgeargroup.dialogflow.examenunidadiihuichi.fragmentos;


import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.solidgeargroup.dialogflow.examenunidadiihuichi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_aboutUs extends Fragment {

    int fila, columna;
    int matriz[][] = new int[3][3];

    ImageView imagen00;
    ImageView imagen01;
    ImageView imagen02;
    ImageView imagen10;
    ImageView imagen11;
    ImageView imagen12;
    ImageView imagen20;
    ImageView imagen21;
    ImageView imagen22;

    int contador = 0;

    ImageView u_letra;
    ImageView r_letra;
    ImageView o_letra;
    ImageView s_letra;

    private Handler mHandler = new Handler();
    public fragment_aboutUs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fragment_about_us, container, false);
        resolverMatriz();

        imagen00 = v.findViewById(R.id.imageView);
        imagen01 = v.findViewById(R.id.imageView4);
        imagen02 = v.findViewById(R.id.imageView5);

        imagen10 = v.findViewById(R.id.imageView7);
        imagen11 = v.findViewById(R.id.imageView6);
        imagen12 = v.findViewById(R.id.imageView8);

        imagen20 = v.findViewById(R.id.imageView9);
        imagen21 = v.findViewById(R.id.imageView10);
        imagen22 = v.findViewById(R.id.imageView11);

        u_letra = v.findViewById(R.id.imageView14);
        r_letra = v.findViewById(R.id.imageView16);
        o_letra = v.findViewById(R.id.imageView17);
        s_letra = v.findViewById(R.id.imageView18);


        imagen00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matriz[0][0] == 1){
                    asignarpganador(imagen00);
                    verdaderoganador();
                }else{
                    buscareluno();
                }
                resolverMatriz();
                mHandler.postDelayed(mTiempodeEspera, 2000);
                //positivos();
            }
        });
        imagen01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matriz[0][1] == 1){
                    asignarpganador(imagen01);
                    verdaderoganador();
                }else{
                    buscareluno();
                }
                resolverMatriz();
                mHandler.postDelayed(mTiempodeEspera, 2000);
                //positivos();
            }
        });
        imagen02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matriz[0][2] == 1){
                    asignarpganador(imagen02);
                    verdaderoganador();
                }else{
                    buscareluno();
                }
                resolverMatriz();
                mHandler.postDelayed(mTiempodeEspera, 2000);
                //positivos();
            }
        });
        /////////////////////////////////////////////////////////////////
        imagen10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matriz[1][0] == 1){
                    asignarpganador(imagen10);
                    verdaderoganador();
                }else{
                    buscareluno();
                }
                resolverMatriz();
                mHandler.postDelayed(mTiempodeEspera, 2000);
                //positivos();
            }
        });
        imagen11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matriz[1][1] == 1){
                    asignarpganador(imagen11);
                    verdaderoganador();
                }else{
                    buscareluno();
                }
                resolverMatriz();
                mHandler.postDelayed(mTiempodeEspera, 2000);
                //positivos();

            }
        });
        imagen12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matriz[1][2] == 1){
                    asignarpganador(imagen12);
                    verdaderoganador();
                }else{
                    buscareluno();
                }
                resolverMatriz();
                mHandler.postDelayed(mTiempodeEspera, 2000);
                //positivos();

            }
        });
        /////////////////////////////////////////////////////////////////
        imagen20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matriz[2][0] == 1){
                    asignarpganador(imagen20);
                    verdaderoganador();
                }else{
                    buscareluno();
                }
                resolverMatriz();
                mHandler.postDelayed(mTiempodeEspera, 2000);
                //positivos();
            }
        });
        imagen21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matriz[2][1] == 1){
                    asignarpganador(imagen21);
                    verdaderoganador();
                }else{
                    buscareluno();
                }
                resolverMatriz();
                mHandler.postDelayed(mTiempodeEspera, 2000);
                //positivos();
            }
        });
        imagen22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(matriz[2][2] == 1){
                    asignarpganador(imagen22);
                    verdaderoganador();
                }else{
                    buscareluno();
                }
                resolverMatriz();
                mHandler.postDelayed(mTiempodeEspera, 2000);
                //positivos();
            }
        });

        return v;
    }

    public void resolverMatriz(){
        fila = (int)(Math.random()*3+0);
        columna = (int)(Math.random()*3+0);

        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                if (x == fila && y == columna){
                    matriz[x][y] = 1;
                }else {
                    matriz[x][y] = 0;
                }
            }
        }
    }

    public void buscareluno(){
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                if (matriz[x][y] == 1){
                    fila = x;
                    columna = y;
                    break;
                }
            }
        }
        switch (fila){
            case 0:
                switch (columna){
                    case 0:
                        asignarpganador(imagen00);
                        break;
                    case 1:
                        asignarpganador(imagen01);
                        break;
                    case 2:
                        asignarpganador(imagen02);
                        break;
                }
                break;
            case 1:
                switch (columna){
                    case 0:
                        asignarpganador(imagen10);
                        break;
                    case 1:
                        asignarpganador(imagen11);
                        break;
                    case 2:
                        asignarpganador(imagen12);
                        break;
                }
                break;
            case 2:
                switch (columna){
                    case 0:
                        asignarpganador(imagen20);
                        break;
                    case 1:
                        asignarpganador(imagen21);
                        break;
                    case 2:
                        asignarpganador(imagen22);
                        break;
                }
                break;
        }


    }

    public void asignarpganador(ImageView imagengeneral){
        asignarmalos();
        switch (contador){
            case 0:
                imagengeneral.setImageResource(R.drawable.winu_uros);
                break;
            case 1:
                imagengeneral.setImageResource(R.drawable.winr_uros);
                break;
            case 2:
                imagengeneral.setImageResource(R.drawable.wino_uros);
                break;
            case 3:
                imagengeneral.setImageResource(R.drawable.wins_uros);
                break;
        }
    }

    public void asignarmalos(){
        imagen00.setImageResource(R.drawable.noganaste);
        imagen01.setImageResource(R.drawable.noganaste);
        imagen02.setImageResource(R.drawable.noganaste);
        imagen10.setImageResource(R.drawable.noganaste);
        imagen11.setImageResource(R.drawable.noganaste);
        imagen12.setImageResource(R.drawable.noganaste);
        imagen20.setImageResource(R.drawable.noganaste);
        imagen21.setImageResource(R.drawable.noganaste);
        imagen22.setImageResource(R.drawable.noganaste);
    }

    public void asignacionpordefecto(){
        imagen00.setImageResource(R.drawable.cards_game);
        imagen01.setImageResource(R.drawable.cards_game);
        imagen02.setImageResource(R.drawable.cards_game);
        imagen10.setImageResource(R.drawable.cards_game);
        imagen11.setImageResource(R.drawable.cards_game);
        imagen12.setImageResource(R.drawable.cards_game);
        imagen20.setImageResource(R.drawable.cards_game);
        imagen21.setImageResource(R.drawable.cards_game);
        imagen22.setImageResource(R.drawable.cards_game);
    }

    public Runnable mTiempodeEspera = new Runnable() {
        @Override
        public void run() {
            asignacionpordefecto();
            //negativos();
        }
    };

    public void negativos(){
        imagen00.setClickable(false);
        imagen01.setClickable(false);
        imagen02.setClickable(false);
        imagen10.setClickable(false);
        imagen11.setClickable(false);
        imagen12.setClickable(false);
        imagen20.setClickable(false);
        imagen21.setClickable(false);
        imagen22.setClickable(false);
    }

    public void positivos(){
        imagen00.setClickable(true);
        imagen01.setClickable(true);
        imagen02.setClickable(true);
        imagen10.setClickable(true);
        imagen11.setClickable(true);
        imagen12.setClickable(true);
        imagen20.setClickable(true);
        imagen21.setClickable(true);
        imagen22.setClickable(true);
    }

    public void verdaderoganador(){
        switch (contador){
            case 0:
                u_letra.setImageResource(R.drawable.nu_uros);
                Toast.makeText(getContext(),"Ganaste la U",Toast.LENGTH_SHORT).show();
                contador++;
                break;
            case 1:
                r_letra.setImageResource(R.drawable.nr_uros);
                Toast.makeText(getContext(),"Ganaste la R",Toast.LENGTH_SHORT).show();
                contador++;
                break;
            case 2:
                o_letra.setImageResource(R.drawable.no_uros);
                Toast.makeText(getContext(),"Ganaste la O",Toast.LENGTH_SHORT).show();
                contador++;
                break;
            case 3:
                s_letra.setImageResource(R.drawable.ns_uros);
                Toast.makeText(getContext(),"Ganaste la S",Toast.LENGTH_SHORT).show();
                contador++;
                agregarAlerta();
                break;
        }
    }

    public void agregarAlerta(){
        // 1. Instantiate an <code><a href="/reference/android/app/AlertDialog.Builder.html">AlertDialog.Builder</a></code> with its constructor
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        final String code = "17468765579";
        // 2. Chain together various setter methods to set the dialog characteristics
        builder.setMessage("Felicidades ganaste una combo de comida gratis" + "\n" + "Codigo: 17468765579").setTitle("Felicidades");
        // 3. Get the <code><a href="/reference/android/app/AlertDialog.html">AlertDialog</a></code> from <code><a href="/reference/android/app/AlertDialog.Builder.html#create()">create()</a></code>
        builder.setPositiveButton("Copiar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                ClipboardManager clipboard = (ClipboardManager) getContext().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("", code);
                clipboard.setPrimaryClip(clip);
                Toast.makeText(getContext(), "Copiado correctamente", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
        // Add the buttons

    }

}
