package com.testxmlpluscardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.testxmlpluscardview.internet.get.GoodsInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Home911 on 09.02.2018.
 */

public class GoodsAdapter extends RecyclerView.Adapter<GoodsAdapter.GoodsViewHolder> {

    private List<GoodsInfo> goodsInfoList = new ArrayList<>();

    public void setGoodsInfoList(List<GoodsInfo> goodsInfoList) {
        this.goodsInfoList = goodsInfoList;
    }

    @Override
    public GoodsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);
        return new GoodsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GoodsAdapter.GoodsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return goodsInfoList.size();
    }

    public class GoodsViewHolder extends RecyclerView.ViewHolder {
        public GoodsViewHolder(View itemView) {
            super(itemView);
        }
    }
}
