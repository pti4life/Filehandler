package com.csaszarteam.fileuploader.database.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class AuthenticationTest {
    Authentication auth = new Authentication();

    @Test
    void loginTest() {
        auth.setName("greg");
        auth.setPassword("Securepwd");
        assertAll("login",
                () -> assertEquals("greg", auth.getName();),
                () -> assertEquals("Securepwd",  auth.getPassword();)
        );

        fail("Sikertelen teszt");
    }

}