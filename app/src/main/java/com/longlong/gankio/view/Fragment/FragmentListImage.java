package com.longlong.gankio.view.Fragment;

import android.view.ViewGroup;

import com.jude.beam.bijection.RequiresPresenter;
import com.jude.beam.expansion.list.BeamListFragment;
import com.jude.beam.expansion.list.ListConfig;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.longlong.gankio.model.bean.Result;
import com.longlong.gankio.presenter.PresenterFragment.PresenterImageList;
import com.longlong.gankio.view.viewHolder.ImageVH;

/**
 * Author:  Chenglong.Lu
 * Email:   1053998178@qq.com | w490576578@gmail.com
 * Date:   2016/07/22
 * Description:
 */
@RequiresPresenter(PresenterImageList.class)
public class FragmentListImage extends BeamListFragment<PresenterImageList, Result> {
    @Override
    public BaseViewHolder getViewHolder(ViewGroup parent, int viewType) {
        return new ImageVH(parent);
    }

    @Override
    public ListConfig getConfig() {
        return super.getConfig()
                .setLoadmoreAble(true)
                .setRefreshAble(true)
                .setNoMoreAble(true)
                .setErrorAble(true)
                .setErrorTouchToResumeAble(true);
    }
}
