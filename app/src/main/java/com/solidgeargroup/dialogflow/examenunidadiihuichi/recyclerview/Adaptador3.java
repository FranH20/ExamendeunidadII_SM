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

public class Adaptador3  extends RecyclerView.Adapter<Adaptador3.ViewHolder>{
    private List<promocion> Listapromociones;
    private OnRecyclerViewItemListener mItemListener;
    Context c;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View promoView = inflater.inflate(R.layout.item2, parent, false);

        Adaptador3.ViewHolder viewHolder = new Adaptador3.ViewHolder(promoView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final promocion promo = Listapromociones.get(position);

        holder.titleTextView.setText(promo.getTitulo());
        holder.descTextView.setText(promo.getDescripcion());
        holder.imageImageView.setImageResource(promo.getImagen());

    }

    @Override
    public int getItemCount() {
        return Listapromociones.size();
    }

    public Adaptador3(List<promocion> promociones, Context context, OnRecyclerViewItemListener itemListener) {
        mItemListener = itemListener;
        Listapromociones = promociones;
        c = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView titleTextView;
        public TextView descTextView;
        public ImageView imageImageView;

        public ViewHolder(View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.titulo);
            descTextView = itemView.findViewById(R.id.descripcion);
            imageImageView = itemView.findViewById(R.id.imagen);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mItemListener.onItemClick(null, v, getAdapterPosition());
        }
    }
}
