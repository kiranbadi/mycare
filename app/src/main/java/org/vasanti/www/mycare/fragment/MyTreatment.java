package org.vasanti.www.mycare.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.vasanti.www.mycare.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MyTreatment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MyTreatment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyTreatment extends Fragment {


    public MyTreatment() {
        // Required empty public constructor
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_treatment, container, false);
    }





}
