package restaurant;

import java.util.Objects;

public class MenuItem {
    private String name;
    private String category;
    private String description;
    private double price;
    private boolean isNew;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.getPrice(), getPrice()) == 0 &&
                isNew() == menuItem.isNew() &&
                getName().equals(menuItem.getName()) &&
                getCategory().equals(menuItem.getCategory()) &&
                getDescription().equals(menuItem.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCategory(), getDescription(), getPrice(), isNew());
    }

    public MenuItem (String name, String category, String description, double price, boolean isNew){
        this.setName(name);
        this.category = category;
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void print(){
        System.out.println(this.getName() + "\n" + this.getCategory() + "\n" + this.description + "\n" + this.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
