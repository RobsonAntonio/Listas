package com.example.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.listas.adapters.ListItemAdapter;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        Button btentrar = (Button) findViewById(R.id.btentrar);


        btentrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.i("Login", "onClick: A");
                EditText nome = findViewById(R.id.edit_nome);
                EditText senha = findViewById(R.id.edit_senha);

                if (nome.getText().toString().equals("robson") && senha.getText().toString().equals("123456")){
                    Intent it = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(it);
                }


            }
        });
    }
}