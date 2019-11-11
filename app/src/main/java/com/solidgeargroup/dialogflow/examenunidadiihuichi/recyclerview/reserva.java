package com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview;

import java.io.Serializable;

public class reserva implements Serializable {
    private String fecha;
    private String hora;

    public reserva(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
