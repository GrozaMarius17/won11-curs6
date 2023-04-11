package org.fasttrackit.curs10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main(String[] args) throws FileNotFoundException {
        readNumber();
    }

    private static void readNumber() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files", "content.txt"));
        while(scanner.hasNext()){
            System.out.println(scanner.nextInt());
        }
    }
    private static  void  readFullFile() throws FileNotFoundException{
        Scanner s = new Scanner(new File("files","content.txt"));
        while(s.hasNext()) {
            System.out.println(s.nextLine());
        }
    }

    private static void readOneLine() throws FileNotFoundException {
        Scanner scanner = new   Scanner(new File("files", "content.txt"));
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
    }
}
