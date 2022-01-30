package oop;

public class Advertiser extends BaseAdvertising{


    private static int totalClicks = 0;
    private String name; 


    public Advertiser(int ID, String name) {
        super(ID);
        this.name = name;
    }

    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String help() {

        return "Advertiser\nID:\tID of Advertiser\nName:\tName of Advertiser\nClicks:\tNumber of clicks of this Advertiser\nViews: Number of views of this Advertiser\n";
    }

    public String describeMe() {

        return "Advertiser Class Represents The Entity of Advertiser\n";
    }

    @Override
    public void incClicks(){

        super.incClicks();
        Advertiser.totalClicks++;
    }

    public static int getTotalClicks() {

        return Advertiser.totalClicks;
    }

}