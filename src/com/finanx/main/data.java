package com.finanx.main;

// Bank Account Object
class Account {
    // Account Details
    public String accName;
    private Integer accNum;
    private Double balance;
    // Account Objects
    private List<Card> cards = new ArrayList<Card>();
    private List<User> users = new ArrayList<User>();
    // Account Identifier (for code)
    private Integer accId;

    // New Account Constructor (required information)
    Account() {
        this.accName = undefined;
        this.accNum = 0;
        this.balance = 0;
        this.accId = 00;
    }
    Account(String accName, Integer accNum, Integer custId, Integer accId) {
        this.accName = accName;
        this.accNum = accNum;
        this.balance = 0;
        this.accId = custId*100+accId;
    }

    // Account Getters
    public Integer getAccNum() {
        return this.accNum;
    }
    public Integer getCardNumLength() {  // returns card number length
        return String.valueOf(this.cardNum).length();
    }
    public Integer getAccID () {
        return this.accId;
    }

    // Account Setters
    public void setAccNum(Integer accNum) {
        this.accNum = accNum;
    }

    // Bank Commands
    public Boolean canDebit(double outflow) {
        return this.balance >= outflow;
    }

    public String debit(double outflow) {
        if (canDebit(outflow)) {
            this.balance -= outflow;
            return "$" + outflow + " successfully debited from account";
        }
        else {
            return "%" + outflow + " cannot be debited due to insufficient funds!";
        }

    }
    public credit(double inflow) {
        this.balance += outflow;
    }

    // Card Operations
    public newCard(Integer cardType, Integer cardNum, Integer cardExp) {

        this.cards.add(new Card(cardType, cardNum, cardExp, this.accId, cardId));
    }

    // User Operations
    public newUser(I)
}

// Bank Card
class Card {
    public String cardType;
    private Integer cardNum;
    private Integer cardExp;
    // Card Identifier (contains Account and Customer Info)
    private Integer cardId;

    // Constructor (required info)
    Card(String cardType, Integer cardNum, Integer cardExp, Integer accId, Integer cardId) {
        this.cardType = cardType;
        this.cardNum = cardNum;
        this.cardExp = cardExp;
        this.cardId = accId*100+cardId;
    }

    // Getters and Setters
    public Integer getCardNumLength() {
        return String.valueof(this.cardNum).length();
    }
    public Integer getCardNum() {  // returns last 4 digits of card number
        Integer length = getCardNumLength();
        return (this.cardNum%(10*(length-4)));
    }
    public Integer getCardNum_ () {  // returns full card number
        return this.cardNum;
    }
    public Integer getCardExp () {
        return this.cardExp;
    }
    public Integer getCardId () {
        return this.cardId;
    }

}


