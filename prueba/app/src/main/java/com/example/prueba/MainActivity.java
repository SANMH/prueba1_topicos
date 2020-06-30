package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.prueba.model.persona;
import com.google.firebase.auth.FirebaseAuth;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {
EditText nomP, appP, correP,passworP;
ListView listV_personas;

    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomP = findViewById(R.id.etUsuario);
        appP = findViewById(R.id.etTelefono);
        correP = findViewById(R.id.etEmail);
        passworP = findViewById(R.id.etContrasena);

        listV_personas =findViewById(R.id.lv_datosPersona);

        fAuth=FirebaseAuth.getInstance();
        if (fAuth.getCurrentUser()!=null){
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        String nombre = nomP.getText().toString();
        String app = appP.getText().toString();
        String correo = correP.getText().toString();
        String password = passworP.getText().toString();

        switch (item.getItemId()){
            case R.id.icon_add:{
                if (nombre.equals("")){
                    validation();
                }
                else {
                    persona p = new persona();
                    p.setUid(UUID.randomUUID().toString());
                    p.setNombre(nombre);
                    p.setApellido(app);
                    p.setNombre(correo);
                    p.setPassword(password);

                    Toast.makeText(this, "Agregar", Toast.LENGTH_LONG).show();
                    limpiar();
                    break;
                }
            }

            case R.id.icon_save:{
                Toast.makeText(this, "Actualizar", Toast.LENGTH_LONG).show();
                break;
            }

            case R.id.icon_delete:{
                Toast.makeText(this, "Borrar", Toast.LENGTH_LONG).show();
                break;
            }
            default:break;
        }
        return true;
    }

    private void limpiar() {
        nomP.setText("");
        appP.setText("");
        correP.setText("");
        passworP.setText("");
    }

    private void validation() {
        String nombre = nomP.getText().toString();
        String app = appP.getText().toString();
        String correo = correP.getText().toString();
        String password = passworP.getText().toString();
        if(nombre.equals("")){
            nomP.setError("Requerido");
        }

        else if(app.equals("")){
            appP.setError("Requerido");
        }

        else if(correo.equals("")){
            correP.setError("Requerido");
        }

        else if(password.equals("")){
            passworP.setError("Requerido");
        }
    }
}