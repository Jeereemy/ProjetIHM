package fr.jeremy.projetihm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class Dorsaux extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dorsaux);

        tabLayout = findViewById(R.id.tablayout_dorsaux);
        viewPager = findViewById(R.id.viewpager_dorsaux);

        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addfragment(new fragment_dorsaux1(), "Exercices");
        vpAdapter.addfragment(new fragment_dorsaux2(), "Performances");

        viewPager.setAdapter(vpAdapter);
    }


}