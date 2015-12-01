package com.pinssible.instagram;

/**
 * Created by leiyong on 15/10/31.
 */
public class InstagramListBean {
    private String userName;

    private String pictureTime;
    private String userPicURL;

    private int likeNum;

    private String commentName1;
    private String commentName2;
    private String comment1;
    private String comment2;


    public InstagramListBean(String userName, String pictureTime, String userPicURL, int likeNum, String commentName1,
                             String commentName2, String comment1, String comment2) {
        this.userName = userName;
        this.userPicURL = userPicURL;
        this.likeNum = likeNum;
        this.commentName1 = commentName1;
        this.commentName2 = commentName2;
        this.comment1 = comment1;
        this.comment2 = comment2;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPictureTime() {
        return pictureTime;
    }

    public void setPictureTime(String pictureTime) {
        this.pictureTime = pictureTime;
    }

    public String getUserPicURL() {
        return userPicURL;
    }

    public void setUserPicURL(String userPicURL) {
        this.userPicURL = userPicURL;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public String getCommentName1() {
        return commentName1;
    }

    public void setCommentName1(String commentName1) {
        this.commentName1 = commentName1;
    }

    public String getCommentName2() {
        return commentName2;
    }

    public void setCommentName2(String commentName2) {
        this.commentName2 = commentName2;
    }

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
    }

    public String getComment2() {
        return comment2;
    }

    public void setComment2(String comment2) {
        this.comment2 = comment2;
    }


}
