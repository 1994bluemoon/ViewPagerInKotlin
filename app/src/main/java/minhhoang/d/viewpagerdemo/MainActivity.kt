package minhhoang.d.viewpagerdemo

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v4.view.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

const val NUM_PAGES = 3

class MainActivity : FragmentActivity() {

    private var mPagerAdapter: PagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPagerAdapter = ScreenSlidePagerAdapter(supportFragmentManager)
        pager.adapter = mPagerAdapter
    }

    override fun onBackPressed() {
        if (pager.currentItem == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed()
        } else {
            // Otherwise, select the previous step.
            pager.setCurrentItem(pager.getCurrentItem() - 1)
        }
    }
}
