    package org.vasanti.www.mycare.activity;

    import android.content.Intent;
    import android.net.Uri;
    import android.support.design.widget.NavigationView;
    import android.support.v4.app.Fragment;
    import android.support.v4.app.FragmentTransaction;
    import android.support.v4.view.GravityCompat;
    import android.support.v4.widget.DrawerLayout;
    import android.support.v7.app.ActionBarDrawerToggle;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.support.v7.widget.Toolbar;
    import android.util.Log;
    import android.view.MenuItem;

    import org.vasanti.www.mycare.MainActivity;
    import org.vasanti.www.mycare.R;
    import org.vasanti.www.mycare.fragment.DashboardFragment;
    import org.vasanti.www.mycare.fragment.MessagesFragment;
    import org.vasanti.www.mycare.fragment.MyFriends;
    import org.vasanti.www.mycare.fragment.MyProfileFragment;

    public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

        private static final String TAG = "HomeActivity";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home);
            Toolbar toolbar = findViewById(R.id.toolbar);
            if(toolbar != null){
                setSupportActionBar(toolbar);
            }
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            if(drawer != null) {
                ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                        this,
                        drawer,
                        toolbar,
                        R.string.drawer_open,
                        R.string.drawer_close);
                drawer.addDrawerListener(toggle);
                toggle.syncState();
            }
             else {
                Log.e("Drawer"," is null");
            }

            NavigationView navigationView = findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);
            Fragment fragment = new DashboardFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.content_frame, fragment);
            ft.commit();
        }



        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            int id = item.getItemId();
            Fragment fragment = null;
            Intent intent = null;
            switch(id) {

                case R.id.nav_messages:
                    fragment = new MessagesFragment();
                    break;

                case R.id.nav_myprofile:
                    fragment = new MyProfileFragment();
                    break;

                case R.id.nav_help:
                    intent = new Intent(this, HelpActivity.class);
                    break;

                case R.id.nav_terms_conditions:
                    intent = new Intent(this, FeedbackActivity.class);
                    break;
                case R.id.signout:
                    intent = new Intent(this,MainActivity.class);
                    break;
                default:
                    fragment = new DashboardFragment();

            }



            if (fragment != null) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.content_frame, fragment);
                ft.commit();
            } else {
                startActivity(intent);
            }



            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
            }



        @Override
        public void onBackPressed() {
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }

        }


    }
