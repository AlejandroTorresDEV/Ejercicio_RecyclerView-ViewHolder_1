package com.example.alejandrotorresruiz.recycler_view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alejandrotorresruiz on 14/11/17.
 */

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {

    private List<String> list;
    private int layout;
    private Context context;


    public myAdapter(List<String> list, int layout, Context context){
        this.list = list;
        this.layout = layout;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
        ViewHolder tvh = new ViewHolder(itemView);
        context = parent.getContext();
        return tvh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindAsignaturas(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewTitulo;


        public ViewHolder(View itemView) {
            super(itemView);
            textViewTitulo = (TextView) itemView.findViewById(R.id.textViewTitulo);
        }

        public void bindAsignaturas(String asignaturas) {
            textViewTitulo.setText(asignaturas);
        }
    }
}