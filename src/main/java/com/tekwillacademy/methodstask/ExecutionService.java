package com.tekwillacademy.methodstask;

import java.sql.SQLOutput;
import java.util.Random;

public class ExecutionService {


    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(150,350);
        System.out.println("Variabila randomInt: "+ randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("Variabila randomInt1: " +randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000.0);
        System.out.println("Variabila randomDouble: " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-1000.0);
        System.out.println("Variabila randomDouble: " + randomDouble1);

        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random  Email 1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random  Email 2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Rnadom Valid Strinf de X chars: " + DataGeneratorUtil.getRandomString(256));
        System.out.println("Rnadom Valid Strinf de X chars: " + DataGeneratorUtil.getRandomString(10));

        Customer ionCustomer = new Customer("Ion Stirbu", 26, "Ion.Boss@gmail.com");

        System.out.println("Nume obiect Ion: " + ionCustomer.getName());
        System.out.println("Age obiect Ion: " + ionCustomer.getAge());
        System.out.println("Email obiect Ion: " + ionCustomer.getEmail());

        ionCustomer.setName("Ion Brotacel");
        ionCustomer.setAge(1529);
        ionCustomer.setEmail("IonBrotacel@gmail.com");

        System.out.println("Nume obiect Ion: " + ionCustomer.getName());
        System.out.println("Age obiect Ion: " + ionCustomer.getAge());
        System.out.println("Email obiect Ion: " + ionCustomer.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.getRandomString(12),DataGeneratorUtil.getRandomInt(0,127),
                DataGeneratorUtil.getRandomEmail());
        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.getRandomString(6));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(18,64));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());

    }
}
