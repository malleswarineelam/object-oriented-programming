package com.java.oop.inheritance;

public class PremiumCustomer extends Customer {
    private boolean isPremium;
    private double premiumDiscount;

    public PremiumCustomer() {
    }

    public PremiumCustomer(String id, String name, String email, String contactNo, boolean isPremium, double premiumDiscount) {
        super(id, name, email, contactNo);
        this.isPremium = isPremium;
        this.premiumDiscount = premiumDiscount;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public double getPremiumDiscount() {
        return premiumDiscount;
    }

    public void setPremiumDiscount(double premiumDiscount) {
        this.premiumDiscount = premiumDiscount;


    }

    @Override
    public void displayCustomerDetails() {
        super.displayCustomerDetails();
        System.out.println("Is Premium: " + isPremium());
        System.out.println("Premium Discount: " + getPremiumDiscount());
    }
}
