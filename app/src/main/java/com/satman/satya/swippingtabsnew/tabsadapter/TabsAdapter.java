package com.satman.satya.swippingtabsnew.tabsadapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.satman.satya.swippingtabsnew.fragments.TabFragment1;
import com.satman.satya.swippingtabsnew.fragments.TabFragment2;
import com.satman.satya.swippingtabsnew.fragments.TabFragment3;
import com.satman.satya.swippingtabsnew.fragments.TabFragment4;
import com.satman.satya.swippingtabsnew.fragments.TabFragment5;
import com.satman.satya.swippingtabsnew.fragments.TabFragment6;


/**
 * Created by MAIN on 19-Apr-16.
 */
public class TabsAdapter extends FragmentStatePagerAdapter {

    private Context context;
    String[] Tab_Names = {"Temple1 vinayaka", "Temple2", "Temple3", "Temple4", "Temple5", "Temple6"};

    // NEW", "OUR CITY", "ACHIEVEMENTS"};

    public TabsAdapter(FragmentManager fm, Context c) {
        super(fm);
        this.context = c;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        if (position == 0) {

            fragment = new TabFragment1();

        } else if (position == 1) {

            fragment = new TabFragment2();

        } else if (position == 2) {

            fragment = new TabFragment3();

        } else if (position == 3) {

            fragment = new TabFragment4();

        } else if (position == 4) {

            fragment = new TabFragment5();

        } else if (position == 5) {

            fragment = new TabFragment6();

        }

        Bundle b = new Bundle();
        b.putInt("position", position);
        fragment.setArguments(b);

        return fragment;
    }

    @Override
    public int getCount() {
        return Tab_Names.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return Tab_Names[position];
    }
}
