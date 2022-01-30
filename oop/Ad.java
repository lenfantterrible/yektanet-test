package oop;


public class Ad extends BaseAdvertising{

    private String title; 
    private String imgUrl; 
    private String link; 
    private Advertiser advertiser;


    public Ad(int ID, String title, String imgUrl, String link, Advertiser advertiser) {
        super.setID(ID);
        this.title = title;
        this.imgUrl = imgUrl;
        this.link = link;
        this.advertiser = advertiser;
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


    public Advertiser getAdvertiser() {
        return this.advertiser;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

    @Override 
    public void incClicks() {
        super.incClicks();
        this.advertiser.incClicks();
    }

    @Override
    public void incViews() {
        super.incViews();
        this.advertiser.incViews();
    }

    @Override
    public String describeMe() {

        return "Ad Class Represents The Entity of Ad";
    }

}