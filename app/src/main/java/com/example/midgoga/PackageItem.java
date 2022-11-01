package com.example.midgoga;

public class PackageItem {
    /* 아이템의 정보를 담기 위한 클래스 */
    String num;
    int resId;
    int bookmark;

    public PackageItem(String num,int resId, int bookmark) {
        this.num = num;
        this.resId = resId;
        this.bookmark = bookmark;
    }

    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }

    public int getImg() {
        return resId;
    }
    public void setImg(int resId) {this.resId = resId;}

    public int getBookmark() {
        return bookmark;
    }
    public void setBookmark(String name) {
        this.bookmark = bookmark;
    }


}