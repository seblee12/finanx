package com.finanx.main.java;

class Account {
    // Account Details
    public String accName;
    private Integer accNum;
    private Integer cardNum;
    private Integer cardExp;
    // Account Management
    private Double balance;

    // Account Identifier (for code)
    private Integer accId;

    // New Account Setter (required information)
    public Account(String accName, Integer accNum, Integer accId) {
        this.accName = accName;
        this.accNum = accNum;
        this.accId = accId;
    }

    // Account Getters
    public Integer getBal
}