package com.javaservice.customer;

public record CustomerRequest(
        String firstName,
        String lastName,
        String email
) {
}
