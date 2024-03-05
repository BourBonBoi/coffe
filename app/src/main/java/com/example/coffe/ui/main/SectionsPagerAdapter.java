package com.example.coffe.ui.main;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.coffe.R;
import com.example.coffe.favoritesActivity;
import com.example.coffe.homeActivity;
import com.example.coffe.notificationActivity;
import com.example.coffe.shopActivity;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_text_1,
            R.string.tab_text_1,
            R.string.tab_text_1,
            R.string.tab_text_1,
    };
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                homeActivity Tab1 = new homeActivity();
                return Tab1;
            case 1:
                favoritesActivity Tab2 = new favoritesActivity();
                return Tab2;
            case 2:
                shopActivity Tab3 = new shopActivity();
                return Tab3;
            case 3:
                notificationActivity Tab4 = new notificationActivity();
                return Tab4;
        }
        return null;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }
    /*
    public CharSequence getPageTitle(int position) {
        Drawable icon = ContextCompat.getDrawable(mContext, TAB_ICONS[position]);
        icon.setBounds(0, 0, icon.getIntrinsicWidth(), icon.getIntrinsicHeight());

        SpannableString spannableString = new SpannableString("  " + mContext.getResources().getString(TAB_TITLES[position]));
        ImageSpan imageSpan = new ImageSpan(icon, ImageSpan.ALIGN_BOTTOM);
        spannableString.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
    }
     */

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 4;
    }
}