package com.github.SvetlanaVasilyuk;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Tag("ComplexTests")
@DisplayName("Сложные тесты")
public class ComplexTest {

    private static final Logger LOG = LoggerFactory.getLogger(ComplexTest.class);

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

    @DisplayName("Первый сложный тест")
    @Test
    void complexTest1() {
        LOG.info("Test1 is completed");
    }

    @DisplayName("Второй сложный тест")
    @Test
    void complexTest2() {
        LOG.info("Test2 is completed");
    }

}