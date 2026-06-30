package com.sd.basics.OOPS;

public class DebitCard extends Card implements PaymentMethod{
    public DebitCard(String cardNo, String cardName) {
        super(cardNo, cardName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Debit Card");
    }
}
