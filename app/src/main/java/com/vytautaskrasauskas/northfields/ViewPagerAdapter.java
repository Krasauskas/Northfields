package com.vytautaskrasauskas.northfields;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by V Krasauskas on 05-Feb-18.
 */


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private static int TAB_COUNT = 4;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return ShedFragment.newInstance();
            case 1:
                return BostonFragment.newInstance();
            case 2:
                return MiscFragment.newInstance();
            case 3:
                return PeopleFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return ShedFragment.TITLE;

            case 1:
                return BostonFragment.TITLE;

            case 2:
                return MiscFragment.TITLE;

            case 3:
                return PeopleFragment.TITLE;
        }
        return super.getPageTitle(position);
    }
}
