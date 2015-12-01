package com.pinssible.instagram;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by leiyong on 15/10/31.
 */
public class InstagramViewAdapter extends RecyclerView.Adapter<InstagranViewHolder> {

    private Context context;
    private ArrayList<InstagramListBean> arrayListInstagram;

    public InstagramViewAdapter(ArrayList<InstagramListBean> arrayListInstagram, Context context) {
        this.context = context;
        this.arrayListInstagram = arrayListInstagram;
    }



    @Override
    public InstagranViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.listitem_instagram, null);
        return new InstagranViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InstagranViewHolder holder, int position) {
        InstagramListBean instagramListBean = arrayListInstagram.get(position);
        holder.userName.setText(instagramListBean.getUserName());
        holder.likeNum.setText(instagramListBean.getLikeNum()+"次赞");
        holder.pictureTime.setText(instagramListBean.getPictureTime());
        holder.commentName1.setText(instagramListBean.getCommentName1());
        holder.commentName2.setText(instagramListBean.getCommentName2());
        holder.comment1.setText(instagramListBean.getComment1());
        holder.comment2.setText(instagramListBean.getComment2());

    }

    @Override
    public int getItemCount() {
        return arrayListInstagram.size();
    }
}
