package com.company;

public class HealthyBurger extends Hamburger {

    private boolean mAvocado;
    private String mAvocadoString = "avocado";
    private boolean mRelish;
    private String mRelishString = "relish";

    public HealthyBurger(double mBaseCost, String mMeat) {
        super(mBaseCost, "Brown rye", mMeat, "Healthy");
    }

    public void addAvocado(){
        mAvocado = true;
       super.addToppingPrice();
    }

    public void addRelish(){
        mRelish = true;
        super.addToppingPrice();
    }


    @Override
    void showPricing() {
        super.showPricing();
        if(mAvocado){
            System.out.println("You've added avocado for an additional $" + Hamburger.df2.format(super.getmToppingCost()));
        }
        if(mRelish){
            System.out.println("You've added relish for an additional $" + Hamburger.df2.format(super.getmToppingCost()));
        }

    }
}
