package mx.edu.cetis108.cetis1084av_app003;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.*;
import android.view.*;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText edtnum1, edtnum2;
    Integer valor1, valor2,operacion;
    TextView txtresultado;
    Button btncalculo;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtnum1=(EditText) findViewById(R.id.num1);
        edtnum2=(EditText) findViewById(R.id.num2);
        txtresultado=(TextView) findViewById(R.id.resultado);
        btncalculo=(Button) findViewById(R.id.calculo);
        btncalculo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        valor1=Integer.valueOf((edtnum1.getText().toString()));
        valor2=Integer.valueOf((edtnum2.getText().toString()));
        if (valor1>valor2){
            operacion=valor1-valor2;
            txtresultado.setText(operacion.toString());
            Toast.makeText(getApplicationContext(),"el numero mayor es "+valor1,Toast.LENGTH_LONG).show();
        }
        else if (valor1<valor2){
            operacion=valor1+valor2;
            txtresultado.setText(operacion.toString());
            Toast.makeText(getApplicationContext(),"el numero mayor es "+valor2,Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(),"los numeros son iguales",Toast.LENGTH_LONG).show();
        }
    }
}
