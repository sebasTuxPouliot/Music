package com.example.spouliot.music;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by spouliot on 17-11-01.
 */

public class AlbumSummary extends Fragment implements View.OnClickListener {
    private boolean mTwoPane;

    public AlbumSummary() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.album_summary, container, false);
        ImageView thumbnail = (ImageView) v.findViewById(R.id.ivPictureThumbnail);
        thumbnail.setOnClickListener(this);
        if(getActivity().findViewById(R.id.main_landscape) != null)
            mTwoPane = true;
        else
            mTwoPane = false;
        return v;
    }

    @Override
    public void onClick(View v) {
        AlbumDetails albumDetails = new AlbumDetails();

        if(mTwoPane){
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().add(R.id.fl_details, albumDetails).commit();
        } else {
            Context c = getContext();
            Intent intent = new Intent(c, AlbumDetailsActivity.class);
            c.startActivity(intent);
        }
    }
}
