package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args){
        MenuItem nachos = new MenuItem("Nachos", "appetizer", "Triangle shaped tortilla's covered in cheesy goodness", 2.99, false);
        MenuItem burger = new MenuItem("Bacon double Cheesburger", "main course", "Double slabs of cow covered in cheese and pig", 7.99, false);
        MenuItem churro = new MenuItem("Churro", "dessert", "A piece of cinnamon covered heaven", 1.99, true);

        ArrayList<MenuItem> selection = new ArrayList<>();

        Menu menu = new Menu(selection);
        menu.addNewItem(nachos);
        menu.addNewItem(burger);
        menu.addNewItem(churro);

        menu.print();
        nachos.print();
        menu.removeItem(nachos);
        menu.print();
        System.out.println(menu.getLastUpdated());
        System.out.println(churro.equals(burger));
    }
}
