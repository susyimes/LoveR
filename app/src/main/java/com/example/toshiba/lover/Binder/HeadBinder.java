package com.example.toshiba.lover.Binder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.toshiba.lover.R;
import com.squareup.picasso.Picasso;
import com.yqritc.recyclerviewmultipleviewtypesadapter.DataBindAdapter;
import com.yqritc.recyclerviewmultipleviewtypesadapter.DataBinder;

/**
 * Created by toshiba on 2016/5/11.
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
        Picasso.with(holder.imgtest.getContext())
                .load(R.mipmap.backpic2)
                .into(holder.imgtest);
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text1;
        ImageView imgtest;
        public ViewHolder(View view) {
            super(view);
            text1 = (TextView) view.findViewById(R.id.text1);
           imgtest = (ImageView) view.findViewById(R.id.imgtest);
        }
    }
}
