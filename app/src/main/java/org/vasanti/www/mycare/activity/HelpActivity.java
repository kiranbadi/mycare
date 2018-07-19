package org.vasanti.www.mycare.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import org.vasanti.www.mycare.R;

public class HelpActivity extends AppCompatActivity {
    private static final String TAG = "HelpActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(toolbar !=null){
            setSupportActionBar(toolbar);
        }

    }
}
