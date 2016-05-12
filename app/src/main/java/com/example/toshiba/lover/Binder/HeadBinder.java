package com.example.toshiba.lover.Binder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
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
        LoopViewPager viewpager;
        CircleIndicator indicator;
        public ViewHolder(View view) {
            super(view);
            viewpager=(LoopViewPager) view.findViewById(R.id.viewpager);
            indicator = (CircleIndicator) view.findViewById(R.id.indicator);
            viewpager.setAdapter(new SamplePagerAdapter());
            indicator.setViewPager(viewpager);

        }
    }
}
