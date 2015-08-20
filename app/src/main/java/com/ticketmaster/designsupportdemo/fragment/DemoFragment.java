package com.ticketmaster.designsupportdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ticketmaster.designsupportdemo.R;

public class DemoFragment extends Fragment {

    public static final String KEY_TITLE = "KEY_TITLE";

    public static Fragment newInstance(String title) {
        Bundle args = new Bundle();
        args.putString(KEY_TITLE, title);

        Fragment fragment = new DemoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        TextView text = (TextView) v.findViewById(R.id.txt_fragment_title);
        text.setText(getArguments().getString(KEY_TITLE, ""));

        return v;
    }

}
