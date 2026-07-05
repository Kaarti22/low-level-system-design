package com.sd.solidprinciples.ISP.GoodCode;

import com.sd.solidprinciples.ISP.BadCode.Document;

public class MultiPurposeMachine implements Printer, Scanner, Copier{

    @Override
    public void print(Document doc) {
        System.out.println("Printing the document...");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scaning the document...");
    }

    @Override
    public void copy(Document doc) {
        System.out.println("Copying the document");
    }
}
