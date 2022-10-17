package org.example;

public class GroceryItem {
    private String name;
    private String department;
    private double price;
    private boolean isOnSale;

    public String getName() {

        return name;
    }

    public String getDepartment() {

        return department;
    }

    public double getPrice() {

        return price;
    }

    public boolean getisOnSale() {

        return isOnSale;
    }
    
    public GroceryItem(String name, String department, double price, boolean isOnSale) {
        this.name = name;
        this.department = department;
        this.price = price;
        this.isOnSale = isOnSale;
    }

   

    public void activateSale(double amountOfSale) {
        this.price = this.price*amountOfSale;
        this.isOnSale = isOnSale;
    }


    public String toString() {
        return "org.example.GroceryItem{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", price=" + price +
                ", isOnSale=" + isOnSale +
                '}';
    }
}
