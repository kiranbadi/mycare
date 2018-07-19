package org.vasanti.www.mycare.fragment;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;

import org.vasanti.www.mycare.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyAppointment extends Fragment {

    CalendarView calendar;
    public MyAppointment() {
        // Required empty public constructor
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_appointment, container, false);
        CalendarView calendar = view.findViewById(R.id.appointmentcalendarView);

        if(calendar!=null){
           // calendar.setShowWeekNumber(false);
            calendar.setDate(calendar.getDate());
            calendar.setSelectedDateVerticalBar(R.color.colorPrimaryDark);

        }
        FloatingActionButton fab = view.findViewById(R.id.appointmentfab);
        if(fab!=null) {
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Go and make appointment for user", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }
        return view;
    }

}
