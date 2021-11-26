package fr.jeremy.projetihm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.material.tabs.TabLayout;

public class dev_coucher extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    //private VideoView videoview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_coucher);

      /*  videoview = (VideoView) findViewById(R.id.videoview);

        Uri uri = Uri.parse("android.ressource://" + getPackageName() + "/" + R.raw.dev_coucher);
        videoview.setVideoURI(uri);
    }
        @Override
        protected void onResume() {
            super.onResume();
            videoview.start();*/

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addfragment(new Fragment1(), "Exercices");
        vpAdapter.addfragment(new Fragment2(), "Description");

        viewPager.setAdapter(vpAdapter);
    }

}
