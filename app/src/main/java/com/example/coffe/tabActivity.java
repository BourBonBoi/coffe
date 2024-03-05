package com.example.coffe;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.example.coffe.ui.main.SectionsPagerAdapter;
import com.example.coffe.databinding.ActivityTabBinding;

public class tabActivity extends MainActivity{

    private ActivityTabBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTabBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);

        tabs.getSelectedTabPosition();
        tabs.getTabAt(0).setIcon(R.drawable.home);
        tabs.getTabAt(1).setIcon(R.drawable.heart);
        tabs.getTabAt(2).setIcon(R.drawable.bag);
        tabs.getTabAt(3).setIcon(R.drawable.notification);
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Устанавливаем иконку только для выбранной вкладки
                if(tab.getPosition() == 0){
                    tab.setIcon(R.drawable.home_active);
                } else if(tab.getPosition() == 1){
                    tab.setIcon(R.drawable.heart_active);
                }else if(tab.getPosition() == 2){
                    tab.setIcon(R.drawable.bag_active);
                }else if(tab.getPosition() == 3){
                    tab.setIcon(R.drawable.notification_active);
                }
            }

            public void onTabUnselected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){
                    tab.setIcon(R.drawable.home);
                } else if(tab.getPosition() == 1){
                    tab.setIcon(R.drawable.heart);
                }else if(tab.getPosition() == 1){
                    tab.setIcon(R.drawable.bag);
                }else if(tab.getPosition() == 1){
                    tab.setIcon(R.drawable.notification);
                }
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){
                    tab.setIcon(R.drawable.home_active);
                } else if(tab.getPosition() == 1){
                    tab.setIcon(R.drawable.heart_active);
                }else if(tab.getPosition() == 2){
                    tab.setIcon(R.drawable.bag_active);
                }else if(tab.getPosition() == 3){
                    tab.setIcon(R.drawable.notification_active);
                }
            }
        });

    }
}