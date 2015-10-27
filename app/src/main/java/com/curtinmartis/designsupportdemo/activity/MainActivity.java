package com.curtinmartis.designsupportdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;

import com.curtinmartis.designsupportdemo.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupActionBar();
        setupButtons();
    }

    private void setupActionBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void setupButtons() {
        findViewById(R.id.btn_snackbar).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackbarTapped();
            }
        });
        findViewById(R.id.btn_textInputLayout).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(TextInputLayoutActivity.class);
            }
        });
        findViewById(R.id.btn_fab).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showFabTapped();
            }
        });
        findViewById(R.id.btn_hideToolbar).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ToolbarHideActivity.class);
            }
        });
        findViewById(R.id.btn_navigationView).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(NavigationViewActivity.class);
            }
        });
        findViewById(R.id.btn_tabLayout).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(TabActivity.class);
            }
        });
        findViewById(R.id.btn_pinToolbar).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ToolbarPinActivity.class);
            }
        });
        findViewById(R.id.btn_parallax).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ToolbarParallaxActivity.class);
            }
        });
    }

    private void startActivity(Class clazz) {
        Intent i = new Intent(this, clazz);
        startActivity(i);
    }

    private void showSnackbarTapped() {
        View root = findViewById(R.id.root);
        Snackbar.make(root, R.string.txt_snackbar, Snackbar.LENGTH_LONG).show();
    }

    private void showFabTapped() {
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        if (fab.isShown()) {
            fab.hide();
        } else {
            fab.show();
        }
    }

}
