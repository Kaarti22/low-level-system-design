package com.sd.solidprinciples.ISP.BadCode;

public class MultiPurposeMachine implements Machine{
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
