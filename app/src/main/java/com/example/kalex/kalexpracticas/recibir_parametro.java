package com.example.kalex.kalexpracticas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class recibir_parametro extends AppCompatActivity {
   TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_parametro);
        texto = (TextView) findViewById(R.id.lblParametro);
        Bundle bundle = this.getIntent().getExtras();
        texto.setText(bundle.getString("dato"));
    }
}
