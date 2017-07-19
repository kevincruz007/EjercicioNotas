package com.example.alumno.ejercicionotas;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2,et3;
    private CheckBox ck1;
    private TextView tv1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        ck1 = (CheckBox) findViewById(R.id.ck1);
        tv1 = (TextView) findViewById(R.id.tv1);



    }

    public void promediar(View view) {
        int numero1 = Integer.parseInt(et1.getText().toString());
        int numero2 = Integer.parseInt(et2.getText().toString());
        int numero3= Integer.parseInt(et3.getText().toString());
        int suma=numero1+numero2+numero3;
        if (!ck1.isChecked()) {
            tv1.setText(String.valueOf((suma/3)-((suma/3))*0.10));
        } else
            tv1.setText(String.valueOf(suma/3));

    }

}
