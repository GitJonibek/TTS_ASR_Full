package com.example.jonib.tts_full_app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.jonib.tts_full_app.R;
import com.example.jonib.tts_full_app.model.DataModel;
import java.util.ArrayList;

/**
 * Created by jonib on 3/15/2018.
 */

public class CustomAdapter extends ArrayAdapter<DataModel> implements View.OnClickListener{

    private Context mContext;
    private LayoutInflater inflater;
    private ArrayList<DataModel> array;

    public CustomAdapter(Context mContext, ArrayList<DataModel> array) {
        super(mContext, R.layout.list_items_layout, array);
        this.mContext = mContext;
        this.array = array;
    }

    @Override
    public void onClick(View view) {
        int position = (Integer) view.getTag();
        Object object = getItem(position);
        DataModel dataModel = (DataModel)object;

        switch (view.getId())
        {
            case R.id.image_view:
                dataModel.getImageView();
                break;
        }
    }

    private static class ViewHolder {
        ImageView image;
        TextView title;
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DataModel dataModel = getItem(position);
        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_items_layout, parent, false);

            viewHolder.title = convertView.findViewById(R.id.title_of_items);
            viewHolder.image = convertView.findViewById(R.id.image_view);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        result.startAnimation(animation);
        lastPosition = position;

        viewHolder.title.setText(dataModel.getTitle());
        viewHolder.image.setOnClickListener(this);
        viewHolder.image.setTag(position);
        return convertView;
    }

}
