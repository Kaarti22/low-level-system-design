package com.sd.solidprinciples.LSP.BadCode;

public class Main {

    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.read(); // works fine
        file.write(); // throwing an exception, violating LSP
    }
}
