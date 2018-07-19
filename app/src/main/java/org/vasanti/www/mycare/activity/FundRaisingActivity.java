package org.vasanti.www.mycare.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import org.vasanti.www.mycare.R;

public class FundRaisingActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.fund_raising_menu_view:
                    Snackbar.make(getWindow().getDecorView().getRootView(), "Received from user : Create Activity for View Funds Events", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                //    mTextMessage.setText(R.string.fundraising_view);
                    return true;
                case R.id.fund_raising_menu_create:
                    Snackbar.make(getWindow().getDecorView().getRootView(), "Received from user : Create Activity for Create Funds Events", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
             //       mTextMessage.setText(R.string.fundraising_create);
                    return true;
                case R.id.fund_raising_menu_remainder:
                    Snackbar.make(getWindow().getDecorView().getRootView(), "Received from user : Create Activity for Sending out Remainder for Funds Events", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
               //     mTextMessage.setText(R.string.fundraising_ask);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fund_raising);
        Toolbar toolbar = findViewById(R.id.toolbar);
        if(toolbar != null){
            setSupportActionBar(toolbar);
        }
        mTextMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.fundraising_menu_id);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
