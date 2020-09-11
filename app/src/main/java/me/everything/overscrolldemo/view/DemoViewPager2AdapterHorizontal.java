package me.everything.overscrolldemo.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import me.everything.overscrolldemo.R;

public class DemoViewPager2AdapterHorizontal extends DemoRecyclerAdapterBase {

    public DemoViewPager2AdapterHorizontal(LayoutInflater inflater) {
        super(inflater);
    }

    public DemoViewPager2AdapterHorizontal(List items, LayoutInflater inflater) {
        super(inflater, items);
    }

    @Override
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DemoViewHolder(R.layout.horizontal_view_pager_item, parent, mInflater);
    }

}
