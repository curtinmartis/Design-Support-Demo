package com.ticketmaster.designsupportdemo.activity;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;

import com.ticketmaster.designsupportdemo.R;

public class TextInputLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input);
        setupActionBar();
        setupErrorButton();
    }

    private void setupActionBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void setupErrorButton() {
        findViewById(R.id.btn_show_error).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputLayout textInput = (TextInputLayout) findViewById(R.id.txt_input_2);
                textInput.setError(getString(R.string.txt_input_error));
            }
        });
    }

}
