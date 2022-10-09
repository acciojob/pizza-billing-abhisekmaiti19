package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean isrun1 = false;
    private Boolean isrun2 =  false;
    private Boolean isrun3 = false;
    private Boolean isrun4 = false;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg )
        {
            this.price = 300;
            this.bill = "Base Price Of The Pizza: 300\n";

        }else
        {
            this.price = 400;
            this.bill = "Base Price Of The Pizza: 400\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(isrun1 == false)
        {
            this.price = this.price +80;
            this.bill += "Extra Cheese Added: 80\n";
            isrun1 = true;

        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isrun2 == false) {
            if (isVeg) {
                this.price = this.price + 70;
                this.bill += "Extra Toppings Added: 70\n";
                isrun2 = true;
            } else {
                this.price = this.price + 120;
                this.bill += "Extra Cheese Added: 120\n";
                isrun2 = true;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isrun3 == false) {
            this.price = this.price + 20;
            this.bill += "Paperbag Added: 20\n";
            isrun3 = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isrun4 == false) {
            this.bill += "Total Price: " + this.price;
            isrun4 = true;

        }
        return this.bill;
    }
}
