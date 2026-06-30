package com.sd.basics.OOPS;

public class UPI implements PaymentMethod{

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    String upiId;

    @Override
    public void pay() {
        System.out.println("Making payment via UPI " + upiId);
    }
}
