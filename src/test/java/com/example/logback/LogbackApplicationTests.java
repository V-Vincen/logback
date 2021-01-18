package com.example.logback;

import com.example.logback.testlogback.Foo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@Slf4j
@SpringBootTest
@ActiveProfiles("dev")
class LogbackApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void logTest() {
        log.debug("logback debug...");
        log.info("logback info..");
        log.warn("logback warn..");
        log.error("logback error..");
    }

    @Test
    public void fooTest() throws NoSuchMethodException {
        log.info("Entering application...");
        Foo foo = new Foo();
        foo.doIt();
        log.info("Exiting application...");
    }
}
