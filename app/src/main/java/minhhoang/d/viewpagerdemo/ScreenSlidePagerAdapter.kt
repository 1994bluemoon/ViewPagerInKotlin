package minhhoang.d.viewpagerdemo

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class ScreenSlidePagerAdapter(var fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return Slide1Fragment()
    }

    override fun getCount(): Int {
        return NUM_PAGES
    }
}