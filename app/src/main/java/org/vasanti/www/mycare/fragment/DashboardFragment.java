package org.vasanti.www.mycare.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import org.vasanti.www.mycare.R;
import org.vasanti.www.mycare.Utilies.TabsPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {
    private static final String TAG = "DashboardFragment";

    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard,container, false);
        // Setting ViewPager for each Tabs
        final ViewPager viewPager = view.findViewById(R.id.viewpager);

        setupViewPager(viewPager);
        // Set Tabs inside Toolbar
        TabLayout tabs = view.findViewById(R.id.all_tabs);
        tabs.setupWithViewPager(viewPager);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = null;
             //   viewPager.setCurrentItem(tab.getPosition());
                switch (tab.getPosition()) {
                    case 0:
                        // adapter.addFragment(new MyAppointment(), "My Appointments");
                        fragment = new MyAppointment();
                        break;
                    case 1:
                      //  adapter.addFragment(new MyFriends(), "My Friends");
                        fragment = new MyFriends();
                        break;
                    case 2:
                        // adapter.addFragment(new MyJournal(), "My Journal");
                        fragment = new MyJournal();
                        break;
                    case 3:
                        //  adapter.addFragment(new MyRequest(), "My Request");
                        fragment = new MyRequest();
                        break;
                    case 4:
                        // adapter.addFragment(new MyDoctor(), "My Doctor");
                        fragment = new MyDoctor();
                        break;
                    case 5:
                        fragment = new MyHealth();
                        break;
                    case 6:
                        fragment = new MyPharmacy();
                        break;
                    case 7:
                        fragment = new MyTreatment();
                        break;
                    case 8:
                        fragment = new MyGallery();
                        break;
                }
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.simpleFrameLayout, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
               }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });
        return view;
    }

    // Add Fragments to Tabs
    private void setupViewPager(ViewPager viewPager) {
        Adapter adapter = new Adapter(getChildFragmentManager());
        adapter.addFragment(new MyAppointment(), "My Appointments");
        adapter.addFragment(new MyFriends(), "My Friends");
        adapter.addFragment(new MyJournal(), "My Journal");
        adapter.addFragment(new MyRequest(), "My Request");
        adapter.addFragment(new MyDoctor(), "My Doctor");
        adapter.addFragment(new MyHealth(), "My Health");
        adapter.addFragment(new MyPharmacy(), "My Pharmacy");
        adapter.addFragment(new MyTreatment(), "My Treatment");
        adapter.addFragment(new MyGallery(),"My Gallery");
        viewPager.setAdapter(adapter);
    }
    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public Adapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }



}
