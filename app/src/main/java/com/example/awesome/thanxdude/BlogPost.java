package com.example.awesome.thanxdude;

public class BlogPost {

    public String desc,image_url,thumb_url,user_id;

    public BlogPost(){}

    public BlogPost(String desc, String image_url, String thumb_url, String user_id) {
        this.desc = desc;
        this.image_url = image_url;
        this.thumb_url = thumb_url;
        this.user_id = user_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getThumb_url() {
        return thumb_url;
    }

    public void setThumb_url(String thumb_url) {
        this.thumb_url = thumb_url;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }



    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
