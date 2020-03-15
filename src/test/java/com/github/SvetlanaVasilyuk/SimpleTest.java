package com.github.SvetlanaVasilyuk;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Tag("SimpleTests")
@DisplayName("Простые тесты")
public class SimpleTest {

    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

    @BeforeAll
    static void beforeAll(){
        LOG.info("Before all tests");
    }

    @BeforeEach
    void beforeEach(){
        LOG.info("Before each test");
    }

    @AfterAll
    static void afterAll(){
        LOG.info("After all tests");
    }

    @AfterEach
    void afterEach(){
        LOG.info("After each test");
    }

    @DisplayName("Первый простой тест")
    @Test
    void simpleTest1() {
        LOG.info("Test1 is completed");
    }

    @DisplayName("Второй простой тест")
    @Test
    void simpleTest2() {
        LOG.info("Test2 is completed");
    }

}
