package com.company;

public class DeluxeBurger extends Hamburger{

    private boolean mDrink;
    private String mDrinkString = "drink";
    private boolean mChips;
    private String mChipsString = "chips";

    public DeluxeBurger(double mBaseCost, String mBreadType, String mMeat) {
        super(mBaseCost, mBreadType, mMeat, "Deluxe");
        addExtras();
    }

    private void addExtras() {
        this.mDrink = true;
        super.addToppingPrice();
        this.mChips = true;
        super.addToppingPrice();
    }

    @Override
    void showPricing() {
        super.showPricing();
        if(mDrink){
            System.out.println("You've added a drink for an additional $" + Hamburger.df2.format(super.getmToppingCost()));
        }
        if(mChips){
            System.out.println("You've added chips for an additional $" + Hamburger.df2.format(super.getmToppingCost()));
        }
    }

    @Override
    public void addLettuce() {
        System.out.println("This topping is not available for this burger");
    }

    @Override
    public void addTomato() {
        System.out.println("This topping is not available for this burger");
    }

    @Override
    public void addOnion() {
        System.out.println("This topping is not available for this burger");

    }
}
