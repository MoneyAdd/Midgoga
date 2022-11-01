package com.example.midgoga;

public class GuideItem {
    /* 아이템의 정보를 담기 위한 클래스 */
    String num;
    int img;

    public GuideItem(String num, int img) {
        this.num = num;
        this.img = img;
    }

    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }

    public int getImg() { return img;}
    public void setImg(int img) {this.img = img;}
}