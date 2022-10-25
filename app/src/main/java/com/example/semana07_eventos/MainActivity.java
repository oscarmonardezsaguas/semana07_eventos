package com.example.semana07_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.buttonClaseAnonima);
        btn2 = (Button) findViewById(R.id.buttonImplements);
        btn2.setOnClickListener(this);

        // usando clase anónima
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Evento utilizando clase anónima", Toast.LENGTH_SHORT).show();
            }
        });

    }

    // usando implements
    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this, "Evento utilizando onclick de  implements", Toast.LENGTH_SHORT).show();
    }

    // usando un metodo
    public void eventoBoton(View view) {
        Toast.makeText(MainActivity.this, "Evento utilizando onclick de  metodo", Toast.LENGTH_SHORT).show();
    }
}