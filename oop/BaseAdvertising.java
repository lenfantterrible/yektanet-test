package oop;

public abstract class BaseAdvertising {
    
    private int ID; 
    private int clicks = 0; 
    private int views = 0; 

    public BaseAdvertising(int ID) {

        this.ID = ID;
    }

    public int getClicks() {
        return this.clicks;
    }

    public void incClicks() {
        this.clicks += 1;
    }

    public int getViews() {
        return this.views;
    }

    public void incViews() {
        this.views += 1;
    }
}
