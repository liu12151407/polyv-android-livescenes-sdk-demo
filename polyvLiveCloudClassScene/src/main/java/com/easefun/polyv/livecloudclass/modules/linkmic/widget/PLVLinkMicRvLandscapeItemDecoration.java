package com.easefun.polyv.livecloudclass.modules.linkmic.widget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.plv.foundationsdk.utils.PLVScreenUtils;

/**
 * date: 2020/8/27
 * author: HWilliamgo
 * description: 横屏连麦列表的ItemDecoration
 */
public class PLVLinkMicRvLandscapeItemDecoration extends RecyclerView.ItemDecoration {

    // <editor-fold defaultstate="collapsed" desc="变量">
    //距离顶部的偏移量
    private int topOffset = 0;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="设置横竖屏">
    public void setLandscape() {
        topOffset = PLVScreenUtils.dip2px(8);
    }

    public void setPortrait() {
        topOffset = 0;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="RecyclerView.ItemDecoration接口实现">
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int pos = parent.getChildAdapterPosition(view);
        if (pos != 0) {
            outRect.top = topOffset;
        }
    }
    // </editor-fold>

}
