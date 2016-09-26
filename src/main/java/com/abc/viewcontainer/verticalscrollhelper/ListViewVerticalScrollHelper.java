package com.abc.viewcontainer.verticalscrollhelper;

import android.view.View;
import android.widget.ListView;

/**
 * Created by zhangzhenwei on 16/8/5.
 */

public class ListViewVerticalScrollHelper implements IVerticalScrollHelper {
    ListView listView;

    public ListViewVerticalScrollHelper(ListView view){
        listView = view;
    }

    @Override
    public boolean canScrollUp() {

        int count = listView.getChildCount();
        View lastChild = count > 0 ? listView.getChildAt(count - 1) : null;
        if (lastChild != null) {
            int lvp = listView.getLastVisiblePosition();
            if (lvp == (listView.getAdapter().getCount() - 1) && lastChild.getBottom() <= listView.getHeight()) {
                return false;
            } else {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean canScrollDown() {

        View firstChild = listView.getChildAt(0);
        if (firstChild != null) {
            int firstVisiblePos = listView.getFirstVisiblePosition();
            if (firstVisiblePos == 0 && firstChild.getTop() >= 0 && listView.getTop() >= 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}

