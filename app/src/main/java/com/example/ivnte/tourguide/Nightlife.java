package com.example.ivnte.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by ivnte on 2016-09-29.
 */
public class Nightlife extends Fragment {
    ListView mList;
    private String mSiteName;
    private String mSiteAddress;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.nightlife_layout, container, false);
        final SiteDetails site_nightlife_data[] = new SiteDetails[]
                {
                        new SiteDetails(getContext().getString(R.string.nightlife1Name),
                                getContext().getString(R.string.nightlife1Address), R.mipmap.ic_launcher),
                        new SiteDetails(getContext().getString(R.string.nightlife2Name),
                                getContext().getString(R.string.nightlife2Address), R.mipmap.ic_launcher),
                        new SiteDetails(getContext().getString(R.string.nightlife3Name),
                                getContext().getString(R.string.nightlife3Address), R.mipmap.ic_launcher)
                };

        mList = (ListView) view.findViewById(R.id.list);
        mList.setAdapter(new ListViewAdapter(view.getContext(), site_nightlife_data));

        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SiteDetails current = site_nightlife_data[position];
                mSiteName = current.getSiteName();
                mSiteAddress = current.getSiteAddress();

                Intent intent = new Intent(getActivity(), SiteDetailsActivity.class);
                intent.putExtra("siteName",mSiteName);
                intent.putExtra("siteAddress",mSiteAddress);
                startActivity(intent);
            }
        });
        return view;
    }
}
