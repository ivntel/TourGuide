package com.example.ivnte.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ivnte on 2016-09-29.
 */
public class ListViewAdapter extends BaseAdapter {
    private Context mContext;
    private final SiteDetails [] siteDetails;


    public ListViewAdapter(Context c, SiteDetails[] siteDetails) {
        mContext = c;
        this.siteDetails = siteDetails;

    }
    public int getCount() { // TODO Auto-generated method stub

        return siteDetails.length;
    }
    @Override
    public Object getItem(int position) { // TODO Auto-generated method stub

        return null;
    }
    @Override public long getItemId(int position) { // TODO Auto-generated method stub

        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) { // TODO Auto-generated method stub
        View list;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            list = inflater.inflate(R.layout.listview_layout, parent, false);
            TextView name = (TextView) list.findViewById(R.id.site_name);
            ImageView img = (ImageView) list.findViewById(R.id.site_image);

            name.setText(siteDetails[position].getSiteName());
            img.setImageResource(siteDetails[position].getSiteIcon());

        }else{
            list = convertView;
        }
        return list;
    }
}