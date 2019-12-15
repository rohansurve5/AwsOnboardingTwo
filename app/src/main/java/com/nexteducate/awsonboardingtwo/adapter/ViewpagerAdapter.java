package com.nexteducate.awsonboardingtwo.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.nexteducate.awsonboardingtwo.fragment.Fragment_slideone;

public class ViewpagerAdapter extends FragmentStatePagerAdapter {

    public ViewpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                Fragment_slideone slideone = new Fragment_slideone();
                return slideone;
            case 1:
                Fragment_slideone slidetwo = new Fragment_slideone();
                return slidetwo;
            case 2:
                Fragment_slideone slidethree = new Fragment_slideone();
                return slidethree;
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
