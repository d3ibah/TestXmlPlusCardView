package com.testxmlpluscardview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.request.RequestOptions;
import com.testxmlpluscardview.internet.get.Message;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.glide.transformations.CropTransformation;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

/**
 * Created by Home911 on 09.02.2018.
 */

public class ResponseAdapter extends RecyclerView.Adapter<ResponseAdapter.ResponseViewHolder> {

    private List<Message> messageList = new ArrayList<>();

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
        Log.e("5", "setMessageList");
    }


    @Override
    public ResponseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.e("5", "onCreateViewHolder");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);
        return new ResponseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ResponseViewHolder holder, int position) {
        Log.e("5", "onBindViewHolder");
        Message message = messageList.get(position);
        holder.textViewIsOpen.setText(R.string.is_open);
        int rank = (int)message.getShopRank();
        holder.progressBarShopRank.setMax(1000);
        holder.progressBarShopRank.setProgress(rank);

        MultiTransformation multiTransformation = new MultiTransformation(
                new CropTransformation(140, 140, CropTransformation.CropType.CENTER),
                new RoundedCornersTransformation(5, 0));
        Glide.with(holder.itemView.getContext())
                .load(message.getItemImage())
                .apply(RequestOptions.bitmapTransform(multiTransformation))
                .into(holder.imageViewItemImage);
        Glide.with(holder.itemView.getContext())
                .load(message.getShopLogo())
                .apply(RequestOptions.circleCropTransform())
                .into(holder.imageViewShopLogo);

    }

    @Override
    public int getItemCount() {
        Log.e("5", "getItemCount");
        return messageList.size();
    }

    public class ResponseViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewItemImage;
        private TextView textViewIsOpen;
        private ProgressBar progressBarShopRank;
        private ImageView imageViewShopLogo;

        public ResponseViewHolder(View itemView) {
            super(itemView);
            Log.e("5", "ResponseViewHolder");
            imageViewItemImage = itemView.findViewById(R.id.imageViewItemImage);
            imageViewShopLogo = itemView.findViewById(R.id.imageViewShopLogo);
            progressBarShopRank = itemView.findViewById(R.id.progressBarShopRank);
            textViewIsOpen = itemView.findViewById(R.id.textViewIsOpen);
        }

    }
}
