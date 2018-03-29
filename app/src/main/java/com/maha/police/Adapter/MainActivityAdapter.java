package com.maha.police.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.maha.police.R;

/**
 * Created by sudnya-002 on 28/03/18.
 */

public class MainActivityAdapter extends BaseAdapter {

    private Context mContext;
    private final String[] gridViewString;
    private final int[] gridViewImageId;

    public MainActivityAdapter(Context context, String[] gridViewString, int[] gridViewImageId) {
        mContext = context;
        this.gridViewImageId = gridViewImageId;
        this.gridViewString = gridViewString;
    }

    @Override
    public int getCount() {
        return gridViewString.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

           /* gridViewAndroid = new View(mContext);*/
            gridViewAndroid = inflater.inflate(R.layout.grid_item_layout, null);
            TextView textViewAndroid = gridViewAndroid.findViewById(R.id.nameTxt);
            ImageView imageViewAndroid = gridViewAndroid.findViewById(R.id.spacecraftImg);
            textViewAndroid.setText(gridViewString[i]);
            imageViewAndroid.setImageResource(gridViewImageId[i]);
        } else {
            gridViewAndroid = convertView;
        }

        return gridViewAndroid;
    }
}