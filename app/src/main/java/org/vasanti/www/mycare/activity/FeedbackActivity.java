package org.vasanti.www.mycare.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import org.vasanti.www.mycare.R;

public class FeedbackActivity extends AppCompatActivity {
    private static final String TAG = "FeedbackActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        Toolbar toolbar = findViewById(R.id.toolbar);
        if(toolbar !=null){
            setSupportActionBar(toolbar);
        }

    }
}
