package com.pinssible.instagram;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by leiyong on 15/10/31.
 */
public class InstagranViewHolder extends RecyclerView.ViewHolder {
    public TextView userName;

    public TextView pictureTime;

    public ImageView userPicURL;

    public ImageView likes;
    public ImageView comments;
    public ImageView shared;


    public TextView likeNum;

    public TextView commentName1;
    public TextView commentName2;
    public TextView comment1;
    public TextView comment2;

    public InstagranViewHolder(View itemView) {
        super(itemView);

        userName = (TextView)itemView.findViewById(R.id.tv_userName);

        pictureTime = (TextView)itemView.findViewById(R.id.tv_time);
        userPicURL = (ImageView)itemView.findViewById(R.id.iv_picture);

        likes = (ImageView)itemView.findViewById(R.id.iv_like);
        comments = (ImageView)itemView.findViewById(R.id.iv_comments);
        shared = (ImageView)itemView.findViewById(R.id.iv_shared);

        likeNum = (TextView)itemView.findViewById(R.id.tv_likeNum);

        commentName1 = (TextView)itemView.findViewById(R.id.tv_commentName1);
        commentName2 = (TextView)itemView.findViewById(R.id.tv_commentName2);
        comment1 = (TextView)itemView.findViewById(R.id.tv_comment1);
        comment2 = (TextView)itemView.findViewById(R.id.tv_comment2);

    }
}
