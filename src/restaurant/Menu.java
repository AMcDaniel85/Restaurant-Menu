package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String nameOfRestaurant;
    private ArrayList<MenuItem> menu;
    private Date lastUpdated;

    public void addNewItem(MenuItem newItem){
        this.menu.add(newItem);
        Date d = new Date();
        this.lastUpdated = d;
    }

    public String getNameOfRestaurant() {
        return nameOfRestaurant;
    }

    public void setNameOfRestaurant(String nameOfRestaurant) {
        this.nameOfRestaurant = nameOfRestaurant;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }
}