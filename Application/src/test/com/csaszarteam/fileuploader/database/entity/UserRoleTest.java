package com.csaszarteam.fileuploader.database.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRoleTest {

    UserRole userRole = new UserRole();

    @Test
    void getId() {
        userRole.setId(150);

        assertEquals(150, userRole.getId());
    }

    @Test
    void getAuthority() {
        userRole.setAuthority("asd");

        assertEquals("asd", userRole.getAuthority());
    }
}