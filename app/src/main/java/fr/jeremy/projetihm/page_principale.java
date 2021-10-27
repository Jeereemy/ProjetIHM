package fr.jeremy.projetihm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class page_principale extends AppCompatActivity {

    private Button button_dos;
    private Button button_profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_principale);
        button_dos = (Button) findViewById(R.id.button_dos);
        button_profil  = (Button) findViewById(R.id.button_profil);

        button_dos.setOnClickListener(v -> {
            opendos_silhouette();
        });
        button_profil.setOnClickListener(v -> {
            openprofil();
        });
    }

    public void opendos_silhouette() {
        Intent intent = new Intent(this, dos_silhouette.class);
        startActivity(intent);
    }
    public void openprofil() {
        Intent intent = new Intent(this, profil.class);
        startActivity(intent);
    }
}