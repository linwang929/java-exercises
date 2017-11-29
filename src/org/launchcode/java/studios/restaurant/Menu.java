package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private static Date lastUpdated;
    private ArrayList<MenuItem> restaurantMenu;

    public Menu(Date lastUpdated, ArrayList<MenuItem> restaurantMenu) {
        this.lastUpdated = lastUpdated;
        this.restaurantMenu = restaurantMenu;
    }

    public Menu(Date lastUpdated) {
        this(lastUpdated, new ArrayList<MenuItem>());
    }

    public Menu() {
        this(new Date(), new ArrayList<MenuItem>());
    }

    public static Date getLastUpdated() {
        return lastUpdated;
    }

    private void setLastUpdated(Date aDate) {
        lastUpdated = aDate;
    }

    public ArrayList<MenuItem> getRestaurantMenu() {
        return restaurantMenu;
    }

    public void setRestaurantMenu(ArrayList<MenuItem> aMenu) {
        this.restaurantMenu = aMenu;
    }

}
