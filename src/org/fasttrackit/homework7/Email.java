package org.fasttrackit.homework7;

public class Email extends Facebook implements Adprovider{
    @Override
    public void advertise(String text) {
        System.out.println("Sending email with subject:" + text);
    }
}
