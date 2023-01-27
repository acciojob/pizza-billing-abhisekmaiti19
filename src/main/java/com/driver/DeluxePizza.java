package com.driver;

public class DeluxePizza extends Pizza {

    boolean isExtraTopping = false;
    boolean isExtraCheese  = false;



    public DeluxePizza (Boolean isVeg) {
        super(isVeg);

        addExtraCheese();
        isExtraTopping = true;

        addExtraToppings();
        isExtraCheese = true;

    }

    @Override
    public void addExtraCheese() {
        if(isExtraCheese == false) {
            super.addExtraCheese();
        }
    }

    @Override
    public void addExtraToppings() {
        if(isExtraTopping == false) {
            super.addExtraCheese();
        }
    }


}