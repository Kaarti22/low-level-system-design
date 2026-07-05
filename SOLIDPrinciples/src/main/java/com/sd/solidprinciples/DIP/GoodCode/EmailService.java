package com.sd.solidprinciples.DIP.GoodCode;

public class EmailService implements NotificationChannel
{
    @Override
    public void send(String message) {
        System.out.println("Sending email " + message);
    }
}
