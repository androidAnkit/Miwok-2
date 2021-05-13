package com.example.miwok;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class pagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public pagerAdapter(Context context,@NonNull FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch(position){
            case 0: return new NumberFragment();
            case 1: return new FamilyFragment();
            case 2: return new ColorsFragment();
            case 3: return  new PhrasesFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
//        return super.getPageTitle(position);

        switch(position){
            case 0: return mContext.getString(R.string.category_numbers);
            case 1: return mContext.getString(R.string.category_family);
            case 2: return mContext.getString(R.string.category_colors);
            case 3: return mContext.getString(R.string.category_phrases);
            default: return null;
        }

    }
}
