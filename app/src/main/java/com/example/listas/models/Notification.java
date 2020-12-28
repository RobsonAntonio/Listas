package com.example.listas.models;

import android.net.Uri;

public class Notification {

    private final String urlImage;
    private final String titulo;
    private final String descricao;
    private final String tempo;
    private Boolean lido = false;

    public Notification(String urlImage, String titulo, String descricao, String tempo, Boolean lido ){

        this.urlImage = urlImage;
        this.titulo = titulo;
        this.descricao = descricao;
        this.tempo = tempo;
        this.lido = lido;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTempo() {
        return tempo;
    }

    public Boolean getLido() {
        return lido;
    }

    public void setLido(Boolean lido) {
        this.lido = lido;
    }
}
