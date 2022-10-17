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
    //Be cautious when autogenerating getter and constructors. Make sure syntax and structure are consistent
    public GroceryItem(String name, String department, double price, boolean isOnSale) {
        this.name = name;
        this.department = department;
        this.price = price;
        this.isOnSale = isOnSale;
    }

   /* v means void when constructor is generated from test. must input variable name
     followed by injection impacting price  */
    //Because the method of behavior prompted the creation of a constructor an injection must follow
    //to Remember: Constructor inject this (this.property = [variable name]) variable

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
