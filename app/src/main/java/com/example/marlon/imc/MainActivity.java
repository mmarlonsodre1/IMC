package com.example.marlon.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnCalcularOnClick(View v) {

        TextView lblResultado = (TextView) findViewById(R.id.lblResultado);
        EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText) findViewById(R.id.txtAltura);

        if (txtAltura.getText().toString().equals("")  ||  txtPeso.getText().toString().equals("")) {
                lblResultado.setText("Falta digitar o Peso ou Altura");
        } else {

            int peso = Integer.parseInt(txtPeso.getText().toString());
            float altura = Float.parseFloat(txtAltura.getText().toString());


            Float resultado = peso / (altura * altura);
            if (resultado < 16) {
                lblResultado.setText("Magreza grave");
            } else if (resultado >= 16 && resultado < 17) {
                lblResultado.setText("Magreza moderada");
            } else if (resultado >= 17 && resultado < 18.5) {
                lblResultado.setText("Magreza leve");
            } else if (resultado >= 18.5 && resultado < 25) {
                lblResultado.setText("Saudável");
            } else if (resultado >= 25 && resultado < 30) {
                lblResultado.setText("Sobrepeso");
            } else if (resultado >= 30 && resultado < 35) {
                lblResultado.setText("Obesidade Grau I");
            } else if (resultado >= 35 && resultado < 40) {
                lblResultado.setText("Obesidade Grau II (severa)");
            } else if (resultado > 40) {
                lblResultado.setText("Obesidade Grau III (mórbida)");
            }
        }
    }
}
