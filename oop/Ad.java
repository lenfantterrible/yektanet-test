package oop;


public class Ad extends BaseAdvertising{

    private String title; 
    private String imgUrl; 
    private String link; 


    public Ad(int ID, String title, String imgUrl, String link) {
        super(ID);
        this.title = title;
        this.imgUrl = imgUrl;
        this.link = link;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }


}