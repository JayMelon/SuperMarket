package com.example.supermarket;

public class Supermarket {
    private int supermarketID;
    private String supermarketName;
    private String address;
    private float liquorDeptRate;
    private float produceDeptRate;
    private float meatDeptRate;
    private float cheeseSelRate;
    private float checkoutRate;

    public int getSupermarketID() {
        return supermarketID;
    }

    public void setSupermarketID(int supermarketID) {
        this.supermarketID = supermarketID;
    }

    public String getSupermarketName() {
        return supermarketName;
    }

    public void setSupermarketName(String supermarketName) {
        this.supermarketName = supermarketName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getLiquorDeptRate() {
        return liquorDeptRate;
    }

    public void setLiquorDeptRate(float liquorDeptRate) {
        this.liquorDeptRate = liquorDeptRate;
    }

    public float getProduceDeptRate() {
        return produceDeptRate;
    }

    public void setProduceDeptRate(float produceDeptRate) {
        this.produceDeptRate = produceDeptRate;
    }

    public float getMeatDeptRate() {
        return meatDeptRate;
    }

    public void setMeatDeptRate(float meatDeptRate) {
        this.meatDeptRate = meatDeptRate;
    }

    public float getCheeseSelRate() {
        return cheeseSelRate;
    }

    public void setCheeseSelRate(float cheeseSelRate) {
        this.cheeseSelRate = cheeseSelRate;
    }

    public float getCheckoutRate() {
        return checkoutRate;
    }

    public void setCheckoutRate(float checkoutRate) {
        this.checkoutRate = checkoutRate;
    }

    public Supermarket(int supermarketID, String supermarketName, String address, float liquorDeptRate, float produceDeptRate, float meatDeptRate, float cheeseSelRate, float checkoutRate) {
        this.supermarketID = supermarketID;
        this.supermarketName = supermarketName;
        this.address = address;
        this.liquorDeptRate = liquorDeptRate;
        this.produceDeptRate = produceDeptRate;
        this.meatDeptRate = meatDeptRate;
        this.cheeseSelRate = cheeseSelRate;
        this.checkoutRate = checkoutRate;
    }
    public Supermarket(){

    }
    public Supermarket(String supermarketName, String address, float liquorDeptRate, float produceDeptRate, float meatDeptRate, float cheeseSelRate, float checkoutRate) {
        this.supermarketName = supermarketName;
        this.address = address;
        this.liquorDeptRate = liquorDeptRate;
        this.produceDeptRate = produceDeptRate;
        this.meatDeptRate = meatDeptRate;
        this.cheeseSelRate = cheeseSelRate;
        this.checkoutRate = checkoutRate;
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "supermarketID=" + supermarketID +
                ", supermarketName='" + supermarketName + '\'' +
                ", address='" + address + '\'' +
                ", liquorDeptRate=" + liquorDeptRate +
                ", produceDeptRate=" + produceDeptRate +
                ", meatDeptRate=" + meatDeptRate +
                ", cheeseSelRate=" + cheeseSelRate +
                ", checkoutRate=" + checkoutRate;
    }

    }
