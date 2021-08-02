package org.kang.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author kang
 * @date 2021/7/28 11:22
 */
@SpringBootTest
class MainTest {
    @Test
    public void testBooleanTrue() {
        assertTrue(Boolean.TRUE);
    }
}