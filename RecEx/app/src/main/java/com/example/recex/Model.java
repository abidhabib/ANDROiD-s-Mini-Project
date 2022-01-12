package com.example.recex;

public class Model {


    private  String header,sub;

    int imgname ;

    public Model(String header, String sub, int imgname) {
        this.header=header;
        this.imgname=imgname;
        this.sub=sub;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getImgname() {
        return imgname;
    }

    public void setImgname(int imgname) {
        this.imgname = imgname;
    }
}
