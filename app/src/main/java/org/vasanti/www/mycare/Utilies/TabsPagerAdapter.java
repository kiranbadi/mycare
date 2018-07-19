package org.vasanti.www.mycare.Utilies;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import org.vasanti.www.mycare.fragment.MessagesFragment;
import org.vasanti.www.mycare.fragment.MyAppointment;
import org.vasanti.www.mycare.fragment.MyDoctor;
import org.vasanti.www.mycare.fragment.MyFriends;
import org.vasanti.www.mycare.fragment.MyGallery;
import org.vasanti.www.mycare.fragment.MyHealth;
import org.vasanti.www.mycare.fragment.MyJournal;
import org.vasanti.www.mycare.fragment.MyNotes;
import org.vasanti.www.mycare.fragment.MyPharmacy;
import org.vasanti.www.mycare.fragment.MyRequest;
import org.vasanti.www.mycare.fragment.MyTreatment;

public class TabsPagerAdapter extends FragmentPagerAdapter {
    int NumOfTabs;

    public TabsPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.NumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                MyAppointment myAppointmentFragmentTab = new MyAppointment();
                return myAppointmentFragmentTab;
            case 1:
                MyDoctor  myDoctorFragmentTab = new MyDoctor();
                return myDoctorFragmentTab;
            case 2:
                MyFriends myFriendsTab = new MyFriends();
                return myFriendsTab;
            case 3:
                MyHealth myHealthTab = new MyHealth();
                return myHealthTab;
            case 4:
                MyJournal myJournalTab = new MyJournal();
                return myJournalTab;
            case 5:
                MyNotes myNotesTab = new MyNotes();
                return myNotesTab;
            case 6:
                MyPharmacy myPharmacyTab = new MyPharmacy();
                return myPharmacyTab;
            case 7:
                MyRequest myRequestTab = new MyRequest();
                return myRequestTab;
            case 8:
                MyTreatment myTreatmentTab = new MyTreatment();
                return myTreatmentTab;
            case 9:
                MyGallery myGalleryTab = new MyGallery();
                return myGalleryTab;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NumOfTabs;
    }

}
