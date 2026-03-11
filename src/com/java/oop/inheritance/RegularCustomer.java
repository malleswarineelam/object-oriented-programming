package com.java.oop.inheritance;

public class RegularCustomer extends Customer{
    //Base -> Derived
//Parent -> Child
//Super -> Sub
    //
    int rewardPoints;
    int totalOrders;
    int regularDiscount;
    RegularCustomer(){
        //id, name, email, contactNo (memory)
        super();
    }

    RegularCustomer(int rewardPoints, int totalOrders){
        super();
        this.rewardPoints = rewardPoints;
        this.totalOrders = totalOrders;
    }

    public RegularCustomer(String id, String name, String email, String contactNo, int rewardPoints, int totalOrders, int regularDiscount) {
        super(id, name, email, contactNo);
        this.rewardPoints = rewardPoints;
        this.totalOrders = totalOrders;
        this.regularDiscount = regularDiscount;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

    public int getRegularDiscount() {
        return regularDiscount;
    }

    public void setRegularDiscount(int regularDiscount) {
        this.regularDiscount = regularDiscount;
    }

    @Override
    public void displayCustomerDetails(){
        super.displayCustomerDetails();
        System.out.println("Reward Points: "+getRewardPoints());
        System.out.println("Total Orders: "+getTotalOrders());
        System.out.println("Regular Discount: "+getRegularDiscount());
    }
}
