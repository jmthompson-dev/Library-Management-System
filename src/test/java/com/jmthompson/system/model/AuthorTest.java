package com.jmthompson.system.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    private Author author;

    private String name = "Michael Johnson";
    private String description = "This is a description about the author.";

    @BeforeEach
    void setUp() {
        author = new Author(name, description);

    }

    @Test
    void getName_getValidName_returnsValidName() {
        // Given
        // When
        String result = author.getName();

        // Then
        assertNotNull(result);
        assertEquals(name, result);
    }

    @Test
    void setName_updateWithNewName_returnsNewName() {
        // Given
        // When
        author.setName("Jake Newnamo");
        String result = author.getName();

        // Then
        assertNotNull(result);
        assertNotEquals(name, result);
    }

    @Test
    void getDescription() {
        // Given
        // When
        String result = author.getDescription();

        // Then
        assertNotNull(result);
        assertEquals(description, result);

    }

    @Test
    void setDescription() {
        // Given
        // When
        author.setDescription("This is a new description.");
        String result = author.getDescription();

        // Then
        assertNotNull(result);
        assertNotEquals(description, result);
    }
}