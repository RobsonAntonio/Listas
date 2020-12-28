package com.example.listas.dao;

import com.example.listas.models.Notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationDao {
    private final static List<Notification> itens = new ArrayList();

    public List<Notification> todos(){
        return new ArrayList(itens);
    }
    public void save (Notification notification) {
        itens.add(notification);
    }
}
