package com.example.toshiba.lover.Binder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.toshiba.lover.R;
import com.squareup.picasso.Picasso;
import com.yqritc.recyclerviewmultipleviewtypesadapter.DataBindAdapter;
import com.yqritc.recyclerviewmultipleviewtypesadapter.DataBinder;

/**
 * Created by susyimes on 2016/5/11.
 */
public class FirBinder extends DataBinder<FirBinder.ViewHolder> {



    public FirBinder(DataBindAdapter dataBindAdapter) {

        super(dataBindAdapter);
    }

    @Override
    public FirBinder.ViewHolder newViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.layout_fir, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void bindViewHolder(FirBinder.ViewHolder holder, final int position) {

        holder.textf1.setText("本周最佳");

        holder.textf2.setText("历史总榜");

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textf1;
        TextView textf2;

        public ViewHolder(View view) {
            super(view);
            textf1 = (TextView) view.findViewById(R.id.textf1);
            textf2 = (TextView) view.findViewById(R.id.textf2);

        }
    }
}
