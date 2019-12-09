package com.csaszarteam.fileuploader.database.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class AuthenticationTest {
    Authentication auth = new Authentication();

    @Test
    void loginTest() {
        auth.setName("greg");
        auth.setPassword("SuperSecurepwd");
        assertAll("login",
                () -> assertEquals("greg", auth.getName();,"Sikertelen teszt"),
                () -> assertEquals("SuperSecurepwd",  auth.getPassword();,"Sikertelen teszt")
        );
    }

    @Test
    void authTest() {
        auth.setDatabase("greg","SuperSecurepwd");

        assertEquals(auth.validate("greg","SuperSecurepwd"),"validalva");
    }
}