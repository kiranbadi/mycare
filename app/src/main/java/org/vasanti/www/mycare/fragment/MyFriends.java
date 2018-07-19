package org.vasanti.www.mycare.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.vasanti.www.mycare.R;
import org.vasanti.www.mycare.Utilies.MyFriendsListAdapter;
import org.vasanti.www.mycare.activity.HomeActivity;
import org.vasanti.www.mycare.activity.InviteFriendsActivity;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MyFriends.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MyFriends#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyFriends extends Fragment {
    ListView myfriendsList;

    private static final String TAG = "MyFriends";

    String[] myfriendsArray = new String[4];
    public MyFriends() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_my_friends, container, false);

        Resources res = getResources();
        myfriendsArray = res.getStringArray(R.array.myfriendsitemsArray);
        myfriendsList = view.findViewById(R.id.myfriends_list);
        myfriendsList.setAdapter(new MyFriendsListAdapter(getActivity(), myfriendsArray));
        myfriendsList.setOnItemClickListener(new AdapterView.OnItemClickListener()
            // TODO : Application is crashing here on list item click.
        {
            public void onItemClick(AdapterView<?> parent, View v,int position, long id) {
              Toast.makeText(getActivity(),((TextView)v.findViewById(R.id.list_item_label)).getText(), Toast.LENGTH_LONG).show();

            }
        });


        // Invite friends on button click event
        Button inviteFriendsButton = view.findViewById(R.id.add_my_friends_button);
        inviteFriendsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d(TAG, "Clicked Invite Friends button");
                //      Intent intent = new Intent(view.getContext(),DashBoard.class);
                Intent intent = new Intent(view.getContext(),InviteFriendsActivity.class);
                Log.i("OnButton Click","Redirect to view - Invite friends view Activity");
                startActivity(intent);
//                finish();
                //  login();
            }
        });
        return view;
       // return inflater.inflate(R.layout.fragment_my_friends, container, false);
    }



}
