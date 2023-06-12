package com.example.imperial;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ImperialApplicationTests {

    Implementation sut = new Implementation();

    @Test
    public void ouncesToGram() {

        var result = sut.ouncesToGram(1);

        var expected = 28.35;

        assertEquals(expected, result);
    }

}
