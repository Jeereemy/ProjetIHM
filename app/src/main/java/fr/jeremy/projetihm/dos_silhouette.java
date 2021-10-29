package fr.jeremy.projetihm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class dos_silhouette extends AppCompatActivity {

    private Button button_retour;
    private Button button_profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos_silhouette);

        button_retour = (Button) findViewById(R.id.button_retour);
        button_profil = (Button) findViewById(R.id.button_profil);

        button_retour.setOnClickListener(v -> {
            openpage_principale();
        });

        button_profil.setOnClickListener(v -> {
            openprofil();
        });
    }

    public void openpage_principale() {
        Intent intent = new Intent(this, page_principale.class);
        startActivity(intent);
    }

    public void openprofil() {
        Intent intent = new Intent(this, profil.class);
        startActivity(intent);
    }
}