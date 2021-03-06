/*
 * Copyright 2014 Soichiro Kashima
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.toshiba.lover;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.toshiba.lover.Binder.CardBinder;
import com.example.toshiba.lover.Binder.CardEndBinder;
import com.example.toshiba.lover.Binder.HeadBinder;
import com.example.toshiba.lover.BindersAdapter.ColBinderAdapter;
import com.example.toshiba.lover.recycleview_tool.DividerGridItemDecoration;
import com.github.ksoichiro.android.observablescrollview.ObservableRecyclerView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.yalantis.phoenix.PullToRefreshView;
import com.yqritc.recyclerviewmultipleviewtypesadapter.DataBindAdapter;

/**
 * Fragment for ViewPagerTabFragmentActivity.
 * ScrollView callbacks are handled by its parent fragment, not its parent activity.
 */
public class ViewPagerTabFragmentRecyclerViewFragment extends BaseFragment {
    private PullToRefreshView mPullToRefreshView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        final ObservableRecyclerView recyclerView = (ObservableRecyclerView) view.findViewById(R.id.scroll);
       // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
        //adapter
        ColBinderAdapter adapter=new ColBinderAdapter();
        recyclerView.setAdapter(adapter);

////////////////////////////////////////////////////
        inItemClick();
        CardBinder cardBinder=adapter.getDataBinder(2);
        cardBinder.setOnItemClickLitener(new CardBinder.OnItemClickLitener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getContext(),position+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        });


        CardBinder cardBinder2=adapter.getDataBinder(4);
        cardBinder2.setOnItemClickLitener(new CardBinder.OnItemClickLitener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getContext(),position+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        });
        CardBinder cardBinder3=adapter.getDataBinder(6);
        cardBinder3.setOnItemClickLitener(new CardBinder.OnItemClickLitener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getContext(),position+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        });
        CardEndBinder cardBinder8=adapter.getDataBinder(8);
        cardBinder8.setOnItemClickLitener(new CardEndBinder.OnItemClickLitener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getContext(),position+"",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        });
/////////////////////////////////////////////////////
        HeadBinder headBinder=adapter.getDataBinder(0);


        mPullToRefreshView = (PullToRefreshView) view.findViewById(R.id.pull_to_refresh);



        mPullToRefreshView.setOnRefreshListener(new PullToRefreshView.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mPullToRefreshView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mPullToRefreshView.setRefreshing(false);
                    }
                },1000);
            }
        });
/////////////////////////////////////////////////////
        inManager();
        GridLayoutManager manager = new GridLayoutManager(getContext(), 6);

        //item's span
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if(position<=3||position==14||position==27||position==40){
                    return 6;
                }else {
                    if (position==41||position==42||position==43){
                        return 2;
                    }else {
                    return 3;}
                }
            }
        });
        recyclerView.setLayoutManager(manager);

        unWork();




//////////////////////////////////////////////////////////
        Fragment parentFragment = getParentFragment();
        ViewGroup viewGroup = (ViewGroup) parentFragment.getView();
        if (viewGroup != null) {
            recyclerView.setTouchInterceptionViewGroup((ViewGroup) viewGroup.findViewById(R.id.container));
            if (parentFragment instanceof ObservableScrollViewCallbacks) {
                recyclerView.setScrollViewCallbacks((ObservableScrollViewCallbacks) parentFragment);
            }
        }
        return view;
    }



    private void inManager() {


    }

    private void inItemClick() {


    }

    private void unWork() {
        //recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        // recyclerView.addItemDecoration(new DividerGridItemDecoration(this.getContext()));
        // recyclerView.setItemAnimator(new DefaultItemAnimator());

        //recyclerView.addItemDecoration();


        // setDummyData(recyclerView);

    }






}
