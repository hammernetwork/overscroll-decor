package me.everything.overscrolldemo.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;
import me.everything.overscrolldemo.R;
import me.everything.overscrolldemo.control.DemoContentHelper;
import me.everything.overscrolldemo.control.DemoItem;

public class ViewPager2DemoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.viewpager2_overscroll_demo,null,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initHorizontalViewPager(DemoContentHelper.getSpectrumItems(getResources()), ((ViewPager2) view.findViewById(R.id.view_pager)));
    }

    private void initHorizontalViewPager(List<DemoItem> items, ViewPager2 viewPager) {
        LayoutInflater appInflater = LayoutInflater.from(getActivity().getApplicationContext());
        RecyclerView.Adapter adapter = new DemoViewPager2AdapterHorizontal(DemoContentHelper.getSpectrumItems(getResources()), appInflater);
        viewPager.setAdapter(adapter);

        OverScrollDecoratorHelper.setUpOverScroll(viewPager);
    }

}
