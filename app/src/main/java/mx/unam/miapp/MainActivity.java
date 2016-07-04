package mx.unam.miapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int dia, mes, año;
    EditText nombre, telefono, email, descripcion;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.etNombre);
        telefono = (EditText) findViewById(R.id.etTelefono);
        email = (EditText) findViewById(R.id.etEmail);
        descripcion = (EditText) findViewById(R.id.etDescripcion);
        boton = (Button) findViewById(R.id.MiBoton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
                intent.putExtra("nombre", nombre.getText().toString());
                intent.putExtra("telefono", telefono.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("descripcion", descripcion.getText().toString());
                startActivity(intent);
                finish();
            }
        });

    }


    DatePickerDialog.OnDateSetListener picker = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            dia = dayOfMonth;
            mes = monthOfYear;
            año = year;
        }
    };
}
