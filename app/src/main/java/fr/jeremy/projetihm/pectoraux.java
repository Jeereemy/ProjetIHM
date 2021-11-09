package fr.jeremy.projetihm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class pectoraux extends AppCompatActivity {

    ListView List_pec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pectoraux);

        List_pec = (ListView)findViewById(R.id.List_pec);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("DC");
        arrayList.add("DI");
        arrayList.add("Butterfly");
        arrayList.add("Poulie basse");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        List_pec.setAdapter(arrayAdapter);

        List_pec.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    //click DC
                    startActivity(new Intent(pectoraux.this, dev_coucher.class));
                } else if(position==1){
                    //click DI
                    startActivity(new Intent(pectoraux.this, dev_incliner.class));
                } else if(position==2){
                    //click butterfly
                    startActivity(new Intent(pectoraux.this, butterfly.class));
                } else if(position==3){
                    //click poulie basse
                    startActivity(new Intent(pectoraux.this, poulie_basse.class));
                } else{

                }
            }
        });
    }
}
