package com.example.toshiba.lover.Binder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.toshiba.lover.R;
import com.yqritc.recyclerviewmultipleviewtypesadapter.DataBindAdapter;
import com.yqritc.recyclerviewmultipleviewtypesadapter.DataBinder;

/**
 * Created by susyimes on 2016/5/11.
 */
public class YelpBinder extends DataBinder<YelpBinder.ViewHolder> {



    public YelpBinder(DataBindAdapter dataBindAdapter) {

        super(dataBindAdapter);
    }

    @Override
    public YelpBinder.ViewHolder newViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.layout_yelp, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void bindViewHolder(YelpBinder.ViewHolder holder, final int position) {



    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(View view) {
            super(view);


        }
    }
}
