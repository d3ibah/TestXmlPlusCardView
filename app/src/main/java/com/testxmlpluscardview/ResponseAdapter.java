package com.testxmlpluscardview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.testxmlpluscardview.internet.get.Message;

import java.util.ArrayList;
import java.util.List;

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
    public void onBindViewHolder(ResponseViewHolder holder, int position) {
        Log.e("5", "onBindViewHolder");
        Message message = messageList.get(position);
        holder.textViewIsOpen.setText(R.string.is_open);
        Glide.with(holder.itemView.getContext())
                .load(message.getItemImage())
                .centerCrop()
                .into(holder.imageViewItemImage);

    }

    @Override
    public int getItemCount() {
        Log.e("5", "getItemCount");
        return messageList.size();
    }

    public class ResponseViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewItemImage;
        private TextView textViewIsOpen;

        public ResponseViewHolder(View itemView) {
            super(itemView);
            Log.e("5", "ResponseViewHolder");
            imageViewItemImage = itemView.findViewById(R.id.imageViewItemImage);
            textViewIsOpen = itemView.findViewById(R.id.textViewIsOpen);
        }

    }
}
