package com.example.supermarket;

public class Supermarket {
    private int supermarketID;
    private String supermarketName;



    private String address;
    private int liquorDeptRate;
    private int produceDeptRate;
    private int meatDeptRate;
    private int cheeseSelRate;
    private int checkoutRate;

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

    public int getLiquorDeptRate() {
        return liquorDeptRate;
    }

    public void setLiquorDeptRate(int liquorDeptRate) {
        this.liquorDeptRate = liquorDeptRate;
    }

    public int getProduceDeptRate() {
        return produceDeptRate;
    }

    public void setProduceDeptRate(int produceDeptRate) {
        this.produceDeptRate = produceDeptRate;
    }

    public int getMeatDeptRate() {
        return meatDeptRate;
    }

    public void setMeatDeptRate(int meatDeptRate) {
        this.meatDeptRate = meatDeptRate;
    }

    public int getCheeseSelRate() {
        return cheeseSelRate;
    }

    public void setCheeseSelRate(int cheeseSelRate) {
        this.cheeseSelRate = cheeseSelRate;
    }

    public int getCheckoutRate() {
        return checkoutRate;
    }

    public void setCheckoutRate(int checkoutRate) {
        this.checkoutRate = checkoutRate;
    }

    public Supermarket(int supermarketID, String supermarketName, String address, int liquorDeptRate, int produceDeptRate, int meatDeptRate, int cheeseSelRate, int checkoutRate) {
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
    public Supermarket(String supermarketName, String address, int liquorDeptRate, int produceDeptRate, int meatDeptRate, int cheeseSelRate, int checkoutRate) {
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
