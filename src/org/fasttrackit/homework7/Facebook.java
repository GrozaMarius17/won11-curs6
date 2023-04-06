package org.fasttrackit.homework7;

public class Facebook implements Adprovider{
    @Override
    public void advertise(String text) {
        System.out.println(" Posting " + text + " on facebook");
    }
}
