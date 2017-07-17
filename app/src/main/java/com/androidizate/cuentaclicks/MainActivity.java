package com.androidizate.cuentaclicks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int clicks = 0;
    TextView cantidadDeClicks;
    Button botonClicks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cantidadDeClicks = (TextView) findViewById(R.id.tv_contador);
        botonClicks = (Button) findViewById(R.id.btn_sumar);
        botonClicks.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                cantidadDeClicks.setText(sumarClicks());
            }
        });
    }

    private int sumarClicks() {
        return clicks += 1;
    }
}
