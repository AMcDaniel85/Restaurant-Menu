package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String nameOfRestaurant;
    public ArrayList<MenuItem> menu;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> menu){
        this.setMenu(menu);

        Date d = new Date();
        this.lastUpdated = d;
    }

    public void addNewItem(MenuItem newItem){
        this.menu.add(newItem);
    }
    public void removeItem(MenuItem item){
        this.menu.remove(item);
    }

    public void print(){
        System.out.println("*****");
        for(MenuItem item : this.menu){
            item.print();
            System.out.println("*****");
        }
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

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        Date d = new Date();
        this.lastUpdated = d;
    }

}