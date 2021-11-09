package fr.jeremy.projetihm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class dos_silhouette extends AppCompatActivity {

    private Button button_retour;
    private Button button_profil;
    private Button button_triceps;
    private Button button_triceps2;
    private Button button_fessiers;
    private Button button_ischio;
    private Button button_ischio2;
    private Button button_mollet;
    private Button button_mollet2;
    private Button button_dorsaux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos_silhouette);

        button_retour = (Button) findViewById(R.id.button_retour);
        button_profil = (Button) findViewById(R.id.button_profil);
        button_triceps = (Button) findViewById(R.id.button_triceps);
        button_triceps2 = (Button) findViewById(R.id.button_triceps2);
        button_fessiers = (Button) findViewById(R.id.button_fessiers);
        button_ischio = (Button) findViewById(R.id.button_ischio);
        button_ischio2 = (Button) findViewById(R.id.button_ischio2);
        button_mollet = (Button) findViewById(R.id.button_mollet);
        button_mollet2 = (Button) findViewById(R.id.button_mollet2);
        button_dorsaux = (Button) findViewById(R.id.button_dorsaux);


        button_retour.setOnClickListener(v -> {
            openpage_principale();
        });
        button_profil.setOnClickListener(v -> {
            openprofil();
        });
        button_triceps.setOnClickListener(v -> {
            opentriceps();
        });
        button_triceps2.setOnClickListener(v -> {
            opentriceps();
        });
        button_fessiers.setOnClickListener(v -> {
            openfessiers();
        });
        button_ischio.setOnClickListener(v -> {
            openischio();
        });
        button_ischio2.setOnClickListener(v -> {
            openischio();
        });
        button_mollet.setOnClickListener(v -> {
            openmollets();
        });
        button_mollet2.setOnClickListener(v -> {
            openmollets();
        });
        button_dorsaux.setOnClickListener(v -> {
            opendorsaux();
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
    public void opentriceps() {
        Intent intent = new Intent(this, Triceps.class);
        startActivity(intent);
    }
    public void openfessiers() {
        Intent intent = new Intent(this, Fessiers.class);
        startActivity(intent);
    }
    public void openischio() {
        Intent intent = new Intent(this, Ischio.class);
        startActivity(intent);
    }
    public void openmollets() {
        Intent intent = new Intent(this, Mollets.class);
        startActivity(intent);
    }
    public void opendorsaux() {
        Intent intent = new Intent(this, Dorsaux.class);
        startActivity(intent);
    }
}