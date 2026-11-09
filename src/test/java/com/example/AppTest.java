
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void shouldReturnGreeting() {
        App app = new App();

        assertEquals("Hello, Jenkins!", app.greet("Jenkins"));
    }
}
