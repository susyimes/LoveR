package com.example.toshiba.lover.Binder;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.toshiba.lover.R;
import com.example.toshiba.lover.viewPager.LoopViewPager;
import com.example.toshiba.lover.viewPager.adapter.SamplePagerAdapter;
import com.squareup.picasso.Picasso;
import com.yqritc.recyclerviewmultipleviewtypesadapter.DataBindAdapter;
import com.yqritc.recyclerviewmultipleviewtypesadapter.DataBinder;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;
import me.relex.circleindicator.CircleIndicator;

/**
 * Created by susyimes on 2016/5/11.
 */
public class HeadBinder extends DataBinder<HeadBinder.ViewHolder> {
    public HeadBinder(DataBindAdapter dataBindAdapter) {
        super(dataBindAdapter);
    }

    @Override
    public HeadBinder.ViewHolder newViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.layout_head, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void bindViewHolder(HeadBinder.ViewHolder holder, int position) {
       /* Picasso.with(holder.imgtest.getContext())
                .load(R.mipmap.backpic2)
                .into(holder.imgtest);*/
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        AutoScrollViewPager viewpager;
        CircleIndicator indicator;
        public ViewHolder(View view) {
            super(view);
            viewpager=(AutoScrollViewPager) view.findViewById(R.id.viewpager);
            indicator = (CircleIndicator) view.findViewById(R.id.indicator);
            viewpager.setAdapter(new SamplePagerAdapter());
            viewpager.startAutoScroll();
            viewpager.setInterval(5000);
            //系统UI控件的显示
            //visibility	Bitwise-or of flags SYSTEM_UI_FLAG_LOW_PROFILE, SYSTEM_UI_FLAG_HIDE_NAVIGATION, and SYSTEM_UI_FLAG_FULLSCREEN.
            // This tells you the global state of these UI visibility flags, not what your app is currently applying.
           /* view.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                @Override
                public void onSystemUiVisibilityChange(int visibility) {

                }
            });*/

          //  it's dosen't work because itercept
        /*    view.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if (event.getAction()==MotionEvent.ACTION_DOWN||event.getAction()==MotionEvent.ACTION_SCROLL) {
                        viewpager.stopAutoScroll();
                    }
                    return false;

                }
            });*/
           // viewpager.setStopScrollWhenTouch(true);
          /*  viewpager.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    if (event.getAction()==MotionEvent.ACTION_DOWN||event.getAction()==MotionEvent.ACTION_SCROLL) {
                        viewpager.stopAutoScroll();
                    }
                    return false;
                }
            });*/
            indicator.setViewPager(viewpager);

        }
    }
}
