package com.sd.basics.OOPS;

abstract public class Card {

    private String cardNo;
    private String cardName;

    public Card(String cardNo, String cardName) {
        this.cardNo = cardNo;
        this.cardName = cardName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getCardName() {
        return cardName;
    }

    abstract void pay();
}
