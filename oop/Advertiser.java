package oop;

public class Advertiser {

    private int ID; 
    private String name; 
    private int clicks = 0; 
    private int views = 0; 
    private static int totalClicks = 0;

    public Advertiser() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClicks() {
        return this.clicks;
    }

    public void incClicks() {
        this.clicks += 1;
        Advertiser.totalClicks += 1;
    }

    public int getViews() {
        return this.views;
    }

    public void incViews() {
        this.views += 1;
    }
    
    public String help() {

        return "Advertiser\nID:\tID of Advertiser\nName:\tName of Advertiser\nClicks:\tNumber of clicks of this Advertiser\nViews: Number of views of this Advertiser\n";
    }

    public String describeMe() {

        return "Advertiser Class Represents The Entity of Advertiser\n";
    }


    public static int getTotalClicks() {

        return Advertiser.totalClicks;
    }

}