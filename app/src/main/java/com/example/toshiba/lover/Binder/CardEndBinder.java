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

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by toshiba on 2016/5/11.
 */
public class CardEndBinder extends DataBinder<CardEndBinder.ViewHolder> {
    private Context context;
    private List<Integer> imglist=new ArrayList();
    private List<Integer> imglist2=new ArrayList();
    public CardEndBinder(DataBindAdapter dataBindAdapter) {

        super(dataBindAdapter);
        for (int i=0;i<100;i++){
            addimg();
      }

    }


    public void  addimg(){
        imglist.add(R.drawable.a14);
        imglist.add(R.drawable.a13);
        imglist.add(R.drawable.a04);
        imglist.add(R.drawable.a05);
        imglist.add(R.drawable.a06);
        imglist.add(R.drawable.a07);
        imglist.add(R.drawable.a08);
        imglist.add(R.drawable.a09);
        imglist.add(R.drawable.a01);
        imglist.add(R.drawable.a11);
        imglist.add(R.drawable.a12);
        imglist.add(R.drawable.a13);
        imglist.add(R.drawable.a14);

        imglist2.add(R.mipmap.suscustom);
        imglist2.add(R.drawable.a01);
        imglist2.add(R.drawable.a07);
        imglist2.add(R.drawable.a08);
        imglist2.add(R.drawable.a09);
        imglist2.add(R.mipmap.suscustom);
        imglist2.add(R.drawable.a01);
        imglist2.add(R.drawable.a11);
        imglist2.add(R.drawable.a12);
        imglist2.add(R.mipmap.suscustom);
        imglist2.add(R.drawable.a13);
        imglist2.add(R.drawable.a14);
        imglist2.add(R.mipmap.suscustom);


    }



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
    public CardEndBinder.ViewHolder newViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.layout_card, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void bindViewHolder(final CardEndBinder.ViewHolder holder, int position) {

        Picasso.with(holder.imgc1.getContext())
                .load(imglist.get(position)).fit().centerCrop()
                .into(holder.imgc1);
        Picasso.with(holder.imghead.getContext())
                .load(imglist2.get(position)).fit().centerCrop()
                .into(holder.imghead);
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

        return imglist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView text1;
        ImageView imgc1,imgc2;
        CircleImageView imghead;
        public ViewHolder(View view) {
            super(view);

           imgc1 = (ImageView) view.findViewById(R.id.imgc1);
            imghead= (CircleImageView) view.findViewById(R.id.imghead);

    }
    }
}
