package com.example.miapp_repaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
// declaracion de variables de los componetes a utilizar
    private EditText campo1,campo2;
    private TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // activar los componentes para poder hacer la operacion
        campo1 =findViewById(R.id.valor1);
        campo2=findViewById(R.id.valor2);
        result=findViewById(R.id.Resultados);

    }
// metodos a utilizar
    private void sumar (){
    String num1= campo1.getText().toString();
    String num2=campo2.getText().toString();
    if (!num1.isEmpty()&& !num2.isEmpty()){
     int suma = Integer.parseInt(num1)+Integer.parseInt(num2);
    result.setText("la suma es :"+suma);
    }else{
        Toast.makeText(this,"campos vacions",Toast.LENGTH_SHORT).show();
    }



    }
    private void resta (){
        String num1= campo1.getText().toString();
        String num2=campo2.getText().toString();
        if (!num1.isEmpty()&& !num2.isEmpty()){
            int resta = Integer.parseInt(num1)-Integer.parseInt(num2);
            result.setText("la resta es :"+resta);
        }else{
            Toast.makeText(this,"campos vacions",Toast.LENGTH_SHORT).show();
        }



    }
    private void multiplicar (){
        String num1= campo1.getText().toString();
        String num2=campo2.getText().toString();
        if (!num1.isEmpty()&& !num2.isEmpty()){
            int multiplicar = Integer.parseInt(num1)* Integer.parseInt(num2);
            result.setText("la multiplicacion es :"+multiplicar);
        }else{
            Toast.makeText(this,"campos vacions",Toast.LENGTH_SHORT).show();
        }



    }
    private void dividir (){
        String num1= campo1.getText().toString();
        String num2=campo2.getText().toString();
        if (!num1.isEmpty()&& !num2.isEmpty()){
            int dividir = Integer.parseInt(num1)/ Integer.parseInt(num2);
            result.setText("la Division  es :"+dividir);
        }else{
            Toast.makeText(this,"campos vacions",Toast.LENGTH_SHORT).show();
        }



    }
    public void onClick(View view) {

        if (view.getId()==R.id.btnsumar){

            this.sumar();
        }



        if (view.getId()==R.id.btnrestar){

            this.resta();
        }

        if (view.getId()==R.id.btnmultiplicar){

            this.multiplicar();

        }
        if (view.getId()==R.id.btndivir){

            this.dividir();

        }
    }
}