package mx.unam.miapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    TextView tvnombre, tvtelefono, tvemail, tvdescrip;
    Button boton;
    String nombre, telefono, email, descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        tvnombre = (TextView) findViewById(R.id.tvNombre);
        tvtelefono = (TextView) findViewById(R.id.tvTelefono);
        tvemail = (TextView) findViewById(R.id.tvEmail);
        tvdescrip = (TextView) findViewById(R.id.tvDescripcion);

        boton = (Button) findViewById(R.id.button2);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ConfirmarDatos.this, MainActivity.class);
                i.putExtra("pnombre", nombre);
                i.putExtra("ptelefono", telefono);
                i.putExtra("pemail", email);
                i.putExtra("pdescripcion", descripcion);
                startActivity(i);
            }
        });

        Bundle parametros = getIntent().getExtras();
        nombre = getIntent().getStringExtra("nombre");
        telefono = getIntent().getStringExtra("telefono");
        email = getIntent().getStringExtra("email");
        descripcion = getIntent().getStringExtra("descripcion");

        tvnombre.setText(nombre);
        tvtelefono.setText(telefono);
        tvemail.setText(email);
        tvdescrip.setText(descripcion);

    }
}
