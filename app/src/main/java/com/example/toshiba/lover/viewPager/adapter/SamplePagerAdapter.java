package com.example.toshiba.lover.viewPager.adapter;

import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.toshiba.lover.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SamplePagerAdapter extends PagerAdapter {

    private final Random random = new Random();
    private int mSize;
    private List<Integer> imglist=new ArrayList();

    public void  addimg(){
        imglist.add(R.drawable.a02);
        imglist.add(R.drawable.a03);
        imglist.add(R.drawable.a04);
        imglist.add(R.drawable.a05);
        imglist.add(R.drawable.a06);
        imglist.add(R.drawable.a07);
        imglist.add(R.drawable.a08);
        imglist.add(R.drawable.a09);

    }

    public SamplePagerAdapter() {
       addimg();
        mSize = imglist.size();
    }

    public SamplePagerAdapter(int count) {
        mSize = count;
    }

    @Override public int getCount() {
        return mSize;
    }

    @Override public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override public void destroyItem(ViewGroup view, int position, Object object) {
        view.removeView((View) object);
    }

    @Override public Object instantiateItem(ViewGroup view, int position) {

        ImageView img=new ImageView(view.getContext());

          Picasso.with(img.getContext())
                .load(imglist.get(position))
                .into(img);
        img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.addView(img, ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        return img;
    }

    public void addItem() {
        mSize++;
        notifyDataSetChanged();
    }

    public void removeItem() {
        mSize--;
        mSize = mSize < 0 ? 0 : mSize;

        notifyDataSetChanged();
    }
}