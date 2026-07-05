package com.sd.solidprinciples.ISP.GoodCode;

import com.sd.solidprinciples.ISP.BadCode.Document;

public class SimplePrinter implements Printer{
    @Override
    public void print(Document doc) {
        System.out.println("Printing document...");
    }
}
