package org.vasanti.www.mycare.Utilies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.vasanti.www.mycare.R;

public class DashboardAdapter extends BaseAdapter {

    private Context context;
    private final String[] dashboardItems;

    private Integer[] dashImages = {
            R.drawable.ic_3d_rotation_black_24dp,R.drawable.ic_accessible_black_24dp,
            R.drawable.ic_alarm_on_black_24dp,R.drawable.ic_accessibility_black_24dp,
            R.drawable.ic_account_balance_black_24dp,R.drawable.ic_account_circle_black_24dp,
            R.drawable.ic_all_out_black_24dp,R.drawable.ic_zoom_out_black_24dp,
            R.drawable.ic_youtube_searched_for_black_24dp,R.drawable.ic_visibility_black_24dp,
    };

    public DashboardAdapter(Context context, String[] dashboardItems) {
        this.context = context;
        this.dashboardItems = dashboardItems;
    }

    @Override
    public int getCount() {
        return dashImages.length;
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
            view = inflater.inflate(R.layout.grid_view_items, null);

            // set value into textview
            TextView textView = view.findViewById(R.id.grid_item_label);
            textView.setText(dashboardItems[i]);

            // set image based on selected text
            ImageView imageView = view.findViewById(R.id.grid_item_image);
            imageView.setImageResource(dashImages[i]);
        }




        return view ;
    }
}
