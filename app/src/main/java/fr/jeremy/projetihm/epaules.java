package fr.jeremy.projetihm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class epaules extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epaules);

        tabLayout = findViewById(R.id.tablayout_epaules);
        viewPager = findViewById(R.id.viewpager_epaules);

        tabLayout.setupWithViewPager(viewPager);

        VPAdapter_epaules vpAdapter = new VPAdapter_epaules(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addfragment(new Fragment_epaules(), "Exercices");
        vpAdapter.addfragment(new Fragment_epaules2(), "Description");

        viewPager.setAdapter(vpAdapter);
    }


}