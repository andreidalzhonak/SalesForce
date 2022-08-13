package utils;

import com.github.javafaker.Faker;

public class FakeMessageGenerator {
    public static String generateAccountName() {

        return new Faker().company().name();
    }

    public static String generatePhone() {
        return new Faker().phoneNumber().phoneNumber();
    }

    public static String generateFax() {
        return new Faker().phoneNumber().phoneNumber();
    }
    public static String generateWebsite() {
        return new Faker().internet().url();
    }
    public static String generateEmployees() {
        return String.valueOf(new Faker().number().randomNumber());
    }
    public static String generateAnnualRevenue() {
        return String.valueOf(new Faker().number().randomNumber());
    }
    public static String generateDescription() {
        return new Faker().company().catchPhrase();
    }
    public static String generateBillingStreet() {
        return new Faker().address().streetAddress();
    }

    public static String generateShippingStreet() {
        return new Faker().address().streetAddress();
    }

    public static String generateBillingCity() {
        return new Faker().address().cityName();
    }
    public static String generateBillingStateProvince() {
        return new Faker().address().cityName();
    }
    public static String generateBillingZipPostalCode() {
        return new Faker().address().countryCode();
    }
    public static String generateBillingCountry() {
        return new Faker().address().country();
    }
    public static String generateShippingCity() {
        return new Faker().address().cityName();
    }
    public static String generateShippingStateProvince() {
        return new Faker().address().cityName();
    }
    public static String generateShippingZipPostalCode() {
        return new Faker().address().countryCode();
    }
    public static String generateShippingCountry() {
        return new Faker().address().country();
    }

}
