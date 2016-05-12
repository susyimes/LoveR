package com.example.toshiba.lover.BindersAdapter;

import android.content.Context;
import android.view.View;

import com.example.toshiba.lover.Binder.CardBinder;
import com.example.toshiba.lover.Binder.CardEndBinder;
import com.example.toshiba.lover.Binder.FirBinder;
import com.example.toshiba.lover.Binder.HeadBinder;
import com.example.toshiba.lover.Binder.HeartBinder;
import com.example.toshiba.lover.Binder.StarBinder;
import com.example.toshiba.lover.Binder.YelpBinder;
import com.yqritc.recyclerviewmultipleviewtypesadapter.ListBindAdapter;

import java.util.List;

/**
 * Created by toshiba on 2016/5/11.
 */
public class ColBinderAdapter extends ListBindAdapter {




    public ColBinderAdapter() {
        addAllBinder(new HeadBinder(this),
        new FirBinder(this),new CardBinder(this),new YelpBinder(this),
                new CardBinder(this),new HeartBinder(this),
                new CardBinder(this),new StarBinder(this),new CardEndBinder(this));
    }

    public void setData(List<SampleData> dataSet) {
      //  ((HeadBinder) getDataBinder(1)).addAll(dataSet);
    }
}
