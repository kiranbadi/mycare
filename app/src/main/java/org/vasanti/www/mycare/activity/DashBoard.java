package org.vasanti.www.mycare.activity;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import org.vasanti.www.mycare.R;
import org.vasanti.www.mycare.Utilies.DashboardAdapter;
import org.vasanti.www.mycare.fragment.DashboardFragment;

public class DashBoard extends AppCompatActivity {

    private static final String TAG = "DashBoard";

    GridView gridView;
    String[] dashboarditems = new String[10];



    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        Toolbar toolbar = findViewById(R.id.toolbar);
        if(toolbar != null){
            setSupportActionBar(toolbar);
        }
        Resources res = getResources();
        dashboarditems = res.getStringArray(R.array.dashboarditemsArray);
        gridView = findViewById(R.id.dashboard_grid_view);

        gridView.setAdapter(new DashboardAdapter(this, dashboarditems));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View v,int position, long id) {
                switch (position) {
                    case 0:
                        Fragment dashfragment = new DashboardFragment();
                        getSupportFragmentManager().findFragmentById(R.id.all_tabs);
                        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                        setFragment(dashfragment);
                        break;
                    case 1:
                        break;

                }
            //    Toast.makeText(getApplicationContext(),((TextView)v.findViewById(R.id.grid_item_label)).getText(), Toast.LENGTH_SHORT).show();

            }
        });

    }

    protected void setFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, fragment);
        fragmentTransaction.commit();
    }
}
