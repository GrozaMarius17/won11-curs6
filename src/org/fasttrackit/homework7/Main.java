package org.fasttrackit.homework7;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Facebook adProvider;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose where to advertise:");
        String adOption = scanner.nextLine();
        switch (adOption) {
            case "facebook" -> adProvider = new Facebook();
            case "email" -> adProvider = new Email();
            default -> adProvider = new Print();
        }
// ____________________
        adProvider.advertise("Buy new shiny thing!");
    }
}
