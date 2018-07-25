package org.vasanti.www.mycare.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.vasanti.www.mycare.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MyGallery.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MyGallery#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyGallery extends Fragment {


    public MyGallery() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_gallery, container, false);
      //  return inflater.inflate(R.layout.fragment_my_gallery, container, false);

        FloatingActionButton fab = view.findViewById(R.id.gallery_take_picture);
        if(fab!=null) {
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Taking Pictures", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }
        return view;
    }



}
