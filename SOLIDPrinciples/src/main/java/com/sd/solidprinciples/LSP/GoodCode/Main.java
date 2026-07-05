package com.sd.solidprinciples.LSP.GoodCode;

public class Main {

    public static void readAnyFile(ReadableFile file){
        file.read();
    }

    public static void main(String[] args) {
        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();

        WriteableFile writeableFile = new WriteableFile();
        writeableFile.read();
        writeableFile.write();

        readAnyFile(readableFile);
        readAnyFile(writeableFile);
    }
}
