package com.sd.basics.OOPS;

public class CreditCard extends Card{
    public CreditCard(String cardNo, String cardName) {
        super(cardNo, cardName);
    }

    @Override
    void pay() {
        System.out.println("Making payment via Credit Card");
    }
}
