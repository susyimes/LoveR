package com.example.toshiba.lover.BindersAdapter;

import android.content.Context;
import android.view.View;

import com.example.toshiba.lover.Binder.CardBinder;
import com.example.toshiba.lover.Binder.FirBinder;
import com.example.toshiba.lover.Binder.HeadBinder;
import com.yqritc.recyclerviewmultipleviewtypesadapter.ListBindAdapter;

import java.util.List;

/**
 * Created by toshiba on 2016/5/11.
 */
public class ColBinderAdapter extends ListBindAdapter {




    public ColBinderAdapter() {
        addAllBinder(new HeadBinder(this),
        new FirBinder(this),new CardBinder(this));
    }

    public void setData(List<SampleData> dataSet) {
      //  ((HeadBinder) getDataBinder(1)).addAll(dataSet);
    }
}
