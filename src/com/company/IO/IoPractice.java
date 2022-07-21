package com.company.IO;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class IoPractice {

    public static boolean createFile() throws IOException {

        File file = new File("test.txt");
        return file.createNewFile();

    }

    public static void writeToFileUsingOutputStream() throws IOException {

        String thingToWrite = "Java is fun until you are understanding";

        FileOutputStream fos = new FileOutputStream("test.txt");

        System.out.println("Writing to file");
        fos.write(thingToWrite.getBytes());
        fos.close();

    }

    public static void writeToFileUsingFileWriter() throws IOException {
        String thingToWrite = ", The Office show is my favorite";

        FileWriter fw = new FileWriter("test.txt",true);

        System.out.println("Writing to file");
        fw.write(thingToWrite);
        fw.close();

    }

    public static void readUsingFileInputStream() throws IOException {

        FileInputStream fis = new FileInputStream("test.txt");
        byte[]  bytes = new byte[100];
        fis.read(bytes);
        System.out.println("Content of file :" + new String(bytes, StandardCharsets.UTF_8));
    }

    public static void readUsingFileReader() throws IOException {

        FileReader fr = new FileReader("test.txt");
        char[] charArray = new char[100];
        fr.read(charArray);
        System.out.println("Content of file :" + new String(charArray));
    }


    public static void main(String[] args) {

        try {

            if(createFile()) System.out.println("Successfully created file");
            writeToFileUsingOutputStream();
            writeToFileUsingFileWriter();
            readUsingFileInputStream();
            readUsingFileReader();

            File file = new File("test.txt");
            if (file.delete()) System.out.println("deleted");

        } catch (IOException e){

            System.out.println(e.getMessage());

        }

    }



}
