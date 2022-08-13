package testdata;

import models.NewAccountModel;
import utils.FakeMessageGenerator;

public class PrepareNewAccountData {

    public static NewAccountModel getValidData() {
        return NewAccountModel
                .builder()
                .accountName(FakeMessageGenerator.generateAccountName())
                .phone(FakeMessageGenerator.generatePhone())
                .fax(FakeMessageGenerator.generateFax())
                .website(FakeMessageGenerator.generateWebsite())
                .employees(FakeMessageGenerator.generateEmployees())
                .annualRevenue(FakeMessageGenerator.generateAnnualRevenue())
                .type("Analyst")
                .industry("Apparel")
                .description(FakeMessageGenerator.generateDescription())
                .billingStreet(FakeMessageGenerator.generateBillingStreet())
                .shippingStreet(FakeMessageGenerator.generateShippingStreet())
                .billingCity(FakeMessageGenerator.generateBillingCity())
                .billingStateProvince(FakeMessageGenerator.generateBillingStateProvince())
                .billingZipPostalCode(FakeMessageGenerator.generateBillingZipPostalCode())
                .billingCountry(FakeMessageGenerator.generateBillingCountry())
                .shippingCity(FakeMessageGenerator.generateShippingCity())
                .shippingStateProvince(FakeMessageGenerator.generateShippingStateProvince())
                .shippingZipPostalCode(FakeMessageGenerator.generateShippingZipPostalCode())
                .shippingCountry(FakeMessageGenerator.generateShippingCountry())
                .build();
    }
}
