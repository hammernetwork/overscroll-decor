package me.everything.android.ui.overscroll.adapters;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import me.everything.android.ui.overscroll.HorizontalOverScrollBounceEffectDecorator;

/**
 * An adapter to enable over-scrolling over object of {@link ViewPager2}
 *
 * @see HorizontalOverScrollBounceEffectDecorator
 */
public class ViewPager2OverScrollDecorAdapter extends ViewPager2.OnPageChangeCallback
    implements IOverScrollDecoratorAdapter {

    protected final ViewPager2 mViewPager;

    protected int mLastPagerPosition = 0;
    protected float mLastPagerScrollOffset;

    public ViewPager2OverScrollDecorAdapter(ViewPager2 viewPager) {
        this.mViewPager = viewPager;

        mViewPager.registerOnPageChangeCallback(this);

        mLastPagerPosition = mViewPager.getCurrentItem();
        mLastPagerScrollOffset = 0f;

    }

    @Override
    public View getView() {
        return mViewPager;
    }

    @Override
    public boolean isInAbsoluteStart() {

        return mLastPagerPosition == 0 &&
                mLastPagerScrollOffset == 0f;
    }

    @Override
    public boolean isInAbsoluteEnd() {

        return mLastPagerPosition == mViewPager.getAdapter().getItemCount()-1 &&
                mLastPagerScrollOffset == 0f;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        mLastPagerPosition = position;
        mLastPagerScrollOffset = positionOffset;
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
