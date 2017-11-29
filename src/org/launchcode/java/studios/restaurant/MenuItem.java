package org.launchcode.java.studios.restaurant;

public class MenuItem {

    private String name;
    private String description;
    private String category;
    private float price;
    private boolean newItem;

    public MenuItem(String name, String description, String category, float price, boolean newItem) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.newItem = newItem;
    }

    public MenuItem(String name, String description, String category, float price) {
        this(name, description, category, price, true);
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public float getPrice() {
        return price;
    }

    private void setPrice(float aPrice) {
        this.price = aPrice;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

}
