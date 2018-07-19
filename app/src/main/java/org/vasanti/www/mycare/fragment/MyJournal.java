package org.vasanti.www.mycare.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import org.vasanti.www.mycare.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyJournal extends Fragment {
    private static final String TAG = "MyJournal";

    public MyJournal() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_my_journal, container, false);
        BottomNavigationView bottomNavigationView = view.findViewById(R.id.journal_bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener()
                {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.add_journal_entry:
                            Log.i("add_journal_entry","Go to Activity for creating Journal");
                                Snackbar.make(view, "Received from user : Create Activity for creating Journal", Snackbar.LENGTH_LONG)
                                        .setAction("Action", null).show();
                            break;
                            case R.id.print_journal_entry:
                                Log.i("print_journal_entry","Go to Activity for printing Journal");
                                Snackbar.make(view, "Received from user : Create Activity for printing Journal", Snackbar.LENGTH_LONG)
                                        .setAction("Action", null).show();
                                break;
                            case R.id.email_journal_entry:
                                Log.i("email_journal_entry","Go to Activity for emailing Journal");
                                Snackbar.make(view, "Received from user : Create Activity for emailing Journal", Snackbar.LENGTH_LONG)
                                        .setAction("Action", null).show();
                                break;
                        }
                        return true;
                    }
                });
        return view;
      //  return inflater.inflate(R.layout.fragment_my_journal, container, false);
    }

}
