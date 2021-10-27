package fr.jeremy.projetihm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question1 extends AppCompatActivity {

    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);


        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(v -> {
            openpage_principale();
        });
    }

        public void openpage_principale(){
            Intent intent2 = new Intent(this, page_principale.class);
            startActivity(intent2);
            }
        }
