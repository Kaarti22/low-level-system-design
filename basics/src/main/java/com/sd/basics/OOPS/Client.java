package com.sd.basics.OOPS;

public class Client {

    public static void main(String[] args) {
        PaymentService ps = new PaymentService();

        ps.addPaymentMethod("KartikeyaDebitCard", new DebitCard("1234", "Kartikeya"));
        ps.addPaymentMethod("KartikeyaCreditCard", new CreditCard("5678", "Kartikeya Mondi"));
        ps.addPaymentMethod("KartikeyaUPI", new UPI("kartikeya90"));
        ps.addPaymentMethod("KartikeyaWallet", new Wallet());

        ps.makePayment("KartikeyaUPI");
        ps.makePayment("KartikeyaCreditCard");

        ps.makePayment("KartikeyaWallet");
    }
}
