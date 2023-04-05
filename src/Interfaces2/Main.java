package Interfaces2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person[] abductedByAliens = new Person[10];
        Citizen[] citizenOfHonor = new Citizen[10];
        Employee[] employeesOfMonth = new Employee[10];

        Rebel rebel = new Rebel(18,"Mike");
        abductedByAliens[0] = rebel;
//        citizenOfHonor[0] = rebel; --compile eror
//        employeesOfMonth[0] = rebel; --compile eror

        RomanianOmvWorker olivia = new RomanianOmvWorker();

        abductedByAliens[1] = olivia;
        citizenOfHonor[1] = olivia;
        employeesOfMonth[1] = olivia;
    }
}
