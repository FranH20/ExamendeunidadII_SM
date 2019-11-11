package com.solidgeargroup.dialogflow.examenunidadiihuichi.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.solidgeargroup.dialogflow.examenunidadiihuichi.R;

import java.util.List;

public class Adaptador4 extends RecyclerView.Adapter<Adaptador4.ViewHolder> {

    private List<reserva> Listapromociones;
    private OnRecyclerViewItemListener mItemListener;
    Context c;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View promoView = inflater.inflate(R.layout.item3, parent, false);

        Adaptador4.ViewHolder viewHolder = new Adaptador4.ViewHolder(promoView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final reserva reserva = Listapromociones.get(position);

        holder.titleTextView.setText(reserva.getFecha());
        holder.descTextView.setText(reserva.getHora());
    }

    @Override
    public int getItemCount() {
        return Listapromociones.size();
    }

    public Adaptador4(List<reserva> reservas, Context context, OnRecyclerViewItemListener itemListener) {
        mItemListener = itemListener;
        Listapromociones = reservas;
        c = context;
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView titleTextView;
        public TextView descTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.fecha);
            descTextView = itemView.findViewById(R.id.hora);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mItemListener.onItemClick(null, v, getAdapterPosition());
        }
    }
}
