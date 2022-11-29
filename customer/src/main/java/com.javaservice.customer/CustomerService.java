package com.javaservice.customer;

public record CustomerService() {

    public void create(CustomerRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

    }

}
