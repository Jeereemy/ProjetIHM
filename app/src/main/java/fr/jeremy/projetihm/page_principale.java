package fr.jeremy.projetihm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class page_principale extends AppCompatActivity {

    private Button button_dos;
    private Button button_profil;
    private Button button_pec;
    private Button button_epaules;
    private Button button_epaules2;
    private Button button_biceps;
    private Button button_biceps2;
    private Button button_abdos;
    private Button button_quadri;
    private Button button_quadri2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_principale);
        button_dos = (Button) findViewById(R.id.button_dos);
        button_profil  = (Button) findViewById(R.id.button_profil);
        button_pec  = (Button) findViewById(R.id.button_pec);
        button_epaules = (Button) findViewById(R.id.button_epaules);
        button_epaules2 = (Button) findViewById(R.id.button_epaules2);
        button_biceps = (Button) findViewById(R.id.button_biceps);
        button_biceps2 = (Button) findViewById(R.id.button_biceps2);
        button_abdos = (Button) findViewById(R.id.button_abdos);
        button_quadri = (Button) findViewById(R.id.button_quadri);
        button_quadri2 = (Button) findViewById(R.id.button_quadri2);




        button_dos.setOnClickListener(v -> {
            opendos_silhouette();
        });
        button_profil.setOnClickListener(v -> {
            openprofil();
        });
        button_pec.setOnClickListener(v -> {
            openpectoraux();
        });
        button_epaules.setOnClickListener(v -> {
            openepaules();
        });
        button_epaules2.setOnClickListener(v -> {
            openepaules();
        });
        button_biceps.setOnClickListener(v -> {
            openbiceps();
        });
        button_biceps2.setOnClickListener(v -> {
            openbiceps();
        });
        button_abdos.setOnClickListener(v -> {
            openabdos();
        });
        button_quadri.setOnClickListener(v -> {
            openquadri();
        });
        button_quadri2.setOnClickListener(v -> {
            openquadri();
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
    public void openpectoraux() {
        Intent intent = new Intent(this, pectoraux.class);
        startActivity(intent);
    }
    public void openepaules() {
        Intent intent = new Intent(this, epaules.class);
        startActivity(intent);
    }
    public void openbiceps() {
        Intent intent = new Intent(this, biceps.class);
        startActivity(intent);
    }
    public void openabdos() {
        Intent intent = new Intent(this, abdos.class);
        startActivity(intent);
    }
    public void openquadri() {
        Intent intent = new Intent(this, quadri.class);
        startActivity(intent);
    }
}