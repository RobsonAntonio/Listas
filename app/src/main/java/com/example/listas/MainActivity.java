package com.example.listas;

import androidx.annotation.ArrayRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.listas.adapters.ListItemAdapter;
import com.example.listas.dao.NotificationDao;
import com.example.listas.models.Notification;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotificationDao dao = new NotificationDao();
        Notification notification = new Notification("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzADSzFWHnnwWWKWhKNhhDiGz-14e2lt_thw&usqp=CAU", "Loren ipsum", "dolor sit amet,consetetur", "4min", false);
        Notification notification1 = new Notification("https://olhardigital.com.br/wp-content/uploads/2019/06/20190627121639.jpg", "Loren ipsum", "dolor sit amet,consetetur", "4min", false);
        Notification notification2 = new Notification("https://static1.purebreak.com.br/articles/8/87/80/8/@/331567-a-galera-esta-mostrando-os-resultados-de-950x0-1.jpg", "Loren ipsum", "dolor sit amet,consetetur", "10min", true);
        Notification notification3 = new Notification("https://dt2sdf0db8zob.cloudfront.net/wp-content/uploads/2019/12/9-Best-Online-Avatars-and-How-to-Make-Your-Own-for-Free-image16.jpg", "Loren ipsum", "dolor sit amet,consetetur", "40min", false);
        Notification notification4 = new Notification("https://i.pinimg.com/originals/54/98/c6/5498c6b73d96e5dde14ccf7938bf4831.png", "Loren ipsum", "dolor sit amet,consetetur", "2 horas atrás", true);
        Notification notification5 = new Notification("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRclzg_RYFbqcRJz4SMqSSEmXBmJo5AwUzajw&usqp=CAU", "Loren ipsum", "dolor sit amet,consetetur", "3 horas atrás", true);
        Notification notification6 = new Notification("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRuRbIoClqSsijDsX3Ays8X8GZAtmjSKduuFQ&usqp=CAU", "Loren ipsum", "dolor sit amet,consetetur", "4 horas atrás", true);
        Notification notification7 = new Notification("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYeBn4cHKrjJXiSeLDa9IVWfNpJWRX3LlMlg&usqp=CAU", "Loren ipsum", "dolor sit amet,consetetur", "Ontem às 22:30", true);
        dao.save(notification);
        dao.save(notification1);
        dao.save(notification2);
        dao.save(notification3);
        dao.save(notification4);
        dao.save(notification5);
        dao.save(notification6);
        dao.save(notification7);

        ListView lista = findViewById(R.id.activity_main_lista);
        ListItemAdapter adapter = new ListItemAdapter(dao.todos(), this);
        lista.setAdapter(adapter);

    }
}