package com.example.listas.adapters;

import android.app.Activity;
import android.graphics.Color;
import android.media.Image;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import de.hdodenhof.circleimageview.CircleImageView;


import com.example.listas.R;
import com.example.listas.models.Notification;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ListItemAdapter extends BaseAdapter {

    private final List<Notification> itens;
    private final Activity act;

    public ListItemAdapter (List<Notification> itens, Activity act){
        this.itens = itens;
        this.act = act;
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int position) {
        return itens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.activiy_main_item_list, parent, false);
        Notification valor = itens.get(position);

        if (!valor.getLido()){
            view.setBackgroundColor(Color.parseColor("#dff5f3"));
        }


        TextView titulo = view.findViewById(R.id.activity_main_item_list_titulo);
        TextView descricao = view.findViewById(R.id.activity_main_item_list_descricao);
        TextView tempo = view.findViewById(R.id.activity_main_item_list_tempo);
        CircleImageView imagem = view.findViewById(R.id.activity_main_item_list_imagem);

        Picasso.get().load(valor.getUrlImage()).resize(100,100).into(imagem);
        
        titulo.setText(valor.getTitulo());
        descricao.setText(valor.getDescricao());
        tempo.setText(valor.getTempo());
        return view;

    }
}
