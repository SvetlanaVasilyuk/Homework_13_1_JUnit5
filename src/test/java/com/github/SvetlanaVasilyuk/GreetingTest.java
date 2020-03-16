package com.github.SvetlanaVasilyuk;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

import static com.github.SvetlanaVasilyuk.Greeting.personalGreet;
import static com.github.SvetlanaVasilyuk.Greeting.simpleGreet;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GreetingTest {

    private static final Logger LOG = LoggerFactory.getLogger(GreetingTest.class);

    @Test
    public void simpleGreetTest() {
        LOG.info("Выполняется простой тест");
        LOG.info("Приветствие: \"" + simpleGreet() + "\"");
        Assertions.assertEquals(simpleGreet(), "Приветствую!", "Приветствие некорректно");
        LOG.info("Простой тест завершен");
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWithExplicitLocalMethodSource(String name, String surname) {
        LOG.info("Выполняется параметризованный тест");
        String greetingAct = personalGreet(name, surname);
        String greetingExp = String.format("Приветствую, %s %s!", name, surname);
        LOG.info("Приветствие: \"" + greetingAct + "\"");
        Assertions.assertEquals(greetingAct, greetingExp, "Приветствие некорректно");
        LOG.info("Параметризованный тест завершен");
    }

    static Stream<Arguments> stringProvider() {
        return Stream.of(
                arguments("Петр", "Николаев"),
                arguments("Ирина", "Дмитриева")
        );
    }
}