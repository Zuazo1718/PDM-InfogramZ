package com.zuazo.infogramz.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.zuazo.infogramz.R;
import com.zuazo.infogramz.model.Image;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {
    //lista de imagenes

    private ArrayList<Image> images;
    private int resource;
    private Activity activity;

    public CardViewAdapter (ArrayList<Image> images, int resource, Activity activity){
        this.images = images;
        this.resource = resource;
        this.activity = activity;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Image image = images.get(position);
        //image
        Picasso.get().load(image.getUrlImage()).into(holder.imageCardView);

        holder.usernameCardview.setText(image.getUsername());
        holder.cantidadDiasCardView.setText(image.getCantidadDias());
        holder.cantidadMeGustaCardView.setText(image.getCantidadMeGusta());

    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageCardView;
        private TextView usernameCardview;
        private TextView cantidadDiasCardView;
        private TextView cantidadMeGustaCardView;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageCardView = itemView.findViewById(R.id.imageCardView);
            usernameCardview = itemView.findViewById(R.id.usernameCardView);
            cantidadDiasCardView = itemView.findViewById(R.id.cantidadDiasCardView);
            cantidadMeGustaCardView = itemView.findViewById(R.id.cantidadMeGustaCardView);
        }
    }

}
