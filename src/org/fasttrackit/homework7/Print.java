package org.fasttrackit.homework7;

public class Print extends Facebook implements Adprovider{
    @Override
    public void advertise(String text) {
        System.out.println("Printing in newspaper " + text);
    }
}
