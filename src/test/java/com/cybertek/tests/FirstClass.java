package com.cybertek.tests;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

import static com.github.javafaker.CreditCardType.AMERICAN_EXPRESS;

public class FirstClass {


    public static void main(String[] args) {

        System.out.println("Hello World");

        Faker faker = new Faker();

        System.out.println(faker.name().fullName());

        System.out.println(faker.harryPotter().character());

    }
}
