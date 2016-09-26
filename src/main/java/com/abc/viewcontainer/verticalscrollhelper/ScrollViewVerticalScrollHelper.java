package com.abc.viewcontainer.verticalscrollhelper;

import android.widget.ScrollView;

/**
 * Created by zhangzhenwei on 16/8/6.
 */
public class ScrollViewVerticalScrollHelper implements IVerticalScrollHelper {
    ScrollView scrollView;
    public ScrollViewVerticalScrollHelper(ScrollView v){
        scrollView = v;
    }
    @Override
    public boolean canScrollUp() {
        return scrollView.canScrollVertically(1);
    }

    @Override
    public boolean canScrollDown() {
        return scrollView.canScrollVertically(-1);
    }
}
