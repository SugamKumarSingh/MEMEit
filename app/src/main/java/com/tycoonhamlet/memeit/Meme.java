package com.tycoonhamlet.memeit;

public class Meme {
    private String memeURL;
    private int likes;
    private boolean isSaved, isLiked;

    public Meme(String memeURL, int likes) {
        this.memeURL = memeURL;
        this.likes = likes;
        this.isSaved = false;
        this.isLiked = false;
    }

    public Meme(String memeURL, int likes, boolean isSaved, boolean isLiked) {
        this.memeURL = memeURL;
        this.likes = likes;
        this.isSaved = isSaved;
        this.isLiked = isLiked;
    }

    public String getMemeURL() {
        return memeURL;
    }

    public void setMemeURL(String memeURL) {
        this.memeURL = memeURL;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isSaved() {
        return isSaved;
    }

    public void setSaved(boolean saved) {
        isSaved = saved;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }
}
