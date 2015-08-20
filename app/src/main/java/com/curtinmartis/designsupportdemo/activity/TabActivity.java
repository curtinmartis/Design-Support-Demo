package com.curtinmartis.designsupportdemo.activity;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.OnTabSelectedListener;
import android.support.design.widget.TabLayout.Tab;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.curtinmartis.designsupportdemo.R;
import com.curtinmartis.designsupportdemo.adapter.DemoPagerAdapter;

public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        setupActionBar();
        setupTabs();
    }

    private void setupActionBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void setupTabs() {
        String[] tabTitles = getResources().getStringArray(R.array.tab_titles);

        final ViewPager pager = (ViewPager) findViewById(R.id.view_pager);
        pager.setAdapter(new DemoPagerAdapter(getSupportFragmentManager(), tabTitles));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(pager);

        tabLayout.setOnTabSelectedListener(new OnTabSelectedListener() {
            @Override
            public void onTabSelected(Tab tab) {
                // Must set the pager's current item if you set on OnTabSelectedListener!
                pager.setCurrentItem(tab.getPosition(), true);
                Snackbar.make(pager, tab.getText() + " selected", Snackbar.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(Tab tab) {

            }

            @Override
            public void onTabReselected(Tab tab) {

            }
        });

    }

}
