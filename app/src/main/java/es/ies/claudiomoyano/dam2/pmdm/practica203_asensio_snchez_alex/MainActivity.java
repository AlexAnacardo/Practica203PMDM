package es.ies.claudiomoyano.dam2.pmdm.practica203_asensio_snchez_alex;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        CheckBox activadorBoton = findViewById(R.id.checkBox);
        Button boton = findViewById(R.id.button);
        TextView texto = findViewById(R.id.textView);

        boton.setEnabled(false);

        activadorBoton.setOnCheckedChangeListener(new View.onCheckedChangeListener(){
            @Override
            public void onCheckedChange(View v){
                if(boton.isEnabled()){
                    boton.setEnabled(false);
                }
                else{
                    boton.setEnabled(true);
                }
            }
        });
    }
}