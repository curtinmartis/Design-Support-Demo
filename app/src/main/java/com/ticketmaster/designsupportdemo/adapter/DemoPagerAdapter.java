package com.ticketmaster.designsupportdemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.ticketmaster.designsupportdemo.fragment.DemoFragment;

public class DemoPagerAdapter extends FragmentPagerAdapter {

    private String[] titles;

    public DemoPagerAdapter(android.support.v4.app.FragmentManager fm, String[] titles) {
        super(fm);
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return DemoFragment.newInstance(titles[position]);
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}
