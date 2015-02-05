package com.umpay.adoptme.ripple;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.umpay.adoptme.R;

import java.util.Locale;

public class RipplesActivity extends Activity {

    SectionsPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;

    private String[] layoutIds;
    private String[] pageTitles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripples);

        layoutIds = getResources().getStringArray(R.array.part_layouts);
        pageTitles = getResources().getStringArray(R.array.part_titles);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);


    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Bundle args = new Bundle();
            args.putInt(RipplesFragment.ARG_LAYOUT,
                    getResources()
            .getIdentifier(layoutIds[position], "layout",
                    getPackageName()));

            return Fragment.instantiate(RipplesActivity.this,
                    RipplesFragment.class.getCanonicalName(),
                    args);

        }

        @Override
        public int getCount() {
            return layoutIds.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String pageTitle = null;
            if (pageTitles.length > position) {
                pageTitle = pageTitles[position].toLowerCase(Locale.getDefault());
            }
            return pageTitle;
        }
    }
}
