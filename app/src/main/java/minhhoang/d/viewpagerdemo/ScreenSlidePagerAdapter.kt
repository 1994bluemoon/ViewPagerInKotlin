package minhhoang.d.viewpagerdemo

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class ScreenSlidePagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> Slide1Fragment()
            1 -> Blank2Fragment()
            2 -> Blank3Fragment()
            else -> Slide1Fragment()
        }
    }

    override fun getCount(): Int {
        return NUM_PAGES
    }
}