package com.api.utils;

import api.dto.CreateUserDTO;
import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Random;

public class TestData {
    public static CreateUserDTO createUser() {
        Faker faker = new Faker();
        return CreateUserDTO.builder()
                .name(faker.name().firstName())
                .job(faker.job().title())
                .build();
    }

    public static int randomNumber() {
        Random rand = new Random();
        return rand.nextInt(1000, 9999);
    }

    public static HashMap<String, Integer> statusCodes = new HashMap<>();
    static {
        statusCodes.put("ok", 200);
        statusCodes.put("created", 201);
        statusCodes.put("noContent", 204);
        statusCodes.put("notFound", 404);
    }
}
