package com.satman.satya.swippingtabsnew.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.satman.satya.swippingtabsnew.R;

/**
 * Created by satya on 07-04-2017.
 */

public class TabFragment1 extends android.support.v4.app.Fragment {

    public TabFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab1, container, false);
    }


}
