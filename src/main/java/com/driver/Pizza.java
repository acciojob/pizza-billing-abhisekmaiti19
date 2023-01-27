package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isExtraTopping = false;
    private boolean isExtraCheese  = false;
    private boolean isTakeway = false;
//    boolean isExtraCheese  = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg == true )
        {
            this.price = 300;
            System.out.println("Base Price Of The Pizza: 300");

        }else
        {
            this.price = 400;
            System.out.println("Base Price Of The Pizza: 400");

        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.isExtraCheese == false)
        {
            this.price += 80;
            System.out.println("Extra Cheese Added: 80");
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg == true && this.isExtraTopping == false)
        {
            this.price += 70;
            this.isExtraTopping = true;
            System.out.println("Extra Toppings Added: 70");
        }else if(this.isVeg == false && this.isExtraTopping == true)
        {
            this.price += 120;
            this.isExtraTopping = true;
            System.out.println("Extra Toppings Added: 120");

        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.isTakeway == false)
        {
            this.price += 20;
            System.out.println("Paperbag Added: 20");
        }

    }

    public String getBill(){
        // your code goes here
        String Realbill = String.valueOf(this.price);
       this.bill =  "Total Price: "+Realbill;

        return this.bill;
    }
}