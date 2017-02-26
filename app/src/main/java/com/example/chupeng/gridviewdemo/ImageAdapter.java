package com.example.chupeng.gridviewdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;

/**
 * Created by ChuPeng on 2017/2/25.
 */

public class ImageAdapter extends BaseAdapter
{
    private Context context;
    private List<Bitmap> list;

    public ImageAdapter(Context context, List<Bitmap> list)
    {
        this.context = context;
        this.list = list;
    }

    public int getCount()
    {
        return list.size();
    }

    public Object getItem(int position)
    {
        return list.get(position);
    }

    public long getItemId(int position)
    {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup viewGroup)
    {
        Bitmap bitmap = list.get(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null)
        {
            view = LayoutInflater.from(context).inflate(R.layout.gridview_item, null);
            viewHolder = new ViewHolder();
            viewHolder.squareImage = (SquareImageView) view.findViewById(R.id.squareImage);
            //将ViewHolder存储在view中
            view.setTag(viewHolder);
        }
        else
        {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.squareImage.setImageBitmap(bitmap);
        return view;
    }

    class ViewHolder
    {
        SquareImageView squareImage;
    }
}
