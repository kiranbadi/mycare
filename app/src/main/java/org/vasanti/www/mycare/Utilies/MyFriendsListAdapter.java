package org.vasanti.www.mycare.Utilies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.vasanti.www.mycare.R;

public class MyFriendsListAdapter extends BaseAdapter {

    private Context context;
    private final String[] myfriendsItems;

    private Integer[] requestImages = {
            R.drawable.ic_3d_rotation_black_24dp,R.drawable.ic_accessible_black_24dp,
            R.drawable.ic_alarm_on_black_24dp,R.drawable.ic_accessibility_black_24dp,

    };

    public MyFriendsListAdapter(Context context, String[] myfriendsItems) {
        this.context = context;
        this.myfriendsItems = myfriendsItems;
    }

    @Override
    public int getCount() {
        return requestImages.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null) {
            view = new View(context);

            // get layout from mobile.xml
            view = inflater.inflate(R.layout.list_view_items, null);

            // set value into textview
            TextView textView = view.findViewById(R.id.list_item_label);
            textView.setText(myfriendsItems[i]);

            // set image based on selected text
            ImageView imageView = view.findViewById(R.id.list_item_image);
            imageView.setImageResource(requestImages[i]);
        }




        return view ;
    }
}
