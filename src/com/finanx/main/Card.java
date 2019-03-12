package com.finanx.main;

public class Card {

    private final String CARDTYPE;
    private final String CARDNUM;
    private final String CARDEXP;


    public Card(String CARDTYPE, String CARDNUM, String CARDEXP) {
        this.CARDTYPE = CARDTYPE;
        this.CARDNUM = CARDNUM;
        this.CARDEXP = CARDEXP;
        //MAYBE SOME ADDITIONAL STUFF
    }


    /**
     * @return RETURNS CARD TYPE
     */
    public String getCardType() {
        return this.CARDTYPE;
    }

    /**
     * @return RETURNS CARD NUMBER
     */
    public String getCardNum() {
        return this.CARDNUM;
    }

    /**
     * @return RETURNS CARD EXPIRY DATE
     */
    public String getCardExp() {
        return this.CARDEXP;
    }


}
