package com.example.toshiba.lover.Binder;

import android.content.Context;
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
public class CardBinder extends DataBinder<CardBinder.ViewHolder> {
    public CardBinder(DataBindAdapter dataBindAdapter) {
        super(dataBindAdapter);
    }
    private Context context;


    public interface OnItemClickLitener
    {
        void onItemClick(View view, int position);

        void onItemLongClick(View view, int position);
    }

    private OnItemClickLitener mOnItemClickLitener;

    public void setOnItemClickLitener(OnItemClickLitener mOnItemClickLitener)
    {
        this.mOnItemClickLitener = mOnItemClickLitener;
    }

    @Override
    public CardBinder.ViewHolder newViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.layout_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void bindViewHolder(final CardBinder.ViewHolder holder, int position) {

        Picasso.with(holder.imgc1.getContext())
                .load(R.mipmap.pepsi)
                .into(holder.imgc1);
        if(mOnItemClickLitener!=null){
            holder.imgc1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = holder.getLayoutPosition();
                    mOnItemClickLitener.onItemClick(holder.itemView, pos);

                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return 103;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text1;
        ImageView imgc1,imgc2;
        public ViewHolder(View view) {
            super(view);

           imgc1 = (ImageView) view.findViewById(R.id.imgc1);

    }
    }
}
