package com.company;

import java.text.DecimalFormat;

public class Hamburger {

    static DecimalFormat df2 = new DecimalFormat("0.00");

    private double mTotalPrice;
    private boolean mLettuce;
    private String mLettuceString = "lettuce";
    private boolean mTomato;
    private String mTomatoString = "tomato";
    private boolean mOnion;
    private String mOnionString = "onion";
    private double mToppingCost = 0.65;
    private double mBaseCost;
    private String mBreadType;
    private String mMeat;
    private String mName;


    public Hamburger(double mBaseCost, String mBreadType, String mMeat, String mName) {
        this.mBaseCost = mBaseCost;
        this.mBreadType = mBreadType;
        this.mMeat = mMeat;
        this.mName = mName;
        this.mTotalPrice = mBaseCost;
    }

    void showPricing() {
        System.out.println("Your total is $" + df2.format(mTotalPrice));

        System.out.println("This " + mName + " burger on " + mBreadType + " costs = $" + df2.format(mBaseCost));
        if (mLettuce) {
            System.out.println("You've added lettuce for an additional $" + df2.format(mToppingCost));
        }
        if (mTomato) {
            System.out.println("You've added tomato for an additional $" + df2.format(mToppingCost));
        }
        if (mOnion) {
            System.out.println("You've added onion for an additional $" + df2.format(mToppingCost));
        }
    }

    void addToppingPrice() {
        mTotalPrice += mToppingCost;
    }

    public void addLettuce() {
        mLettuce = true;
        mTotalPrice += mToppingCost;
    }

    public void addTomato() {
        mTomato = true;
        mTotalPrice += mToppingCost;
    }

    public void addOnion() {
        mOnion = true;
        mTotalPrice += mToppingCost;
    }

    public double getmTotalPrice() {
        return mTotalPrice;
    }

    public boolean ismLettuce() {
        return mLettuce;
    }

    public boolean ismTomato() {
        return mTomato;
    }

    public boolean ismOnion() {
        return mOnion;
    }

    public double getmToppingCost() {
        return mToppingCost;
    }

    public double getmBaseCost() {
        return mBaseCost;
    }

    public String getmBreadType() {
        return mBreadType;
    }

    public String getmMeat() {
        return mMeat;
    }
}
