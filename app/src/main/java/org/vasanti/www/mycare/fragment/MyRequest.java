package org.vasanti.www.mycare.fragment;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import org.vasanti.www.mycare.R;
import org.vasanti.www.mycare.Utilies.DashboardAdapter;
import org.vasanti.www.mycare.Utilies.MyRequestAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyRequest extends Fragment {

    private static final String TAG = "MyRequest";

    GridView gridView;
    String[] reqitems = new String[10];

    public MyRequest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_request, container, false);
        Resources res = getResources();
        reqitems = res.getStringArray(R.array.myRequestArray);
        gridView = view.findViewById(R.id.myrequest_grid_view);
        gridView.setAdapter(new MyRequestAdapter(getActivity(), reqitems));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View v,int position, long id) {
                Toast.makeText(getActivity(),((TextView)v.findViewById(R.id.grid_item_label)).getText(), Toast.LENGTH_SHORT).show();

            }
        });

        FloatingActionButton fab = view.findViewById(R.id.myrequestfab);
        if(fab!=null) {
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Received from user : Create Activity for request", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }
        return view;
       // return inflater.inflate(R.layout.fragment_my_request, container, false);
    }

    protected void setFragment(Fragment fragment) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, fragment);
        fragmentTransaction.commit();
    }

}
