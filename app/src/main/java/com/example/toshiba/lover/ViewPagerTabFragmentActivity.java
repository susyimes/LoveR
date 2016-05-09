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

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.toshiba.lover.frameview.SusCusTextView;

/**
 * This activity just provides a toolbar.
 * Toolbar is manipulated by ViewPagerTabFragmentParentFragment.
 */
public class ViewPagerTabFragmentActivity extends BaseActivity {
    private DrawerLayout mDrawerLayout;
    private Toolbar mToolbarView;
    private ActionBarDrawerToggle  mDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        mToolbarView = (Toolbar) findViewById(R.id.toolbar);
        inToolbarFun();

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        mToolbarView.inflateMenu(R.menu.toolbar_menu);
        inDrawerFun();

        FragmentManager fm = getSupportFragmentManager();
        if (fm.findFragmentByTag(ViewPagerTabFragmentParentFragment.FRAGMENT_TAG) == null) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.fragment, new ViewPagerTabFragmentParentFragment(),
                    ViewPagerTabFragmentParentFragment.FRAGMENT_TAG);
            ft.commit();
            fm.executePendingTransactions();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    private void inToolbarFun() {

       mToolbarView.setTitle("  ");
        mToolbarView.setLogo(R.mipmap.logo64);



       mToolbarView.inflateMenu(R.menu.toolbar_menu);
        mToolbarView.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int menuItemId = item.getItemId();
                switch (menuItemId) {
                    case 0:
                        Toast.makeText(ViewPagerTabFragmentActivity.this, "search", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(ViewPagerTabFragmentActivity.this, "history", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(ViewPagerTabFragmentActivity.this, "more", Toast.LENGTH_SHORT).show();
                        break;


                }
                return true;


            }
        });


       // mToolbarView.setTitleTextAppearance(this,R.style.title);


    }

    private void inDrawerFun() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        // 實作 drawer toggle 並放入 toolbar
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbarView, R.string.drawer_open, R.string.drawer_close);
        mDrawerToggle.syncState();

        mDrawerLayout.setDrawerListener(mDrawerToggle);

    }
}
