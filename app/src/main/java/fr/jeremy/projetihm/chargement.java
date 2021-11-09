package fr.jeremy.projetihm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.MailTo;
import android.os.Bundle;
import android.os.Handler;

public class chargement extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chargement);

        // rediriger vers la page principale après 3 secondes.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // demarrer une page
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        // Delai
        new Handler().postDelayed(runnable, 3000);
    }
}