package com.agustinchoslr.comparadorcadenas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Model modelo;
    private View vista;

    private EditText editText1;
    private EditText editText2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //    modelo = new Model();
      //  vista = this;

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

        Button buttonComparar = findViewById(R.id.button_comparar);

        buttonComparar.setOnClickListener(v -> {
            String texto1 = editText1.getText().toString();
            String texto2 = editText2.getText().toString();

            if (texto1.equals(texto2)) {
                textView = findViewById(R.id.textView);
                textView.setText("Las cadenas son iguales");
            } else {
                textView.setText("Las cadenas no son iguales");
            }

            setResult(Activity.RESULT_OK);
        });
    }
}